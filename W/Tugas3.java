
import java.util.Scanner;

public class Tugas3 {

    private static Scanner scanner = new Scanner(System.in);

    private static void genjang(int input) {

        for (int i = 1; i <= input; i++) {

            for (int j = input; j > i; j--)
                System.out.print(" ");

            for (int k = 1; k <= input; k++)
                System.out.print("* ");

            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("Buat sebuah fungsi untuk membuat sebuah bentuk jajaran genjang n x n\n");

        int input = 1;

        while (input != 0) {
            System.out.print("Print 0 to exit! \nN : ");
            input = scanner.nextInt();
            genjang(input);
        }
        System.out.println("Thank you!");
    }
}
