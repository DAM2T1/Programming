package Controller;

import Exception.PokemonException;
import Model.Agua;
import Model.Fuego;
import Model.Planta;
import Model.Pokemon;
import View.MainMenu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 * @author Albert Montagut Casero <AlbertMontagutCasero.com>
 */
public class Controller
{

    private static Map<String, Pokemon> pokemonMap = new HashMap<>();

    public static void main(String args[])
    {
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);

    }

    //Datos validados en la vista 
    //TODO hacer que te de un boolean para comprovar en vista
    public static boolean altaPokemonAgua(String nombre, int ataque, int defensa, int vida, String tipoAgua)
    {
        if (isValidName(nombre) && !isPokemonCreated(nombre))
        {
            TipoAgua tipo;
            if (tipoAgua.equals("Dulce"))
            {
                tipo = TipoAgua.DULCE;
            } else
            {
                tipo = TipoAgua.SALADA;
            }
            pokemonMap.put(nombre, new Agua(tipo, ataque, defensa, vida, nombre));
            return true;
        }
        return false;
    }
//TODO hacer que te de un boolean para comprovar en vista

    public static boolean altaPokemonFuego(String nombre, int ataque, int defensa, int vida)
    {
        if (isValidName(nombre) && !isPokemonCreated(nombre))
        {
            pokemonMap.put(nombre, new Fuego(ataque, defensa, vida, nombre));
            return true;
        }
        return false;
    }
//TODO hacer que te de un boolean para comprovar en vista

    public static boolean altaPokemonPlanta(String nombre, int ataque, int defensa, int vida, String habitat)
    {
        if (isValidName(nombre) && isValidHabitat(habitat) && !isPokemonCreated(nombre))
        {
            pokemonMap.put(nombre, new Planta(habitat, ataque, defensa, vida, nombre));
            return true;
        }
        return false;
    }

    /**
     * look for the pokemon in the Hash map and return the object
     *
     * @param name the key name of the Map pokemon
     * @return Pokemon Object
     */
    public static Pokemon getObjPokeMap(String name)
    {
        return pokemonMap.get(name);
    }

    /**
     * return the Key of the pokemon map
     *
     * @return pokemon name array string
     */
    public static String[] getNameMap()
    {
        return pokemonMap.keySet().toArray(new String[pokemonMap.size()]);
    }

    public static Pokemon[] getObjMap()
    {
        return pokemonMap.values().toArray(new Pokemon[pokemonMap.size()]);
    }

    /**
     * Checks in the PokeMap and saves into array pokes which type is Fuego
     *
     * @return arraylist with all fire poke objects
     */
    //TODO intentar usar generics para hacerlo en una funcion
    public static ArrayList<Fuego> getObjMapFire()
    {
        Pokemon[] pokemonCollection = pokemonMap.values().toArray(new Pokemon[pokemonMap.size()]);
        ArrayList<Fuego> pokemonFuego = new ArrayList<>();
        for (Pokemon pokemon : pokemonCollection)
        {
            if (pokemon instanceof Fuego)
            {
                pokemonFuego.add((Fuego) pokemon);
            }
        }
        return pokemonFuego;
    }

    /**
     * Checks in the PokeMap and saves into array pokes which type is Planta
     *
     * @return arraylist with all fire poke objects
     */
    //TODO intentar usar generics para hacerlo en una funcion
    public static ArrayList<Planta> getObjMapPlant()
    {
        Pokemon[] pokemonCollection = pokemonMap.values().toArray(new Pokemon[pokemonMap.size()]);
        ArrayList<Planta> pokemonPlanta = new ArrayList<>();
        for (Pokemon pokemon : pokemonCollection)
        {
            if (pokemon instanceof Fuego)
            {
                pokemonPlanta.add((Planta) pokemon);
            }
        }
        return pokemonPlanta;
    }

    /**
     * Checks in the PokeMap and saves into array pokes which type is Planta
     *
     * @return arraylist with all fire poke objects
     */
    //TODO intentar usar generics para hacerlo en una funcion
    public static ArrayList<Agua> getObjMapWater()
    {
        Pokemon[] pokemonCollection = pokemonMap.values().toArray(new Pokemon[pokemonMap.size()]);
        ArrayList<Agua> pokemonAgua = new ArrayList<>();
        for (Pokemon pokemon : pokemonCollection)
        {
            if (pokemon instanceof Fuego)
            {
                pokemonAgua.add((Agua) pokemon);
            }
        }
        return pokemonAgua;
    }

    //TODO mostrar excepciones en vista
    public static boolean isPokemonCreated(String name)
    {
        if (pokemonMap.get(name) == null)
        {
            return false;
        }
        
        //TODO Move this
        // JOptionPane.showMessageDialog(null, "El pokemon ya existe con ese nombre", 
        //       "nombre incorrecto", JOptionPane.ERROR_MESSAGE);
        return true;
    }
    //TODO mostrar excepciones en vista

    public static boolean isValidHabitat(String name)
    {
        if (name.equals(""))
        {
            JOptionPane.showMessageDialog(null, "No puedes dejar el habitat en blanco",
                    "nombre incorrecto", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    //TODO mostrar excepciones en vista
    public static boolean isValidName(String name)
    {
        if (name.equals(""))
        {
            JOptionPane.showMessageDialog(null, "No puedes dejar el nombre en blanco",
                    "nombre incorrecto", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public static void changeProperties(Pokemon pokemon, int atak, int def, int life)
    {
        pokemon.setAtk(atak);
        pokemon.setDef(def);
        pokemon.setLife(life);
    }
}
