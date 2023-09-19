import java.util.Scanner;

public class AnimalsandLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of chickens: ");
        int chickens = scanner.nextInt();

        System.out.print("Please enter the number of pigs: ");
        int pigs = scanner.nextInt();

        int totalLegs = (chickens * 2) + (pigs * 4);

        System.out.println("The number of legs: " + totalLegs);

        scanner.close();
    }
}
