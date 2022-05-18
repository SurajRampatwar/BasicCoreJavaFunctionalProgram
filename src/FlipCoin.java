import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int countTails = 0;
        int countHeads = 0;
        System.out.println("The number of times to flip coin ");
        int nTimesFlipped = scnr.nextInt();
        for (int i = 0; i < nTimesFlipped; i++) {
            int flipCoin = (int) Math.floor(Math.random() * 10) % 2;
            if (flipCoin < 0.5) {
                countTails += 1;
            } else {
                countHeads += 1;
            }
        }
        System.out.println("Tails = " + countTails);
        System.out.println("Heads = " + countHeads);
    }
}
