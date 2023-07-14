package Day3.Assignment3;

public class ScientificCalculator extends Calculator {
    @Override
    public int add(int a, int b) {
        return (a + b) * 2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 3)); 
        System.out.println(calculator.add(2.5, 3.7)); 
        System.out.println(calculator.add(1, 2, 3)); 

        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println(scientificCalculator.add(5, 3));

    }
}
