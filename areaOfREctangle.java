import java.util.Scanner;

public class areaOfREctangle {
    public static void main(String[] args) {
        System.out.println("What is the length and width of the rectangle :");
        Scanner input = new Scanner(System.in);


         int w = input.nextInt();
         int l = input.nextInt();
        double A = l*w;
        System.out.println("The are of the rectangle is "+A);
    }
}
