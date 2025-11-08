//Rahul Tudu RollNo-12030523037
class Shape {
    public double getArea() {
        System.out.println("Area calculation not defined for generic shape.");
        return 0;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        Shape genericShape = new Shape();
        System.out.println("Generic Shape Area: " + genericShape.getArea());
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}
