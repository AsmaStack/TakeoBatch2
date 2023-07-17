package Case3;

public class Employee extends Person {
    private int employeeId;

    public Employee(String name, int age) {
        super(name, age);
    }

    public Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee id: " + employeeId);
        System.out.println("Employee with name of " + name + "is " + age + " years old.");
    }
}