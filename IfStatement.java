import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        System.out.println("enter your age :");
        Scanner a = new Scanner(System.in);
        int age = a.nextInt();
        if (age < 13) {
            System.out.println("you are an young ");
        } else if (age >= 13 && age <= 18) {
            System.out.println("you are a teeneger");
        } else
            System.out.println("you are an adult");
    }

}

