public class Person  {
    private String name;
    private int age; 

    //constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName(){
        return name;
    }

    //Setter for name
    public void setName(String name){
        this.name = name;
    }

    //Getter for age
      public int getAge() {
        return age;
    }

    //Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    //Display Details method
    public void displayMethod(String name, int age){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}


