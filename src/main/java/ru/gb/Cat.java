package ru.gb;

public class Cat extends Animal{
    private static int counter = 0;


    public Cat (String name, String color) {
        super(name, color);
        counter++;
        System.out.println("Cat - " + counter);
    }

    public void swim(int length) {
        System.out.printf("%s can't swim\n", name);
    }
    public void run(int length) {
        if (length > 200) {
            System.out.printf("%s can't run %d meters\n", name, length);
        } else {
            System.out.printf("%s run %d meters\n", name, length);
        }
    }

}
