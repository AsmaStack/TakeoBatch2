package Assignment5;

public class Rectangle extends Shape implements Resizable{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    //overriding the calculate area method from shape
    @Override
    public double calculateArea(){
        return width * height;
    }

    //adding resize functionality
    @Override
    public void resize(int percentage){
        width = width * (percentage / 100.00);
        height = height * (percentage / 100.00);
    } 

}
