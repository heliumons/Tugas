
import java.util.Scanner;

public class Tugas2 {

    private static Scanner scn = new Scanner(System.in);

    private static void kedua(int a, int bil, int ipt, boolean prima) {
        while (a <= ipt) {
            prima = true;
            for (int b = 2; b <= bil / 2; b++) {
                if (bil % b == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                if (a % 10 == 0) {
                    System.out.print(bil + " ");
                } else {
                    System.out.println(bil);
                }
                a++;
            }
            bil++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Buatlah sebuah fungsi untuk membuat n angka yang merupakan bilangan prima.\n");

        int a = 1;
        int bil = 2;
        boolean prima = true;

        System.out.print("N : ");
        int ipt = scn.nextInt();

        kedua(a, bil, ipt, prima);

    }
}
