public class Mage extends Protagonist {

    private int defaultDefense = 8;
    private double defaultAttack = 3.5;

    public Mage( String name ) {
	super( name );
    }
    
    public void specialize() {
	defense = defaultDefense - 2 ;
	attack = defaultAttack + 4.5;
    }

}
