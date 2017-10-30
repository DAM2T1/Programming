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

    @Override
    public double calcAtk() {
        int ataqueBase = getAtaque(); // esto es para ahorrarme acceder 3 veces al metodo
        return super.calcAtk() + (ataqueBase * numEsbirro * 0.15) + (ataqueBase * overlord * 0.40) ;
    }

    @Override
    public double calcDef() {
        return super.calcDef() + (getAtaque() + numEsbirro + 0.30);
    }
}
