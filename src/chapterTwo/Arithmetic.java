package chapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int first = input.nextInt();

        System.out.println("Enter the Second Number: ");
        int second = input.nextInt();

        int squareFirst = first * first;
        int squareSecond = second * second;

        int sum = squareFirst + squareSecond;
        int difference = squareFirst - squareSecond;

        System.out.println("First Square: \n" + squareFirst );
        System.out.println("Second Square: \n" + squareSecond );
        System.out.println("Sum: \n" + sum );
        System.out.println("Difference: \n" + difference );

    }
}
