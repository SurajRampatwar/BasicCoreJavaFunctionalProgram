import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        integers();
        doubles();
        booleans();
    }

    static void integers() {
        int row, colm;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter row and columns");
        row = n.nextInt();
        colm = n.nextInt();
        int total = row * colm;
        System.out.println("Enter total values = " + total);
        int[][] array = new int[row][colm];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                array[i][j] = n.nextInt();
            }
        }
        PrintWriter writer = new PrintWriter(System.out);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                writer.print(+array[i][j] + " ");
                System.out.println(" ");
            }
            writer.flush();
        }
    }

    static void doubles() {
        int row, colm;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter row and columns");
        row = n.nextInt();
        colm = n.nextInt();
        int total = row * colm;
        System.out.println("Enter total values = " + total);
        double[][] array = new double[row][colm];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                array[i][j] = n.nextDouble();
            }
        }
        PrintWriter writer = new PrintWriter(System.out);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                writer.print(+array[i][j] + " ");
                System.out.println(" ");
            }
            writer.flush();
        }
    }

    static void booleans() {
        int row, colm;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter row and columns");
        row = n.nextInt();
        colm = n.nextInt();
        int total = row * colm;
        System.out.println("Enter total values = " + total);
        boolean[][] array = new boolean[row][colm];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                array[i][j] = n.nextBoolean();
            }
        }
        PrintWriter writer = new PrintWriter(System.out);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                writer.print(array[i][j] + " ");
                System.out.println(" ");
            }
            writer.flush();
        }
    }
}



