import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int countTails = 0;
        int countHeads = 0;
        System.out.println("The number of times to flip coin ");
        int nTimesFlipped = num.nextInt();
        for (int i = 0; i < nTimesFlipped; i++) {
            double flipCoin = Math.random();
            if (flipCoin < 0.5) {
                countTails += 1;
            } else {
                countHeads += 1;
            }
        }
        System.out.println("Tails = " + countTails);
        System.out.println("Heads = " + countHeads);
        int percentTail = (countTails * 100) / nTimesFlipped;
        int percentHead = (countHeads * 100) / nTimesFlipped;
        System.out.println("Tail Percent " + percentTail);
        System.out.println("Head Precent " + percentHead);
    }
}