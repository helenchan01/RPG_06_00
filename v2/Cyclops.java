public class Cyclops extends Monster{
    
    private int baseDefense = 2;
    private double baseAttack = 1.3;

    public Cyclops() {
        super();
        defense = this.baseDefense;
        attack = this.baseAttack;
    }

    public void specialize() {
        defense = baseDefense + 3;
        attack = baseAttack + 1.2;
    }
}
