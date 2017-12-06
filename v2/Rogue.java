public class Rogue extends Protagonist {
    
    private int baseDefense = 8;
    private double baseAttack = 5.74;

    public Rogue( String name) {
    	super( name);
    	defense = this.baseDefense;
    	attack = this.baseAttack;
    }
}
