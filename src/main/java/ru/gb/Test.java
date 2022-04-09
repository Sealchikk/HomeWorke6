package ru.gb;

public class Test {

    public static void main(String[] args) {

        Dog dog = new Dog("Bobik", "Bleak");
        Cat cat = new Cat("Murzik", "white");
        cat.swim(12);
        dog.swim(5);
        cat.run(150);
        dog.run(300);


    }

}
