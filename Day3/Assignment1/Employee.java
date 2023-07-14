public class Employee extends Person {

    private String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    //Display Details method
    public void displayMethod(String name, int age, String employeeId){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Employee Id : " + employeeId);
    }
    
}
