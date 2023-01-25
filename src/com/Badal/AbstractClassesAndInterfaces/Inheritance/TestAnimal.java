package com.Badal.AbstractClassesAndInterfaces.Inheritance;

public class TestAnimal {
    public static void main(String[] args) {
        Dogs pug = new Dogs();
        pug.setBarking("Barking");
        pug.setWalk("Walking");
        pug.setEat("Give me food");
        pug.setCuddle("Cuddle");
//        System.out.println(pug.toString());

        Dogs puppy = new Dogs();
        puppy.setBarking("Too small to bark");
//        System.out.println(puppy.toString());

        Cats kitty = new Cats();
        kitty.setMeow("Meow Meow");
//        System.out.println(kitty.toString());
        displayAnimals(pug);
        displayAnimals(kitty);

        Dogs german =new Dogs();
        german.setBarking("Big Bark");
        german.setEat("Eats a lot");

        displayAnimals(german);
    }
    public static void displayAnimals(Animal animalObj){
        System.out.println(animalObj.toString());
    }
}
