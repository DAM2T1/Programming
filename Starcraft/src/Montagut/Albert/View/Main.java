package Montagut.Albert.View;

import Montagut.Albert.Entities.Especie;
import Montagut.Albert.Entities.Protoss;
import Montagut.Albert.Entities.Terran;
import Montagut.Albert.Entities.Zerg;
import Montagut.Albert.Exceptions.SquadError;
import Montagut.Albert.IORaikishSenpai;

import java.util.*;

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

    private static boolean selectOption() {

        String option = parameter.get(0);
        try {
            switch (option) {
                case "A":
                    registerSquad();
                    break;
                case "R":
                    registerBattle(); //todo refactor
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

    //todo add to library
    //@return true if the string could be parsed to int

    private static boolean isParsable(String input){
        try{
            Integer.parseInt(input);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }


    private static boolean checkIntValue(int iterator){
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

    private static void upgradeSquad() {
       try {
           checkSizeParameter(4);
           String nombreEsquadron1 = parameter.get(1);
           String propiedadAMejorar = parameter.get(2);
           String nuevoDato = parameter.get(3); //pasar a int
           if (!checkIntValue(3)){
               throw new SquadError("< ERROR 003: Dato incorrecto >");
           }
           Especie escuadron1 = null;
           for (Especie squad: esquadrones) {
               if (squad.getNombre().equals(nombreEsquadron1) )
               {
                   if(squad instanceof Terran) {
                       escuadron1 = (Terran) squad;
                   } else if ( squad instanceof Protoss){
                       escuadron1 = (Protoss) squad;
                   }else if(squad instanceof Zerg){
                       escuadron1 = (Zerg) squad;
                   }
               }
           }

           if(escuadron1.getClass().getSimpleName().equals("Terran")){
                switch (propiedadAMejorar){
                    case "edificios":
                        ((Terran)escuadron1).setEdificio(Integer.parseInt(nuevoDato));
                        break;
                    case "armas":
                        ((Terran)escuadron1).setArma(Integer.parseInt(nuevoDato));
                        break;
                    default:
                        throw new SquadError("< ERROR 006: Propiedad incorrecta>");
                }
            }else if(escuadron1.getClass().getSimpleName().equals("Protoss")){
               switch (propiedadAMejorar){
                   case "pilones":
                       ((Protoss)escuadron1).setPilones(Integer.parseInt(nuevoDato));
                       break;
                   default:
                       throw new SquadError("< ERROR 006: Propiedad incorrecta>");
               }
            }else if(escuadron1.getClass().getSimpleName().equals("Zerg")){
               switch (propiedadAMejorar){
                   case "numEsbirros":
                       ((Zerg)escuadron1).setNumEsbirro(Integer.parseInt(nuevoDato));
                       break;
                   case "overlords":
                       ((Zerg)escuadron1).setOverlord(Integer.parseInt(nuevoDato));
                       break;
                   default:
                       throw new SquadError("< ERROR 006: Propiedad incorrecta>");
               }
           }
           System.out.println("<OK: Propiedad mejorada>");
       }catch (SquadError msg){
           System.out.println(msg);
       }
    }

    private static void showLadderBoard() {
        try {
            if (esquadrones.isEmpty()){
                System.out.println("< CLASIFICACION: No hay escuadrones registrados >");
                return;
            }
            checkSizeParameter(1);
            Collections.sort(esquadrones, new Comparator<Especie>() {
                @Override
                public int compare(Especie squad1, Especie squad2) {
                    return new Integer(squad2.getNumVict()).compareTo(new Integer(squad1.getNumVict()));
                }
            });
            System.out.println("< CLASIFICACION ACTUAL >");
            Especie escuadron1 = null;
            int aux = 0;
            for (Especie squad: esquadrones) {
                aux++;
                if (aux > 3){return;}
                if(squad instanceof Terran) {
                    escuadron1 = (Terran) squad;
                    System.out.println(escuadron1.toString());
                } else if ( squad instanceof Protoss){
                    escuadron1 = (Protoss) squad;
                    System.out.println(escuadron1.toString());
                }else if(squad instanceof Zerg){
                    escuadron1 = (Zerg) squad;
                    System.out.println(escuadron1.toString());
                }
            }
        } catch (SquadError msg) {
            System.out.println(msg);
        }

    }

    private static void registerBattle(){
        try {
            //check size parameter
            checkSizeParameter(3);
            String nombreEsquadron1 = parameter.get(1);
            String nombreEsquadron2 = parameter.get(2);
            //check if the squad not exist
            if(!checkRepeatSquad(nombreEsquadron1) || !checkRepeatSquad(nombreEsquadron2)){
                throw new SquadError(" <  ERROR 005: No existe especie con ese nombre > ");
            }

            Especie escuadron1 = null, escuadron2 = null;

            for (Especie squad: esquadrones) {
                if (squad.getNombre().equals(nombreEsquadron1) )
                {
                    escuadron1 = squad;
                }
                else if (squad.getNombre().equals(nombreEsquadron2) )
                {
                    escuadron2 = squad;
                }
            }
            double ataqueSquad1 =  escuadron1.calcAtk();
            double defensaSquad1 = escuadron1.calcDef();
            double ataqueSquad2 = escuadron2.calcAtk();
            double defensaSquad2 = escuadron2.calcDef();

            int winPlayer1 = 0;
            int winPlayer2 = 0;
            System.out.println("<Inicio batalla...>");
            for (int i = 0; i < 5; i++) {
                int randomSquad1 = (int) (Math.random() * 10);
                int randomSquad2 = (int) (Math.random() * 10);
                double totalDamageSquad1 = (randomSquad1 + ataqueSquad1 ) - defensaSquad2;
                double totalDamageSquad2 = (randomSquad2 + ataqueSquad2) - defensaSquad1;
                System.out.println("Asalto nº" + (i+1));
                System.out.println("Ataca " + nombreEsquadron1 + " - Nº Aleatorio: " + randomSquad1 + " - valor de ataque: " + totalDamageSquad1);
                System.out.println("Ataca " + nombreEsquadron2 + " - Nº Aleatorio: " + randomSquad2 + " - valor de ataque: " + totalDamageSquad2);

                if(totalDamageSquad1 > totalDamageSquad2){
                    System.out.println("Ganador del asalto:" + nombreEsquadron1);
                    winPlayer1++;
                }else if(totalDamageSquad2 > totalDamageSquad1){
                    System.out.println("Ganador del asalto:" + nombreEsquadron2);
                    winPlayer2++;
                }else if(totalDamageSquad1 == totalDamageSquad2){
                    System.out.println("Empate");
                }
            }
            String winner = null ;
            int winnerAssault = 0;
            System.out.println("< Fin de la batalla...>");
            if (winPlayer1 > winPlayer2){
                winnerAssault = winPlayer1;
                winner = nombreEsquadron1;
                escuadron1.pluseOneVictory();
            }else if(winPlayer2 > winPlayer1){
                winnerAssault = winPlayer2;
                winner = nombreEsquadron2;
                escuadron2.pluseOneVictory();
            }
            if (winner != null) {
                System.out.println("< OK: La batalla la ha ganado el escuadron " + winner + " con " + winnerAssault + " Asaltos ");
            }else{
                System.out.println("< OK: La batalla ha acabado en empate");
            }
        } catch (SquadError msg) {
            System.out.println(msg);
        }
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
                                    if (checkIntValue(i)) { //TODO I think i can refactor this i can do that in the class construc and setter
                                        ataque = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                 break;
                                case 4:
                                    if (checkIntValue(i)) {
                                        defensa = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                break;
                                case 5:
                                    if (checkIntValue(i)) {
                                        edificio = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                break;
                                case 6:
                                    if (checkIntValue(i)) {
                                        tecnologia = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                break;
                            }
                        }
                        Terran newTerran = new Terran(nombre, ataque, defensa, edificio, tecnologia);
                        // todo preguntar como podria hacer para que si no ha ido bien la creacion del objeto  salte un error

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
                    // Parsable to int && not negative
                    try {
                        for (int i = 3; i < 7;i++) {
                            switch (i) {
                                case 3:
                                    if (checkIntValue(i)) { //TODO I think i can refactor this
                                        ataque = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                    break;
                                case 4:
                                    if (checkIntValue(i)) {
                                        defensa = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                    break;
                                case 5:
                                    if (checkIntValue(i)) {
                                        esbirro = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                    break;
                                case 6:
                                    if (checkIntValue(i)) {
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
                                    if (checkIntValue(i)) { //TODO I think i can refactor this
                                        ataque = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                    break;
                                case 4:
                                    if (checkIntValue(i)) {
                                        defensa = Integer.parseInt(parameter.get(i));
                                    } else {
                                        throw new SquadError(" < ERROR 003: Dato incorrecto > ");
                                    }
                                    break;
                                case 5:
                                    if (checkIntValue(i)) {
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

}
