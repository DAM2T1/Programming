package Montagut.Albert.Entities;

/**
 * Created by Raikish on 24/10/2017.
 * GitHub --> https://github.com/amcgamer/
 */
public class Zerg extends Especie{
    private int numEsbirro;
    private int overlord;

    public Zerg(String nombre, int ataque, int defensa, int numEsbirro, int overlord) {
        super(nombre, ataque, defensa);
        this.numEsbirro = numEsbirro;
        this.overlord = overlord;
    }
    public int getNumEsbirro() {
        return numEsbirro;
    }

    public void setNumEsbirro(int numEsbirro) {
        this.numEsbirro = numEsbirro;
    }

    public int getOverlord() {
        return overlord;
    }

    public void setOverlord(int overlord) {
        this.overlord = overlord;
    }

    @Override
    public double calcAtk() {
        int ataqueBase = getAtaque(); // esto es para ahorrarme acceder 3 veces al metodo
        return getAtaque() + (ataqueBase * numEsbirro * 0.15) + (ataqueBase * overlord * 0.40) ;
    }

    @Override

    public double calcDef() {
        return getDefensa()  + (getAtaque() + numEsbirro + 0.30);
    }

    @Override
    public String toString() {
        return "Zerg{" +
                "numEsbirro=" + numEsbirro +
                ", overlord=" + overlord +
                '}' + super.toString();
    }
}
