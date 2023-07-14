class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    private int employeeId;

    public Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Main {
    public static void main(String[] args) {
        // Create an object of the "Employee" class and demonstrate the use of constructors and initialization
        Employee employee = new Employee("John Doe", 30, 12345);
        employee.displayDetails();
    }
}
