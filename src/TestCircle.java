import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính đường tròn: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("Diện tích của đường tròn có bán kính là " + circle.getArea());
    }
}
