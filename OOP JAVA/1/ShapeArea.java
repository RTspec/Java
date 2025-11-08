//Rahul Tudu RollNo-12030523037
class Area {
    double area;
    Area(double side) {
        area = side * side;
        System.out.println("Area of Square: " + area);
    }
    Area(double length, double breadth) {
        area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
    Area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            area = 0.5 * base * height;
            System.out.println("Area of Triangle: " + area);
        }
    }
    Area(float radius) {
        area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
public class ShapeArea {
    public static void main(String[] args) {
        Area square = new Area(5);       
        Area rectangle = new Area(4, 6);
        Area triangle = new Area(5, 10, true);
        Area circle = new Area(7.0f);      
    }
}
