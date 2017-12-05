public class Monster extends Character {

    public Monster() {
	hp = 1000;
	strength = (int) ( 20 + Math.random() * 45 );
	defense = 5;
	attack = 2.1;
    }

    public String toString() {
	String stats = " hp: " + hp
	             + " strength: " + strength
	             + " defense: " + defense
	             + " attack: " + attack;
	return stats;
    }
}
	    
	
