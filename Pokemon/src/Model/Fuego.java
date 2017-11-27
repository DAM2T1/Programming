package Model;

/**
 *
 * @author Albert Montagut Casero
 */
public class Fuego extends Pokemon{

    public Fuego(int atk, int def, int life, String name)
    {
        super(atk, def, life, name);
    }
    
    @Override
    public String getFuerte() {
        return "Planta";
    }

    @Override
    public String getDebil() {
        return "Agua";
    }

    @Override
    public boolean isCapturable() {
        if(((int)((Math.random() * 51) + 10)  + getLife()) > (getAtk() + getDef())){
            return true;
        }else{
            return false;
        }
    }
    
}
