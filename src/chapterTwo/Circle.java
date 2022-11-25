package chapterTwo;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for radius: ");
        double radius = input.nextDouble();

        System.out.printf("Diameter: %.2f%n", (2*radius));
        System.out.printf("Circumference: %.2f%n", (2* Math.PI*radius));
        System.out.printf("Area: %.2f%n", Math.PI *(radius*radius));
    }
}
