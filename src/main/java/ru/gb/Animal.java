package ru.gb;

public abstract class Animal {
    protected String name;
    protected String color;
    private static int counter = 0;

    public Animal() {}

    public Animal (String name, String color) {
        this();
        this.name = name;
        this.color = color;
        counter++;
        System.out.println("Animal - " + counter);
    }

    public void swim(int length) {
        System.out.printf("%s swam %d meters\n", name, length);
    }

    public void run(int length) {
        System.out.printf("%s run %d meters\n", name, length);
    }

    public void counter() {
        System.out.println("Animal -" + counter);
    }


}
