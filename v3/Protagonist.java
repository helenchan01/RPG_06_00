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

    public abstract void specialize();    
    public abstract void normalize();

    // Compiling an abstract toString without changing the class's header:
    // Protagonist is not abstract and does not override abstract
    // method toString() in Protagonist
    // public class Protagonist extends Character {
    //        ^   

    // Instantiating a Protagonist:
    // error: Protagonist is abstract; cannot be instantiated
    
    // Not overriding abstract methods:
    // error: Rogue is not abstract and does not override abstract method toString()
    
    public abstract String toString();
}

    
