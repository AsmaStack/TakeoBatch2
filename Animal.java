class Animal {
    protected String name;
    protected String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println("The " + name + " makes a sound: " + sound);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name, "Meow");
    }

    @Override
    public void makeSound() {
        System.out.println("The " + name + " says: " + sound);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name, "Woof");
    }

    @Override
    public void makeSound() {
        System.out.println("The " + name + " says: " + sound);
    }
}

class AnimalSound {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Generic Sound");
        Cat cat = new Cat("Whiskers");
        Dog dog = new Dog("Buddy");

        animal.makeSound();
        cat.makeSound();
        dog.makeSound();
    }
}
