package Montagut.Albert.View;

import Montagut.Albert.Exceptions.SquadError;
import Montagut.Albert.IORaikishSenpai;

import java.util.Arrays;
import java.util.List;

public class Main {

    static List<String> parameter;

    public static void main(String[] args) {
        ReadInputUserAndSplit();
        checkUserInput();
        selectOption();


    }

    private static void ReadInputUserAndSplit(){
        String userParameter = IORaikishSenpai.askString("");

        //separate user string in String array with the space separator
        parameter = Arrays.asList(userParameter.split(" ")); //space separator
    }

    private static void checkUserInput(){
        //dunno if i gonna use this
    }

    private static void selectOption() {

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
                    break;
                default:
                    throw new SquadError(" < ERROR 004: Operación incorrecta > ");
            }
        }catch (SquadError msg){
            System.out.println(msg);
        }

    }

    private static void showLadderBoard() {

    }

    private static void upgradeSquad() {

    }

    //todo add to library
    //@return if the string could be parsed to int

    public static boolean isParsable(String input){
        try{
            Integer.parseInt(input);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }


    private static void registerSquad(){
        String especie = parameter.get(1);
        try {
            switch (especie) {
                case "terran":
                    //i need to check the size of the parameter array because they have different constructor parameters size
                    if(parameter.size() != 7){ throw new SquadError(" < ERROR 001: Nº de argumentos inválido >  ");}
                    String nombre = parameter.get(2);
                    // check if parameters of user are correct
                    try {
                        if (isParsable(parameter.get(3)) && Integer.parseInt(parameter.get(3)) >= 0){
                            int ataque = Integer.parseInt(parameter.get(3));
                        }else{
                            throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                        }
                    }catch (SquadError msg){
                        System.out.println(msg);
                    }

                    for (int i = 3; i < 7;i++){
                        try {
                            if (isParsable(parameter.get(4)) && Integer.parseInt(parameter.get(4)) >= 0){
                                int ataque = Integer.parseInt(parameter.get(3));
                            }else{
                                throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                            }
                        }catch (SquadError msg){
                            System.out.println(msg);
                        }
                    }

                    //todo crear metodo que haga 4 veces lo de arriba con las diferentes variables
                    //pasandoles estas y comprovando si no es menor que 0 y son int




                    for (String a: parameter) {
                        if(isParsable(a)){

                        }

                    }



                                    //defensa
                                    //edificios
                                    //tecnologia

                    /*
                    TODO Check this staff
                    < ERROR 003: Dato incorrecto >
                    Un dato es incorrecto si es incoherente (número debe ser positiv o, por ejemplo).
                    < ERROR 007: Ya existe un escuadrón con ese nombre >
                    And create a squad
                     */


                    break;
                case "zerg":
                    if(parameter.size() != 7){throw new SquadError(" < ERROR 001: Nº de argumentos inválido >  ");}


                    break;
                case "protoss":
                    if(parameter.size() != 6){throw new SquadError(" < ERROR 001: Nº de argumentos inválido >  ");}


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
