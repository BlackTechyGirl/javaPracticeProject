package chapterFour;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the angle from 1 to 10: ");
        int base = input.nextInt();

        for (int i = 1; i <= base; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
