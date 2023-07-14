package Assignment4;

public class Animal {
    private String name;
    private String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println(sound);
    }
    
}

 class Cat extends Animal {
 
    public Cat(String name){
        super(name,"meoooooow");
    }

       @Override
       public void makeSound(){
       System.out.println("Purr");
       }
}
 class Dog extends Animal {
    public Dog(String name){
        super(name,"Woof");
    }
    @Override
    public void makeSound(){
        System.out.println("Barking");
    }
}



