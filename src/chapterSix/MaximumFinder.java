package chapterSix;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three floating-point values " +
                "separated by space: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double maximum = maximum(number1, number2, number3);
        double minimum = minimum(number1, number2, number3);

        System.out.println("Maximum is: " + maximum);
        System.out.println("Minimum is: " + minimum);
    }

    public static double maximum(double number1, double number2, double number3) {
//        double maximumValue = number1;
//        if (number2 > maximumValue) {
//            maximumValue = number2;
//        }
//        if (number3 > maximumValue) {
//            maximumValue = number3;
//        }
//        return maximumValue;
        return Math.max(number1, Math.max(number2, number3));
    }

    public static double minimum(double number1, double number2, double number3) {
//        double maximumValue = number1;
//        if (number2 < maximumValue) {
//            maximumValue = number2;
//        }
//        if (number3 < maximumValue) {
//            maximumValue = number3;
//        }
//        return maximumValue;
        return Math.min(number1, Math.min(number2, number3));
    }
}
