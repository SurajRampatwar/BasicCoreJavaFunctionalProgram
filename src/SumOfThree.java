import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        int elements;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter elements");
        elements = scan.nextInt();
        int[] array = new int[elements];
        for (int i = 0; i < elements; i++) {
            array[i] = scan.nextInt();
        }
        int flag = 0;
        System.out.println("Count of triples are ");
        for (int i = 0; i < elements - 2; i++) {
            for (int j = 0; j < elements - 1; j++) {
                for (int k = 0; k < elements; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println(array[i] + " " + array[j] + " " + array[i]);
                        flag = 0;
                    }
                }

            }

        }
        if (flag == 0) {
            System.out.println("0");
        }
    }
}