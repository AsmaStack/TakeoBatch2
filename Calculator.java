public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
class ScientificCalculator extends Calculator {
    @Override
    public int add(int a, int b) {
        return (a + b) * 2;
    }
}

class Calculate{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        int result1 = calculator.add(2, 3);
        double result2 = calculator.add(2.5, 3.7);
        int result3 = calculator.add(2, 3, 4);

        int result4 = scientificCalculator.add(2, 3);

        System.out.println("Result 1: " + result1); // Output: 5
        System.out.println("Result 2: " + result2); // Output: 6.2
        System.out.println("Result 3: " + result3); // Output: 9
        System.out.println("Result 4: " + result4); // Output: 10
    }
}
