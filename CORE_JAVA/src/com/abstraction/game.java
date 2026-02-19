package com.abstraction;

abstract class GameCharacter {
    String name;
    int level, healthPoints;

    GameCharacter(String name, int level, int healthPoints) {
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
    }

    abstract void attack();

    void chooseTarget() {
        System.out.println("Target selected.");
    }

    void animateAttack() {
        System.out.println("Attack animation played.");
    }
}
class Warrior extends GameCharacter {
    String weaponType;

    Warrior(String name, int level, int healthPoints, String weaponType) {
        super(name, level, healthPoints);
        this.weaponType = weaponType;
    }

    void attack() {
        System.out.println("Performing melee attack with " + weaponType);
    }
}
public class game {
    public static void main(String[] args) {
System.out.println("\n=== Game Character Actions ===");
GameCharacter warrior = new Warrior("Conan", 5, 100, "Sword");

warrior.chooseTarget();
warrior.attack();
warrior.animateAttack();
}
}