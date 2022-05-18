import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("The number of times to flip coin ");
        int nTimesFlipped = scnr.nextInt();
        int flipCoin = (int) Math.floor(Math.random() * 10) % 2;
        if (flipCoin < 0.5) {
            System.out.println("tails");
        } else {
            System.out.println("Heads");
        }
    }
}
