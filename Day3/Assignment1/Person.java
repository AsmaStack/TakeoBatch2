package Assignment1;

public class Person {
    public String name;
    public int age;

    // Parameteriazed constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Person Name: "+name);
        System.out.println("Age: "+age);
    }

    
}
