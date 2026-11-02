public class Monsters {
    String name;
    int baseDamage;
    String weaknessItem; // The item that reduces the monster's damage

    public Monsters(String name, int baseDamage, String weaknessItem) {
        this.name = name;
        this.baseDamage = baseDamage;
        this.weaknessItem = weaknessItem;
    }

    // Method to calculate damage based on whether the correct item is used
    public int dealDamage(boolean hasWeaknessItem) {
        if (hasWeaknessItem) {
            return baseDamage / 2; // Damage is halved if the weakness item is used
        }
        return baseDamage;
    }

    // Getters for monster properties
    public String getName() {
        return name;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public String getWeaknessItem() {
        return weaknessItem;
    }

    // Example monsters
    public static Monsters createFireMonster() {
        return new Monsters("Fire Monster", 20, "Water Potion");
    }

    public static Monsters createIceMonster() {
        return new Monsters("Ice Monster", 15, "Fire Torch");
    }

    public static Monsters createPoisonMonster() {
        return new Monsters("Poison Monster", 25, "Antidote");
    }
}