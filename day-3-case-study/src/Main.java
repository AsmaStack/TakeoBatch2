public class Main {
    public static void main(String[] args) {
        // Assignment 1
        Employee employee1 = new Employee("John", 30, 12345);
        Employee employee2 = new Employee("Jane", 25);
        employee1.displayDetails();
        employee2.displayDetails();

        System.out.println("--------------------");

        // Assignment 2
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber("1234567890");
        bankAccount.setBalance(1000);
        bankAccount.setPin(1234);

        ATM atm = new ATM();
        atm.setBankAccount(bankAccount);
        atm.getBankAccount().withdrawMoney(500, 1234);

        System.out.println("--------------------");

        // Assignment 3
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));

        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println(scientificCalculator.add(1, 2));

        System.out.println("--------------------");

        // Assignment 4
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Ronnie", "Woof");
        animals[1] = new Cat("Shasko", "Meow");
        animals[2] = new Animal("Nameless", "Sound");

        for (Animal animal : animals) {
            animal.makeSound();
        }

        System.out.println("--------------------");

        // Assignment 5
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(10, 20);
        shapes[1] = new Circle(10);

        for (Shape shape : shapes) {
            shape.calculateArea();

            if (shape instanceof Resizable) {
                ((Resizable) shape).resize(50);
            }
        }
    }
}
