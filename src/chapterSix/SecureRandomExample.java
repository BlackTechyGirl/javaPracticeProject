package chapterSix;

import java.security.SecureRandom;

public class SecureRandomExample {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
//        int randomValue = randomNumbers.nextInt();
//        randomValue = randomNumbers.nextInt(2); //2 is the scaling factor
//        int diceFace = randomNumbers.nextInt(6);
//        diceFace = 1 + randomNumbers.nextInt(6); // 1 is the shifting value
//        int number = 2 + 3 * randomNumbers.nextInt(5);
//        int number = shiftingValue +
//                differenceBetweenValues * randomNumbers.nextInt(scalingFactor);

        for (int counter = 1; counter <= 20 ; counter++) {
            int face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ", face);

            if (counter % 5 == 0){
                System.out.println();
            }
        }
    }
}
