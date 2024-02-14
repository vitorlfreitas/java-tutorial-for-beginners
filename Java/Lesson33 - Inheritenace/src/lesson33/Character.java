package lesson33;

public class Character {
    
    String name;
    int lifePoints;

    public Character(String name, int lifePoints) {
        this.name = name;
        this.lifePoints = lifePoints;
    }
    
    
    
    public void attack() {
        System.out.println("Attacking");
    }
    
    public void defend() {
        System.out.println("Defending");
    }
}
