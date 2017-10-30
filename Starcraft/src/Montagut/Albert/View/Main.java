package Montagut.Albert.View;

import Montagut.Albert.Entities.Especie;
import Montagut.Albert.Entities.Protoss;
import Montagut.Albert.Entities.Terran;
import Montagut.Albert.Entities.Zerg;
import Montagut.Albert.Exceptions.SquadError;
import Montagut.Albert.IORaikishSenpai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static List<String> parameter = new ArrayList<String>();
    static List<Especie> esquadrones;

    public static void main(String[] args) {
        boolean exit = false;
        esquadrones = new ArrayList<Especie>();
        do {
            ReadInputUserAndSplit();
            exit = selectOption();
        }while(!exit);

    }

    private static void ReadInputUserAndSplit(){
        parameter = null;
        String userParameter = IORaikishSenpai.askString("");

        //separate user string in String array with the space separator
        parameter = Arrays.asList(userParameter.split(" ")); //space separator
    }

    private static void checkUserInput(){
        //dunno if i gonna use this
    }

    private static boolean selectOption() {

        String option = parameter.get(0);
        try {
            switch (option) {
                case "A":
                    registerSquad();
                    break;
                case "R":
                    registerBattle(); //todo need implementation
                    break;
                case "M":
                    upgradeSquad(); //todo need implementation
                case "C":
                    showLadderBoard(); //todo need implementation
                    break;
                case "S":
                    return true;
                default:
                    throw new SquadError(" < ERROR 004: Operación incorrecta > ");
            }
        }catch (SquadError msg){
            System.out.println(msg);
        }
        return false;

    }

    private static void showLadderBoard() {

    }

    private static void upgradeSquad() {

    }

    //todo add to library
    //@return true if the string could be parsed to int

    public static boolean isParsable(String input){
        try{
            Integer.parseInt(input);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }


    private static boolean CheckIntValue(int iterator){
        if (isParsable(parameter.get(iterator)) && Integer.parseInt(parameter.get(iterator)) >= 0) {
            return true;
        } else{
            return false;
        }
    }

    private static void checkSizeParameter(int size) throws SquadError {
        if(parameter.size() != size){ throw new SquadError(" < ERROR 001: Nº de argumentos inválido >  ");}
    }
    
    private static boolean checkRepeatSquad(String name){
        if (esquadrones.size() != 0) {
            for (Especie squad : esquadrones) {
                if (squad.getNombre().equals(name) ) {
                    return true;
                }
            }
        }
        return false;

    }

    private static void registerSquad(){
        String especie = parameter.get(1);
        try {
            int ataque = 0, defensa = 0; //default values, this gonna change
            String nombre = parameter.get(2);
            if (checkRepeatSquad(nombre)){
                throw new SquadError(" <  ERROR 007: Ya existe un escuadrón con ese nombre > ");
            }
            switch (especie) {
                case "terran":
                    //i need to check the size of the parameter array because they have different constructor parameters size
                    checkSizeParameter(7);
                    int edificio = 0, tecnologia = 0;
                    // check if parameters of user are correct
                    try {
                        for (int i = 3; i < 7;i++) {
                            switch (i) {
                                case 3:
                                    if (CheckIntValue(i)) { //TODO I think i can refactor this
                                        ataque = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                 break;
                                case 4:
                                    if (CheckIntValue(i)) {
                                        defensa = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                break;
                                case 5:
                                    if (CheckIntValue(i)) {
                                        edificio = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                break;
                                case 6:
                                    if (CheckIntValue(i)) {
                                        tecnologia = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                break;
                            }
                        }
                        Terran newTerran = new Terran(nombre, ataque, defensa, edificio, tecnologia);

                        if(newTerran != null) {
                            System.out.println( " <OK: Escuadrón registrado> ");
                            esquadrones.add(newTerran);
                        }

                    }catch (SquadError msg){
                        System.out.println(msg);
                    }

                    break;
                case "zerg":
                    checkSizeParameter(7);
                    int esbirro = 0, overlord = 0;
                    // check if parameters of user are correct
                    try {
                        for (int i = 3; i < 7;i++) {
                            switch (i) {
                                case 3:
                                    if (CheckIntValue(i)) { //TODO I think i can refactor this
                                        ataque = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                    break;
                                case 4:
                                    if (CheckIntValue(i)) {
                                        defensa = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                    break;
                                case 5:
                                    if (CheckIntValue(i)) {
                                        esbirro = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                    break;
                                case 6:
                                    if (CheckIntValue(i)) {
                                        overlord = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                    break;
                            }
                        }
                        Zerg newZerg = new Zerg(nombre, ataque, defensa, esbirro, overlord);
                        if(newZerg != null) {
                            System.out.println( " <OK: Escuadrón registrado> ");
                            esquadrones.add(newZerg);
                        }
                    }catch (SquadError msg){
                        System.out.println(msg);
                    }


                    break;
                case "protoss":
                    checkSizeParameter(6);
                    int pilon = 0;
                    // check if parameters of user are correct
                    try {
                        for (int i = 3; i < 7;i++) {
                            switch (i) {
                                case 3:
                                    if (CheckIntValue(i)) { //TODO I think i can refactor this
                                        ataque = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                    break;
                                case 4:
                                    if (CheckIntValue(i)) {
                                        defensa = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                    break;
                                case 5:
                                    if (CheckIntValue(i)) {
                                        esbirro = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                    break;
                            }
                        }
                        Protoss newProtoss = new Protoss(nombre, ataque, defensa, pilon);
                        if(newProtoss != null) {
                            System.out.println( " <OK: Escuadrón registrado> ");
                            esquadrones.add(newProtoss);
                        }

                    }catch (SquadError msg){
                        System.out.println(msg);
                    }


                    break;
                default:
                    throw new SquadError(" < ERROR 002: Especie incorrecta > ");
            }
        }catch (SquadError msg){
            System.out.println(msg);
        }
    }

    private static void registerBattle(){

    }
}
