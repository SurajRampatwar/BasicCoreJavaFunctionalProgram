public class Swap {
    public static void main(String[] args) {
        int firstNum = 5;
        int secondNum = 7;
        System.out.println("First number = " + firstNum);
        System.out.println("Second number = " + secondNum);
        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        System.out.println("After swap First number = " + firstNum);
        System.out.println("After swap Second number = " + secondNum);
    }
}
