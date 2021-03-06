
import java.util.Scanner;

public class Tugas5 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input;
        final int applePrice = 5000;
        final int orangePrice = 4500;
        final int grapePrice = 500;

        int apple = 0;
        int orange = 0;
        int grape = 0;
        String voucherCode = "";
        do {
            System.out.println("This case to emulate a point of sales system");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");

            System.out.println("Item\t| Price \t | Quantity \t | Sub Total");
            System.out.println("------------------------------------------------");
            System.out.println("Apple\t| " + applePrice + "\t\t | " + apple + "\t\t | " + apple * applePrice);
            System.out.println("Orange\t| " + orangePrice + "\t\t | " + orange + "\t\t | " + orange * orangePrice);
            System.out.println("Grape\t| " + grapePrice + "\t\t | " + grape + "\t\t | " + grape * grapePrice);
            int total = (apple * applePrice) + (orange * orangePrice) + (grape * grapePrice);
            System.out.println();
            System.out.println("Voucher code: " + voucherCode);
            System.out.println();
            System.out.println("Total\t\t\t\t\t | " + total);
            System.out.println();

            long discount = 0;
            if (apple >= 5) {
                discount = Math.round(total * 0.1);
                if (discount > 2500) {
                    discount = 2500;
                }
            }

            if (total > 50000) {
                discount += 5000;
            }

            if (voucherCode.equals("UPSCALE") & total >= 10000) {
                discount += 1000;
            }
            System.out.println("Discount\t\t\t\t | " + discount);
            System.out.println("Final Price\t\t\t\t | " + (total - discount));
            System.out.println("\n");
            System.out.println("1. Edit number of apple");
            System.out.println("2. Edit number of orange");
            System.out.println("3. Edit number of grape");
            System.out.println("4. Edit voucher code");
            System.out.print("Your request (input 0 to go back): ");
            try {
                input = scanner.nextInt();
            } catch (Exception e) {
                input = -1;
                scanner.nextLine();
            }
            if (input != 0) {
                switch (input) {
                    case 1:
                        int appleInput = 0;
                        do {
                            Boolean error = false;
                            System.out.print("Enter number of apple (0-99): ");
                            try {
                                appleInput = scanner.nextInt();
                            } catch (Exception exception) {
                                error = true;
                                System.out.println("Please input a correct number");
                                scanner.nextLine();
                            }
                            if (!error) {
                                if (appleInput < 0)
                                    System.out.println("The minimum number for apple is 0");
                                if (appleInput > 99)
                                    System.out.println("The maximum number for apple is 99");
                            }
                        } while (appleInput < 0 || appleInput > 99);
                        apple = appleInput;
                        break;

                    case 2:
                        int orangeInput = 0;
                        do {
                            Boolean error = false;
                            System.out.print("Enter number of orange (0-99): ");
                            try {
                                orangeInput = scanner.nextInt();
                            } catch (Exception exception) {
                                error = true;
                                System.out.println("Please input a correct number");
                                scanner.nextLine();
                            }
                            if (!error) {
                                if (orangeInput < 0)
                                    System.out.println("The minimum number for orange is 0");
                                if (orangeInput > 99)
                                    System.out.println("The maximum number for orange is 99");
                            }
                        } while (orangeInput < 0 || orangeInput > 99);
                        orange = orangeInput;
                        break;

                    case 3:
                        int grapeInput = 0;
                        do {
                            Boolean error = false;
                            System.out.print("Enter number of grape (0-99): ");
                            try {
                                grapeInput = scanner.nextInt();
                            } catch (Exception exception) {
                                error = true;
                                System.out.println("Please input a correct number");
                                scanner.nextLine();
                            }
                            if (!error) {
                                if (grapeInput < 0) {
                                    System.out.println("The minimum number for grape is 0");
                                }
                                if (grapeInput > 99) {
                                    System.out.println("The maximum number for grape is 99");
                                }
                            }
                        } while (grapeInput < 0 || grapeInput > 99);
                        grape = grapeInput;
                        break;

                    case 4:
                        System.out.print("Enter voucher code: ");
                        voucherCode = scanner.next();
                        break;
                    default:
                        System.out.println("You entered a wrong menu");
                        break;
                }
            }
        } while (input != 0);
    }
}
