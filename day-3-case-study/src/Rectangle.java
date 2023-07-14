public class Rectangle extends Shape implements Resizable {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        calculateArea();
    }

    @Override
    public void calculateArea() {
        area = length * width;
        System.out.println("Area of rectangle is " + area);
    }

    @Override
    public void resize(int percent) {
        length = (int) (length * (1 + percent / 100.0));
        width = (int) (width * (1 + percent / 100.0));
        calculateArea();
    }
}
