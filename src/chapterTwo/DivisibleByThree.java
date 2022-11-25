package chapterTwo;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number%3 == 0) {
            System.out.println("This number is divisible by three");
        }else {
            System.out.println("This number is not divisible by three");
        }
    }
}
