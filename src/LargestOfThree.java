import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();
        int num2 = n1.nextInt();
        int num3 = n1.nextInt();
        if (num1 > num2) {
            if (num1 > num3)
                System.out.println(num1 + " is the largest number");
            else
                System.out.println(num3 + " is the largest number");
        } else {
            if (num2 > num3)
                System.out.println(num2 + " is the largest number");
            else
                System.out.println(num3 + " is the largest number");
        }
    }
}


