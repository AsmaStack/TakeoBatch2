package Assignment1;
public class Employee extends Person{
    private int employeeId;


    public Employee(String name, int age, int employeeId){
        super(name,age);
        this.employeeId = employeeId;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId);
    }
    
}


