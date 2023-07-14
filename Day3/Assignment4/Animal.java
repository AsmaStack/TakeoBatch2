package Day3.Assignment4;
class Animal {
    private String name;
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println("The " + name + " makes a sound: " + sound);
    }
}

class Cat extends Animal {
    public Cat(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void makeSound() {
        System.out.println("The " + getName() + " says: " + getSound());
    }
}

class Dog extends Animal {
    public Dog(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void makeSound() {
        System.out.println("The " + getName() + " says: " + getSound());
    }



    public static void main(String[] args) {
        Animal animal = new Animal("Animal", "Unknown sound");
        animal.makeSound();

        Cat cat = new Cat("Cat", "Meow");
        cat.makeSound();
    }
}

