package chapterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = input.nextInt();

        System.out.println("Enter the second number: ");
        int second = input.nextInt();

        int firstTripled = first* first*first;
        int secondDoubled = second* second;

        if (firstTripled%secondDoubled == 0) {
            System.out.println("The first number tripled is a multiple of the " +
                    "second number doubled.");
        }else {
            System.out.println("Nahhhh! its not a multiple");
        }
    }
}
