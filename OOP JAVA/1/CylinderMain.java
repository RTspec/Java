//Rahul Tudu RollNo-12030523037
class Cylinder {
    double radius, height;
   Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
    Cylinder(double r) {
        radius = r;
        height = r; 
    }
     double volume() {
        return Math.PI * radius * radius * height;
    }
    double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + volume());
        System.out.println("Surface Area: " + surfaceArea());
    }
}
public class CylinderMain {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(7, 10);  
        Cylinder c2 = new Cylinder(5);      
        System.out.println("Cylinder 1:");
        c1.display();
        System.out.println("Cylinder 2:");
        c2.display();
    }
}
