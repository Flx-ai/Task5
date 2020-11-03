package vsu.cs.ru.num18;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int height = readHeight();
        System.out.println();

        if (height <= 0 ) {
            System.out.println("You entered incorrect height. The height must be greater than or equal to 1.");
            return;
        }

        drawFigure(height);
    }

    private static int readHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input height: ");
        return scanner.nextInt();
    }

    private static void drawFigure(int height) {
        int lengthOfString = height;

        for (int row = 0; row <= height; row++) {
            for (int characterPosition = 0; characterPosition < lengthOfString; characterPosition++) {
                if (row % 2 == 0 && characterPosition % 2 == 0 && characterPosition >= row) {
                    System.out.print("\\");
                    continue;
                }
                if (row % 2 != 0 && characterPosition % 2 != 0 && characterPosition >= row) {
                    System.out.print("\\");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
