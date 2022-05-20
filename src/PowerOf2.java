import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        int Number;
        int Power = 2;
        Number = Integer.parseInt(args[0]);
        int result = (int) Math.pow(2, Number);
        System.out.println("power of 8 is = " + result);
        while ((Power < result)) {
            Power = Power * 2;
            System.out.println("Power 2 of number = " + Power);
        }
        if (result % 4 == 0) {
            System.out.println("Is LEAP YEAR");
        } else {
            System.out.println("IS NOT LEAP YEAR");
        }
    }
}

