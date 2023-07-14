package Assignment4;
public class Main{
    public static void main(String[] args){
        Animal animal = new Animal("Animal Name","Animal Sound");
        Cat cat = new Cat("Maru San");
        Dog dog = new Dog("Yoshi San");


        //method overloading
        animal.makeSound();
        cat.makeSound();
        dog.makeSound();
    }
}