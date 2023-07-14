public class Dog extends Animal {
    public Dog(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + name + " makes sound " + sound);
    }
}
