package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles driven: ");
        int miles = input.nextInt();
        System.out.println("Enter gallon used: ");
        int gallon = input.nextInt();

        double total = 0;
        while (miles != -1 && gallon != -1){
            double milesPerGallon = (double) miles /gallon;
            total += milesPerGallon;

            System.out.println("Enter miles driven: ");
            miles = input.nextInt();
            System.out.println("Enter gallon used: ");
            gallon = input.nextInt();
        }
        System.out.printf("Total miles per gallon is: %.2f%n", total);
    }
}
