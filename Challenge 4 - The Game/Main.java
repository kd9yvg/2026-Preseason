public class Main {
    public static void main(String[] args) {
        /*
        * public Character(String nameIn, int healthIn, int attackPowerIn) 
        * public void setHealth(int newHealth)
        * public void setAttackPower(int newAttackPower)
        * public int getHealth()
        * public int getAttackPower()
        * public String getName()
        * public void addItem(String item)
        * public void removeItem(String item)
        * public List<String> getInventory()
        * 
        * You can use the following as items:
        *   Water Potion
        *   Antidote
        *   Strength Elixir
        *   Fire Torch
        *   Defense Shield
        */

        // Create new Characters with some heath, attack power, and items in their inventory
        // Have the great battles and print the updated health and inventory of the Characters after each battle
        Character lucas = new Character("Also Lucas", 50, 100);
        Character aryaan = new Character("Also Aryaan", 5, 500);
        Character braden2 = new Character("Brick", 60, 501);
        Character seth = new Character("L0nk", 100, 502);


        lucas.addItem("Defense Shield");
        aryaan.addItem("Water Potion");
        braden2.addItem("Fire Torch");
        seth.addItem("Stength Elixir");
    }
    
    public static void great_battle_1() {
        // Make a great battle happnen
        Monsters fireMonster = Monsters.createFireMonster();
    }
    
    public static void great_battle_2() {
        // Use some items from the inventory in the seccond battle
        Monsters iceMonster = Monsters.createIceMonster();
        Monsters poisonMonster = Monsters.createPoisonMonster();
        // I made this on my mac
    }
}

