package Assignment3;

public class Main {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        ScientificCalculator sc = new ScientificCalculator();


        //method overloading method
        int sum1 = cal.add(10,20);
        double sum2 = cal.add(5.5,2.5);
        int sum3 = cal.add(1,2,3);


        //Printing method overloading method
        System.out.println("******----******----******----******");
        System.out.println("Calculator Class: ");
        System.out.println("Sum of tow integers: "+sum1);
        System.out.println("Sum of tow doubles: "+sum2);
        System.out.println("Sum of three integers: "+sum3);


        //Method ovverloading for scientific calculation
        int sum4 = sc.add(4,2);

        System.out.println("******----******----******----******");
        System.out.println("Scientific Calculator Class: ");
        System.out.println("Sum of two integers multiplied by (x2): "+sum4);
    }
}
