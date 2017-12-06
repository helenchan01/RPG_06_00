public class Hydra extends Monster {

    private int baseDefense = 6;
    private double baseAttack = 3.0;
    
    public Hydra() {
    	super();
    	defense = this.baseDefense;
    	attack = this.baseAttack;
    }
    
    public void specialize() {
        defense = baseDefense + 2;
        attack = baseAttack - 1;
    }

    public String toString() {
        String desc = "a Hydra with " + super.toString();
        return desc;
    }
}
