package Model;

/**
 * Main pokemon Hirachy class, standard atributes and methods
 * 
 * @author Albert Montagut Casero
 */
public abstract class Pokemon implements Capturable{
    private int atk;
    private int def;
    private int life;
    private String name;

    public Pokemon(int atk, int def, int life, String name)
    {
        this.atk = atk;
        this.def = def;
        this.life = life;
        this.name = name;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) { //0 ~ 50
        this.atk = atk;
    }

    public int getDef() { 
        return def;
    }

    public void setDef(int def) { //0 ~ 50
        this.def = def;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) { //20 ~ 100 
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract String getFuerte();
    public abstract String getDebil();
    @Override
    public abstract boolean isCapturable();

    
}
