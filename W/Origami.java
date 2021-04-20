
import java.util.*;

public class Origami {
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
       int width = 20;
       int height = 20;
       System.out.print("N : ");
       int n = scn.nextInt();

       System.out.println(width / (2 ^ ((n+1) / 2)));
       System.out.println(height / (2 ^ (n / 2)));
    }
}