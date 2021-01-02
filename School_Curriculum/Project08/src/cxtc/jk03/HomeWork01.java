package cxtc.jk03;

class Master {
    public void feed(Pet pet) {
        pet.eat();
    }
}

abstract class Pet {
    public abstract void eat();
}

class Dog extends Pet {
    public void eat() {
        System.out.println("Dog被主人喂养");
    }
}

class Cat extends Pet {
    public void eat() {
        System.out.println("Cat被主人喂养");
    }
}

class Parrot extends Pet {
    public void eat() {
        System.out.println("Parrot被主人喂养");
    }
}

public class HomeWork01 {
    public static void main(String[] args) {
        Master jerry = new Master();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Parrot parrot = new Parrot();

        jerry.feed(dog);
        jerry.feed(cat);
        jerry.feed(parrot);
    }
}
