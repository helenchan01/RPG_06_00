public class Monster extends Character {

    private int baseDefense;
    private double baseAttack;
    
    public Monster() {
	    hp = 1000;
	    strength = (int) ( 20 + Math.random() * 45 );
    	defense = baseDefense;
    	attack = baseAttack;
    }

    public String toString() {
	    String stats = "hp: " + hp
	                 + " strength: " + strength
	                 + " defense: " + defense
	                 + " attack: " + attack;
	    return stats;
    }
}
	    
	
