public class Mage extends Protagonist {

    private int baseDefense = 8;
    private double baseAttack = 3.5;

    public Mage( String name ) {
    	super( name );
       	defense = this.baseDefense;
    	attack = this.baseAttack;
    }

    public void specialize() {
	    defense = baseDefense - 2 ;
	    attack = baseAttack + 3.5;
    }

    public void normalize() {
        defense = baseDefense;
        attack = baseAttack;
    }

}
