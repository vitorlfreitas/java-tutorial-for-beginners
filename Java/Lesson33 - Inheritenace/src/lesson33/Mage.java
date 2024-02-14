package lesson33;

public class Mage extends Character {
    
    String weapon;

    public Mage(String name, int lifePoints, String weapon) {
        super(name, lifePoints);
        this.weapon = weapon;
    }
    
    public void summon() {
        System.out.println("Mage has summoned an Undead Warrior");
    }
    public void ultimateSummon() {
        System.out.println("Mage has summoned the Undead Frozen Dragon");
    }
}
