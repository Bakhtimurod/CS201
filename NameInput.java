import java.util.Scanner;

public class NameInput {
    public static void main(String[] args) {
        System.out.println("Enter your name :");
        Scanner in = new Scanner(System.in);
        String myName = in.next();
        System.out.println("Your name is "+myName);

    }
}
