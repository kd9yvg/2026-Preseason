import java.util.ArrayList;
import java.util.List;

public class Character {
    String name;
    int health;
    int attackPower;
    List<String> inventory; // Inventory list

    public Character(String nameIn, int healthIn, int attackPowerIn) {
        name = nameIn;
        health = healthIn;
        attackPower = attackPowerIn;
        inventory = new ArrayList<>(); // Initialize inventory
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void attack(Character target) {
        target.takeDamage(attackPower);
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    // Add an item to the inventory
    public void addItem(String item) {
        inventory.add(item);
    }

    // Remove an item from the inventory
    public void removeItem(String item) {
        inventory.remove(item);
    }

    // Get the inventory list
    public List<String> getInventory() {
        return inventory;
    }
}