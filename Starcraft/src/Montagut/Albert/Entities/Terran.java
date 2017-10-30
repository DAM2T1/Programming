package Montagut.Albert.Entities;

/**
 * Created by Raikish on 24/10/2017.
 * GitHub --> https://github.com/amcgamer/
 */
public class Terran extends Especie {
    private int edificio;
    private int arma;

    public Terran(String nombre, int ataque, int defensa, int edificio, int arma) {
        super(nombre, ataque, defensa);
        this.edificio = edificio;
        this.arma = arma;
    }

    public int getEdificio() {
        return edificio;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public int getArma() {
        return arma;
    }

    public void setArma(int arma) {
        this.arma = arma;
    }

    @Override
    public double calcAtk() {
        return super.calcAtk() + getAtaque() * 0.5 * getArma();
    }

    @Override
    public double calcDef() {
        return super.calcDef() + (getDefensa() * 0.25 * getEdificio());
    }
}
