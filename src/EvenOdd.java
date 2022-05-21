import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " Even number");
        } else {
            System.out.println(num + " Odd number");
        }
    }
}
