import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        double radius;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = in.nextDouble();
        if (radius < 0) {
            System.out.println("Error: Radius must be >= 0"); 
        } else {
            double area = Math.PI * radius * radius; 
            System.out.println("The area is: " + area);
        }
        
    }
}
