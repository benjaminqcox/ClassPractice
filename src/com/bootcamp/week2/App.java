

import com.bootcamp.week2.Weapons;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Weapons weapon = new Weapons();
        // weapon.setName("Sword");
        // weapon.setPrice(100);
        // weapon.setIsOneHanded(true);
        // weapon.setIsSingleOperator(true);
        // weapon.setDamageType("Slashing");
        // weapon.printWeapon();

        Weapons weapon = new Weapons("Sword", 100, true, true, "Slashing");
        // weapon.printWeapon();

        System.out.println(weapon);

        // Weapons weapon2 = new Weapons("Gun", 250);
        // weapon2.printWeapon();
    }
}