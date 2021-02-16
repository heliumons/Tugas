import java.util.*;

public class Tugas1 {

    private static Scanner s = new Scanner(System.in);

    public void mainCaseA() {
        String subMenu, name;
        float suhu;
        Integer jam;
        boolean askForAnother = false;

        System.out.println("ADD NEW ENTRY");
        System.out.println("=====\n");

        System.out.print("Name: ");
        name = s.next();
        System.out.print("Temp (⁰C): ");
        suhu = s.nextFloat();
        System.out.print("Sleep Time (hrs): ");
        jam = s.nextInt();

        System.out.println("");
        if (suhu >= 33 && jam >= 6) {
            System.out.println("YOU ARE: FIT TO WORK!\n");
        } else if (suhu <= 37) {
            System.out.println("YOU ARE: FIT TO WORK!\n");
        } else {
            System.out.println("YOU ARE: NOT FIT TO WORK!\n");
        }

        do {
            System.out.println("[A]dd Another Entry");
            System.out.println("[B]ack to main menu\n");
            System.out.print("Your Input: ");
            subMenu = s.next();

            switch (subMenu) {
                case "A":
                    System.out.println("ADD ANOTHER ENTRY");
                    System.out.println("=====\n");

                    System.out.print("Name: ");
                    name = s.next();
                    System.out.print("Temp (⁰C): ");
                    suhu = s.nextFloat();
                    System.out.print("Sleep Time (hrs): ");
                    jam = s.nextInt();

                    System.out.println("");
                    if (suhu >= 33 && jam >= 6) {
                        System.out.println("YOU ARE: FIT TO WORK!\n");
                    } else if (suhu <= 37) {
                        System.out.println("YOU ARE: FIT TO WORK!\n");
                    } else {
                        System.out.println("YOU ARE: NOT FIT TO WORK!\n");
                    }
                    break;

                case "B":
                    askForAnother = true;
                    break;

                default:
                    System.out.println("You entered a wrong menu");
                    break;
            }

        } while (!askForAnother);
    }

    public void mainCaseD() {
        String subMenu;
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
        System.out.println("[E]dit Existing Record");
        System.out.println("[D]elete Existing Record");
        System.out.println("[B]ack to main menu\n");
        System.out.print("Your Input: ");
        subMenu = s.nextLine();

        switch (subMenu) {
            case "B":
                break;
            case "D":
                break;

            case "E":
                break;

            default:
                System.out.println("You entered a wrong menu");
                break;
        }

    }

    public static void main(String[] args) {
        String mainMenu;
        Tugas1 obj = new Tugas1();

        do {
            System.out.println("MAIN MENU");
            System.out.println("=====");
            System.out.println("[A]dd New Entry");
            System.out.println("[D]isplay All Entries\n");
            System.out.print("Your Input: ");
            mainMenu = s.nextLine();

            switch (mainMenu) {
                case "A":
                    obj.mainCaseA();
                    break;

                case "D":
                    obj.mainCaseD();
                    break;

                default:
                    System.out.println("You entered a wrong menu\n");
                    break;
            }
        } while (!mainMenu.equals(args));
    }
}