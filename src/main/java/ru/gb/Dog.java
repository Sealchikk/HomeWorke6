package ru.gb;

public class Dog extends Animal {

    private static int counter = 0;

    public Dog (String name, String color) {
        super(name, color);
        counter++;
        System.out.println("Dog - " + counter);
    }

    public void swim(int length) {
        if (length > 10) {
            System.out.printf("%s can't swim %d meters\n", name, length);
        } else {
            System.out.printf("%s swam %d meters\n", name, length);
        }
    }
    public void run(int length) {
        if (length > 500) {
            System.out.printf("%s can't run %d meters\n", name, length);
        } else {
            System.out.printf("%s run %d meters\n", name, length);
        }
    }

}
