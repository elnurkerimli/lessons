import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE RADIUS");
        double radius = input.nextDouble();
        double pi = 3.14;
        double diametr= 2* radius;
        double circumference = radius * radius * pi;
        double area = 2 * pi* radius;
        System.out.println("DIAMETER OF A CIRCLE: "+diametr);
        System.out.println("CIRCUMFERENCE OF A CIRCLE: "+circumference);
        System.out.println("AREA OF A CIRCLE: "+area);

        input.close();
    }
}