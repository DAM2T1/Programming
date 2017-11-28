/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Albert Montagut Casero
 */
public class Planta extends Pokemon{
    private String habitat;

    public Planta(String habitat, int atk, int def, int life, String name)
    {
        super(atk, def, life, name);
        this.habitat = habitat;
    }

    public String getHabitat()
    {
        return habitat;
    }

    public void setHabitat(String habitat)
    {
        this.habitat = habitat;
    }

    

  
    @Override
    public String getFuerte() { //return string?
        return "Agua";
    }

    @Override
    public String getDebil() {
        return "Fuego";
    }

    @Override
    public boolean isCapturable() {
        if(((int)(Math.random() * 51) +getAtk()) > getLife()){
            return true;
        }else{
            return false;
        }
    }
    
    
}
