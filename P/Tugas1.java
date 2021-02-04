import java.util.*;

public class Tugas1 {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String mainMenu, subMenu;

        do {

            System.out.println("MAIN MENU");
            System.out.println("=====");
            System.out.println("[A]dd New Entry");
            System.out.println("[D]isplay All Entries\n");
            System.out.print("Your Input: ");
            mainMenu = s.nextLine();

            switch (mainMenu) {
                case "A":
                    System.out.println("ADD NEW ENTRY");
                    System.out.println("=====\n");

                    System.out.print("Name: ");
                    String nama = s.nextLine();
                    System.out.print("Temp (⁰C): ");
                    double suhu = s.nextDouble();
                    System.out.print("Sleep Time (hrs): ");
                    int jam = s.nextInt();

                    System.out.println("");
                    if (suhu >= 30 && jam >= 6) {
                        System.out.println("YOU ARE: FIT TO WORK!\n");
                    } else {
                        System.out.println("YOU ARE: NOT FIT TO WORK!\n");
                    }
                    // System.out.println("[A]dd Another Entry");
                    // System.out.println("[B]ack to main menu");
                    // System.out.print("Your Input: ");
                    // mainMenu = s.nextLine();

                    break;
                case "D":
                    System.out.println("ALL ENTRY");
                    System.out.println("=====");
                    String[] nm = { "Pras", "Martin", "Aryo" };
                    double[] sh = { 35.1, 35.1, 36 };
                    int[] jm = { 8, 3, 7 };
                    String[] stm = { "Fit", "Not Fit", "Fit" };

                    System.out.println(nm[0] + ", " + sh[0] + "⁰C, " + jm[0] + "hrs sleep, " + stm[0]);
                    System.out.println(nm[1] + ", " + sh[1] + "⁰C, " + jm[1] + "hrs sleep, " + stm[1]);
                    System.out.println(nm[2] + ", " + sh[2] + "⁰C, " + jm[2] + "hrs sleep, " + stm[2]);
                    System.out.println("");

                    System.out.println("=====");
                    System.out.println("[B]ack to main menu\n");
                    System.out.print("Your Input: ");
                    mainMenu = s.nextLine();

                    break;
                default:
                    System.out.println("You entered a wrong menu");
                    break;
            }

        } while (mainMenu.equals("B"));
    }
}