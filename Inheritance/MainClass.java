package Inheritance;

class Animal {
    // Members-->variables
    int noOfleg = 4;
    String name = "Animal";
    int ear = 2;
    String color = "default";

    // Members-->Method
    void displayAnimal() {
        System.out.println("No of leg is" + noOfleg);
        System.out.println("Name is" + name);
        System.out.println("No of ear is" + ear);
        System.out.println("color is" + color);
    }

}

class Cat extends Animal
{
    String catBreed = "Default";
    @Override
    void displayAnimal() {
        name = "Jenny";
        color = "Black & Oranage";
        System.out.println("Cat breed is"+catBreed);
        super.displayAnimal();
    }

}

class PersuinCat extends Cat
{
    @Override
    void displayAnimal() {
        catBreed = "Persuian";
        super.displayAnimal();
    }
}

public class MainClass {
    public static void main(String[] args) {

        PersuinCat pcat =new PersuinCat();
        pcat.displayAnimal();

    }
}
