class CylinderArea {
    double radius;
    double height;

    CylinderArea(double r, double h) {
        radius = r;
        height = h;
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }

    double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

   }
public class Cylinder {
    public static void main(String[] args) {
        CylinderArea cyl = new CylinderArea(5, 10);
        System.out.println("Volume of Cylinder: " + cyl.volume());
        System.out.println("Surface Area of Cylinder: " + cyl.surfaceArea());
    }
}