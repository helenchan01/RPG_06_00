public class Character {
    protected int hp;
    protected int strength;
    protected int defense;
    protected double attack;

    public boolean isAlive() {
	return hp> 0;
    }

    public int getDefense() {
	return defense;
    }

    public void lowerHP( int damage ) {
	hp-= damage;
    }
    
    public int attack( Character c ) {
	int damage = (int) ( strength * attack - c.getDefense() );
	c.lowerHP( damage );
	return damage;
	}
}
