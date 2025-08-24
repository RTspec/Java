class Area {
    double area;

    // Constructor for Square
    Area(double side) {
        area = side * side;
        System.out.println("Area of Square: " + area);
    }

    // Constructor for Rectangle
    Area(double length, double breadth) {
        area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    // Constructor for Triangle
    Area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            area = 0.5 * base * height;
            System.out.println("Area of Triangle: " + area);
        }
    }

    // Constructor for Circle
    Area(float radius) {
        area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Area square = new Area(5);          // square
        Area rectangle = new Area(4, 6);    // rectangle
        Area triangle = new Area(5, 10, true); // triangle
        Area circle = new Area(7.0f);       // circle
    }
}
