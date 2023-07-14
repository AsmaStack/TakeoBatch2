// Abstract class Shape
abstract class Shape {
    abstract double calculateArea();
}

// Concrete class Rectangle
class Rectangle extends Shape implements Resizable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    public void resize(int percentage) {
        width *= (1.0 + (double) percentage / 100);
        height *= (1.0 + (double) percentage / 100);
    }
}

// Concrete class Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Interface Resizable
interface Resizable {
    void resize(int percentage);
}

class AreaResult {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(2.5);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        rectangle.resize(50);
        System.out.println("Resized Rectangle Area: " + rectangle.calculateArea());

        System.out.println("Circle Area: " + circle.calculateArea());
    }
}
