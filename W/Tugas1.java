
import java.util.Scanner;

public class Tugas1 {

    private static Scanner scn = new Scanner(System.in);

    private static void genap(int n, int output) {
        for (int i = 0; i < n; i++) {
            System.out.println(output);
            output = output + (2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Buatlah sebuah fungsi untuk membuat n angka yang merupakan bilangan genap.\n");
        System.out.print("N : ");
        int n = scn.nextInt();
        int output = 0;

        genap(n, output);
    }

}
