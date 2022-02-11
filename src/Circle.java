public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(){
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = 3.14159265 * radius * radius;
        return area;
    }
}
