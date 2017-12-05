public class Warrior extends Protagonist {
    
    private int baseDefense = 2;
    private double baseAttack = 2.56;

    public Warrior(String name) {
        super(name);
        defense = this.baseDefense;
        attack = this.baseAttack;
    }

    public void specialize() {
        defense = baseDefense + 3;
        attack = baseAttack + 4;
    }

    public void normalize() {
        defense = baseDefense;
        attack = baseAttack;
    }
}
