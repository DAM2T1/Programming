package Model;

import Controller.TipoAgua;

/**
 * @author Albert Montagut Casero
 */
public class Agua extends Pokemon {
    
    private TipoAgua tipoAgua ;

    public Agua(TipoAgua tipoAgua, int atk, int def, int life, String name)
    {
        super(atk, def, life, name);
        this.tipoAgua = tipoAgua;
    }

    
    
    @Override
    public String getFuerte() {
        return "Fuego";
    }

    @Override
    public String getDebil() {
        return "Planta";
    }

    @Override
    public boolean isCapturable() {
        if(((int)((Math.random() * 100) + 20) - getLife()) > getDef()){
            return true;
        }else{
            return false;
        }
    }
    
    
}
