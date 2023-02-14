import java.util.Scanner;

public class AgeInput {
    public static void main(String[] args) {
        System.out.println("What is your age:");
        Scanner age = new Scanner(System.in);
        System.out.println("your age is " +age.nextInt());
    }
}
