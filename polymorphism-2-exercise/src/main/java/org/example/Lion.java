package org.example;

public class Lion extends Animal{

    public Lion(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println("Roar");
    }
}
