import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the size of the square: ");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }

}
