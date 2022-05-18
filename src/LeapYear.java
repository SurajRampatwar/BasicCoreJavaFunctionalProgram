import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int Year;
        System.out.println("Enter any year : ");
        Scanner newYear = new Scanner(System.in);
        Year = newYear.nextInt();
        if ((Year % 4 == 0) && (Year % 100 != 0) || (Year % 400 == 0)) {
            System.out.println(" IS LEAP YEAR");
        } else {
            System.out.println("IS NOT LEAP YEAR");

        }
    }
}
