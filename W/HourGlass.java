
import java.util.Scanner;

public class HourGlass {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("HOURGLASS");
        System.out.println("=====\n");

        Integer input = 1;

        while (input != 0) {
            System.out.print("Input size of hourglass (0 to exit): ");
            input = scanner.nextInt();

            for (int i = 1; i <= input; i++) {

                for (int j = 1; j < i; j++)
                    System.out.print("  ");

                for (int k = i; k <= input * 2 - i; k++)
                    System.out.print("* ");

                System.out.println();
            }

            for (int a = input - 1; a >= 1; a--) {

                for (int b = 1; b < a; b++)
                    System.out.print("  ");

                for (int c = a; c <= input * 2 - a; c++)
                    System.out.print("* ");

                System.out.println();
            }
        }
        System.out.println("Thank you!");

    }
}
