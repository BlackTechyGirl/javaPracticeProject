package chapterTwo;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        double weightPounds = input.nextDouble();
        System.out.println("Enter your height in inches: ");
        double heightInches = input.nextDouble();

        System.out.println("Enter your weight in kilograms: ");
        double weightKg = input.nextDouble();
        System.out.println("Enter your height in meters: ");
        double heightM = input.nextDouble();

        double BMIPPerInchesSquare = (weightPounds * 703)/(heightInches*heightInches);
        double BMIPPer = weightKg/(heightM*heightM);

        System.out.printf("Your Body Mass Index: %.2f  %.2f%n", BMIPPerInchesSquare, BMIPPer);
        System.out.println("BMI Categories:\n" +
                "Underweight = <18.5\n" +
                "Normal weight = 18.5–24.9\n" +
                "Overweight = 25–29.9\n" +
                "Obesity = BMI of 30 or greater\n");

    }
}
