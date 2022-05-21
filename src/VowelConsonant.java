import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner cHar = new Scanner(System.in);
        String alpha = cHar.next();
        switch (alpha) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(alpha + " IS VOWEL");
                break;
            default:
                System.out.println(alpha + " IS CONSONANT");

        }
    }

}
