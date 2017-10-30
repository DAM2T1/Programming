package Montagut.Albert.Entities;

/**
 * Created by Raikish on 24/10/2017.
 * GitHub --> https://github.com/amcgamer/
 */
public abstract class Especie {
    private String nombre;
    private int numVict;
    private int nivel;
    private int ataque;
    private int defensa;

    public Especie(String nombre, int ataque, int defensa) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nivel = 0;
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

    public void setNumVict(int numVict) {
        this.numVict = numVict;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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

    public double calcAtk(){
        return getAtaque();
    }
    public double calcDef(){
     return getDefensa();
    }

    @Override
    public String toString() {
        return "Especie{" +
                "nombre='" + nombre + '\'' +
                ", numVict=" + numVict +
                ", nivel=" + nivel +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                '}';
    }
}
