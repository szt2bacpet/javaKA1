import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the pyramid height: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            // Print spaces to center-align the pyramid
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the current row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line for the next row
            System.out.println();
        }

        scanner.close();
    }
}
