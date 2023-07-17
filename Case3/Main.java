package Case3;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Ron", 22, 12);
        Employee employee2 = new Employee("Kri", 22);
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
        System.out.println(calculator.add(3, 2));

        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println(scientificCalculator.add(2, 2));

        System.out.println("--------------------");

        // Assignment 4
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Biscuit", "Woof");
        animals[1] = new Cat("Shabino", "Meow");
        animals[2] = new Animal("noname", "weird noise");

        for (Animal animal : animals) {
            animal.makeSound();
        }

        System.out.println("--------------------");

        // Assignment 5
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(2, 3);
        shapes[1] = new Circle(11);

        for (Shape shape : shapes) {
            shape.calculateArea();

            if (shape instanceof Resizable) {
                ((Resizable) shape).resize(40);
            }
        }
    }

}
