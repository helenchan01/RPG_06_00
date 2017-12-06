public class Warrior extends Protagonist {
    
    private int baseDefense = 2;
    private double baseAttack = 2.56;

    public Warrior(String name) {
        super(name);
        defense = this.baseDefense;
        attack = this.baseAttack;
    }
}
