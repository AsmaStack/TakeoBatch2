package Case3;

public class Animal {
    protected String name;
    protected String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println("Animal " + name + " makes sound " + sound);
    }
}