package com.inheritence.task;

public class Animal {
    String name, habitat;

    Animal(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    void displayHabitat() {
        System.out.println("Habitat: " + habitat);
    }
}

class Mammal extends Animal {
    boolean isWarmBlooded;

    Mammal(String name, String habitat, boolean isWarmBlooded) {
        super(name, habitat);
        this.isWarmBlooded = isWarmBlooded;
    }

    void displayMammalInfo() {
        System.out.println("Is Warm Blooded: " + isWarmBlooded);
    }
}

class Bird extends Animal {
    boolean canFly;

    Bird(String name, String habitat, boolean canFly) {
        super(name, habitat);
        this.canFly = canFly;
    }

    void displayBirdInfo() {
        System.out.println("Can Fly: " + canFly);
    }
}

class Reptile extends Animal {
    boolean isColdBlooded;

    Reptile(String name, String habitat, boolean isColdBlooded) {
        super(name, habitat);
        this.isColdBlooded = isColdBlooded;
    }

    void displayReptileInfo() {
        System.out.println("Is Cold Blooded: " + isColdBlooded);
    }
}

class AnimalTest {
    public static void main(String[] args) {
        Animal mammal = new Mammal("Lion", "Savannah", true);
        mammal.displayHabitat();
        ((Mammal) mammal).displayMammalInfo();

        Animal bird = new Bird("Eagle", "Forest", true);
        bird.displayHabitat();
        ((Bird) bird).displayBirdInfo();

        Animal reptile = new Reptile("Snake", "Desert", true);
        reptile.displayHabitat();
        ((Reptile) reptile).displayReptileInfo();
    }
}
