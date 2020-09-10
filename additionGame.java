import java.util.Scanner;
import java.util.Random;

public class additionGame {
    public static void main(String args[]) {

        Random randomNumberVal = new Random();
        int number1;
        number1 = 0;
        int number2;
        number2 = 0;
        int finalNum;
        finalNum = 0;

        number1 = randomNumberVal.nextInt(100);
        System.out.println("Number 1: " + number1);
        number2 = randomNumberVal.nextInt(100);
        System.out.println("Number 2:" + number2);
        finalNum = number1 + number2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your answer: ");
        int answer = input.nextInt();
        if (finalNum == answer) {
            System.out.println("true;");
        } else {
            System.out.println("false");
        }

    }
}