import java.util.Scanner;

public class EvenOrOdd {
    // this programm checks if the number is odd or even
    public static void main(String[] args) {
        System.out.println("enter a number :");
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        if (num%2==0){
            System.out.println("This numbeer is even");
        }
        else
            System.out.println("This is odd number");
    }
}
