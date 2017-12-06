public class Undead extends Monster {

    private int baseDefense = 12;
    private double baseAttack = 1.5;

    public Undead() {
	    super();
    }

    public void specialize() {

    }

    public String toString() {
        String desc = "an Undead with " + super.toString();
        return desc;
    }
}
