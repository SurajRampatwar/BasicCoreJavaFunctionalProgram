import java.util.Scanner;

public class HarmonicNum {


    public static void main(String[] args) {
        double harmonic = 0;
        int N;
        System.out.println("Enter Harmonic Number");
        Scanner hrmnk = new Scanner(System.in);
        N = hrmnk.nextInt();
        if (N != 0) {
            for (int i = 1; i <= N; i++) {
                harmonic += (double) 1 / i;
            }
            System.out.println(harmonic);
        } else {
            System.out.println("Invalid number");
        }
    }
}
