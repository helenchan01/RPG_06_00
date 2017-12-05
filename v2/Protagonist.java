public class Protagonist extends Character {

    private String name;

    private int baseDefense = 10;
    private double baseAttack = 3.5;

    public Protagonist( String name ) {
	this.name = name;
	hp = 1000;
	strength = 20;
	defense = defaultDefense;
	attack = defaultAttack;
    }

    public String getName() {
	return name;
    }

    public void specialize() {
	defense = defaultDefense - 5 ;
	attack = defaultAttack + 2.5;
    }

    public void normalize() {
	defense = defaultDefense;
	attack = defaultAttack;
    }
}

    
