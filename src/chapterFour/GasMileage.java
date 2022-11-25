package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int milesDriven = 0;
        int gallonsUsed = 0;
        int counter = 0;
        double totalMilesPerGallon = 0;

        System.out.println("Enter the milesDriven: ");
        milesDriven = input.nextInt();
        System.out.println("Enter the gallonsUsed: ");
        gallonsUsed = input.nextInt();

        while (milesDriven != -1 && gallonsUsed !=-1){
            double milesPerGallon = (double) (milesDriven/gallonsUsed);
            totalMilesPerGallon += milesPerGallon;
            counter++;

            System.out.println("Enter the milesDriven: ");
            milesDriven = input.nextInt();
            System.out.println("Enter the gallonsUsed: ");
            gallonsUsed = input.nextInt();
        }
        System.out.println("The total miles per Gallon is: "+ totalMilesPerGallon);
    }
}
