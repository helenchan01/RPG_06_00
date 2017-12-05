public class Protagonist extends Character {

    private String name;

    private int baseDefense = 10;
    private double baseAttack = 3.5;

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
	defense = baseDefense - 5 ;
	attack = baseAttack + 2.5;
    }

    public void normalize() {
	defense = baseDefense;
	attack = baseAttack;
    }

    public String toString() {
	String stats = "hp: " + hp
	             + "strength: " + strength
	             + "defense: " + defense
	             + "attack: " + attack;
	return stats;
    }
	
}

    
