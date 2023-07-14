public class Main {
    public static void main(String[] args){
        Person person = new Person ("Alex Sth", 25);
        person.displayMethod(person.getName(), person.getAge());

        Employee employee = new Employee("John Doe", 28, "101");
        employee.displayMethod(employee.getName(), employee.getAge(), employee.getEmployeeId());
    }
}
