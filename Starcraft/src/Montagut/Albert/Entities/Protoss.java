package Montagut.Albert.Entities;

/**
 * Created by Raikish on 24/10/2017.
 * GitHub --> https://github.com/amcgamer/
 */
public class Protoss extends  Especie{
    private int pilones;

    public Protoss(String nombre, int ataque, int defensa, int pilones) {
        super(nombre, ataque, defensa);
        this.pilones = pilones;
    }


    public void setPilones(int pilones) {
        this.pilones = pilones;
    }

    @Override
    public String toString() {
        return "Protoss{" +
                "pilones=" + pilones +
                '}'+ super.toString();
    }

    @Override
    public double calcAtk() {
        return getAtaque() + pilones * getAtaque() * 0.5;
    }

    @Override
    public double calcDef() {
        return getDefensa() + pilones * getDefensa() * 0.5;
    }
}

