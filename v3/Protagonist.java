public abstract class Protagonist extends Character {

    private String name;

    protected int baseDefense;
    protected double baseAttack;

    public Protagonist( String name ) {
    	this.name = name;
	hp = 1000;
    	strength = 20;
    	defense = baseDefense;
    	attack = baseAttack;
    }

    public String getName() {
	    return name;
    }

    public void specialize() {
        defense = baseDefense - 2;
        attack = baseAttack + 4;
    }
    
    public void normalize() {
        defense = baseDefense;
        attack = baseAttack;
    }

    // Compiling an abstract toString without changing the class's header:
    // Protagonist is not abstract and does not override abstract
    // method toString() in Protagonist
    // public class Protagonist extends Character {
    //        ^   
    
    public abstract String toString();
}

    
