package Montagut.Albert.Entities;

/**
 * Created by Raikish on 24/10/2017.
 * GitHub --> https://github.com/amcgamer/
 */
public abstract class Especie {
    private String nombre;
    private int numVict;
    private int ataque;
    private int defensa;

    public Especie(String nombre)
    {
        this.nombre = nombre;
    }

    public Especie(String nombre, int ataque, int defensa) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.numVict = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumVict() {
        return numVict;
    }

    public void pluseOneVictory() {
        this.numVict++;
    }

    /**
     * @return int
     */
    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public abstract double calcAtk();
    public abstract double calcDef();


    @Override
    public String toString() {
        return "Especie{" +
                "nombre='" + nombre + '\'' +
                ", numVict=" + numVict +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                '}';
    }
}
