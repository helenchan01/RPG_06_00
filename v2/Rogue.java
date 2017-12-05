public class Rogue extends Protagonist {
    
    private int baseDefense = 6;
    private double baseAttack = 5.34;

    public Rogue( String name) {
    	super( name);
    	defense = this.baseDefense;
    	attack = this.baseAttack;
    }

    public void specialize() {
        defense = baseDefense + 4;
        attack = baseAttack - 2;
    }

    public void normalize() {
        defense = baseDefense;
        attack = baseAttack;
    }
}
