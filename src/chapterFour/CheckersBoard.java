package chapterFour;

public class CheckersBoard {
    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
                for (int j = 0; j < 16; j++) {
                    if((i+j)%2 == 0) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }

        }
}
