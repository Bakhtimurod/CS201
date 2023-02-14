import java.util.Scanner;

public class lengthOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of circle :");
        Scanner input = new Scanner(System.in);
        double r = input.nextInt();
        double PI = 3.14;
        double L= (PI*(2*r));
        System.out.println("The length of the circle is "+L);
    }
}
