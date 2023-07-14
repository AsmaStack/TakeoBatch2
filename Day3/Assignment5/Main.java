package Assignment5;

public class Main {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(200,10);
        Circle cir = new Circle(5);


        System.out.println("Rectangle Area is : "+rect.calculateArea());
        System.out.println("Circle Area is : "+cir.calculateArea());

        //using resize
        int percent = 2;

        rect.resize(percent);

        System.out.println("After Resized: "+ percent +"%. Rectangle Area is:  "+rect.calculateArea());

    }
}
