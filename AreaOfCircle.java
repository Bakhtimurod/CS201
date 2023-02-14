import java.util.Scanner;

public class AreaOfCircle {
    // Let's write a program that calculates area of circle
    public static void main(String[] args) {
        System.out.println("Enter the radius of circle :");
        Scanner input = new Scanner(System.in);
        double r = input.nextInt();
        double PI = 3.14;
        double A = (PI*(r*r));
        System.out.println("The are of the circle is "+A);
        // boom....
    }
}
