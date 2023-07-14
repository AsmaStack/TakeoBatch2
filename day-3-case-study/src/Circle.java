public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
        calculateArea();
    }

    @Override
    public void calculateArea() {
        area = (int) (Math.PI * radius * radius);
        System.out.println("Area of circle is " + area);
    }
}
