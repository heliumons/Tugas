
import java.util.Scanner;

public class Tugas4 {

    private static Scanner scanner = new Scanner(System.in);

    private static void atas(int input) {
        for (int a = input; a >= 1; a--) {

            for (int b = 1; b < a; b++)
                System.out.print(" ");

            for (int c = a; c <= input; c++)
                System.out.print("* ");

            System.out.println();
        }
    }

    private static void bawah(int input) {
        for (int i = 1; i <= input; i++) {

            for (int k = 1; k <= input; k++)
                System.out.print("* ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println(
                "Buatlah sebuah fungsi yang menerima n, dimana fungsi ini akan membangun rumah berbentuk segiempat dengan atap segitiga.\n");

        int input = 1;

        while (input != 0) {
            System.out.print("Print 0 to exit! \nN : ");
            input = scanner.nextInt();
            atas(input);
            bawah(input);
        }

        System.out.println("Thank you!");

    }
}
