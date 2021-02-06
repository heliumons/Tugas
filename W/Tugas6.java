import java.lang.Math;
import java.util.*;

public class Tugas6 {

    public static void evenNumberCase() {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("This case to display a list of even numbers as your input");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("Your request (input 0 to go back): ");
            try {
                input = scanner.nextInt();
            } catch (Exception e) {
                input = 1;
                scanner.nextLine();
            }
            if (input != 0) {
                // clearScreen();
                System.out.println("Your numbers are:");
                int count = 0;
                int number = 0;
                while (count < input) {
                    if (number % 2 == 0) {
                        System.out.println(number);
                        count++;
                    }
                    number++;
                }
                System.out.println();
            }
        } while (input != 0);
    }

    public static void checkPrime() {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("This case to display a list of prime numbers as your input");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("Your request (input 0 to go back): ");
            try {
                input = scanner.nextInt();
            } catch (Exception e) {
                input = 1;
                scanner.nextLine();
            }
            if (input != 0) {
                // clearScreen();
                System.out.println("Your numbers are:");
                int number = 1;
                if (number < 2) {
                    for (int i = 2; i <= number / 2; i++) {
                        if (number % i == 0) {
                            System.out.println(i);
                        }
                        i++;
                    }
                }
            }
        } while (input != 0);
    }

    // public static void clearScreen() {
    // for (int i = 0; i < 80; i++) {
    // System.out.println(i);
    // }
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ALGO-002 Upscale");
        System.out.println("===========================\n\n");
        int input;
        do {
            System.out.println("Please choose your preview: ");
            System.out.println("1. Even number list");
            System.out.println("2. Prime number list");
            System.out.println("3. Parallelogram");
            System.out.println("4. Build the House");
            System.out.println("5. Point of sales\n\n");
            System.out.print("Your choice: ");
            try {
                input = scanner.nextShort();
            } catch (Exception e) {
                input = -1;
                scanner.nextLine();
            }
            // Tugas6.clearScreen();
            switch (input) {
                case 1:
                    Tugas6.evenNumberCase();
                    break;
                case 2:
                    Tugas6.checkPrime();
                    break;
                // case 3:
                // obj.paralelogramCase();
                // case 4:
                // obj.buildHouseCase();
                // case 5:
                // obj.pointoOfSalesCase();
                default:
                    System.out.println("Sorry, the number that you choose is not available.\n\n");
                    break;
            }
        } while (input != 0);
        // clearScreen();
        System.out.println("Thank you for attending ALGO-002\n\n\n");
    }
    // public static void primeNumberCase(){
    // Scanner scanner = new Scanner(System.in);
    // int input;
    // do
    // System.out.println("This case to display a list of prime numbers as your
    // input");
    // System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    // System.out.print("Your request (input 0 to go back): ");
    // try{
    // input = scanner.nextInt();
    // }
    // catch(Exception e){
    // input = -1;
    // scanner.nextLine();
    // }
    // if(input != 0){
    // clearScreen();
    // System.out.println("Your numbers are:");
    // int count = 0;
    // int number = 2;
    // while(count < input){
    // if(checkPrime(number)){
    // System.out.println(number);
    // count++;
    // }
    // number++;
    // }
    // System.out.println();
    // }
    // }while(input!=0);

    // }

    // public void parallelogramCase(){
    // Scanner scanner = new Scanner(System.in);
    // int input;
    // do{
    // System.out.println("This case to build a parallelogram based on your input");
    // System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    // System.out.print("Your request (input 0 to go back): ");
    // try{
    // input = scanner.nextInt();
    // }
    // catch(Exception e){
    // input = -1;
    // scanner.nextLine();
    // }
    // if(input != 0){
    // clearScreen();
    // System.out.println("Your parallelogram: ");
    // for(i = 0 ; i< input ; i++){
    // for(int j=input-1 j>i;j--){
    // System.out.print(" ");
    // }
    // for(int j=0;j<input;j++){
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // System.out.println();
    // }
    // }
    // while(input != 0);
    // }

    // public void buildRoof(int number, int space) {
    // if (number - 2 > 0)
    // buildRoof(number - 2, space + 1);
    // for (int i = 0; i < space; i++) {
    // System.out.print(" ");
    // }
    // System.out.print("*");
    // for (int i = 0; i < number - 2; i++) {
    // System.out.print(" ");
    // }
    // if (number >= 2)
    // System.out.print("*");
    // System.out.println();
    // }

    // public void buildHouseCase() {
    // Scanner scanner = new Scanner(System.in);
    // int input;
    // do {
    // System.out.println("This case to build a house based on your input");
    // System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    // System.out.print("Your request (input 0 to go back): ");
    // try {
    // input = scanner.nextInt();
    // } catch (Exception e) {
    // input = -1;
    // scanner.nextLine();
    // }
    // if (input != 0) {
    // clearScreen();
    // System.out.println("Your house: ");
    // buildRoof(input, 0);
    // for (int i = 0; i < input; i++) {
    // for (int j = 0; j < input; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // System.out.println();
    // }
    // } while (input != 0);
    // }

    // public void pointOfSalesCase(){
    // Scanner scanner = new Scanner(System.in);
    // int input;
    // final int applePrice = 5000;
    // final int orangePrice = 4500;
    // final int grapePrice = 500;

    // int apple = 0;
    // int orange = 0;
    // int grape = 0;
    // String voucherCode = "";
    // do{
    // System.out.println("This case to emulate a point of sales system");
    // System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\n");

    // System.out.println("Item\t| Price \t | Quantity \t | Sub Total");
    // System.out.println("------------------------------------------------");
    // System.out.println("Apple\t| " + applePrice + "\t\t | " + apple + "\t\t | " +
    // apple * applePrice);
    // System.out.println("Orange\t| " + orangePrice + "\t\t | " + orange + "\t\t |
    // " + orange * orangePrice);
    // System.out.println("Grape\t| " + grapePrice + "\t\t | " + grape + "\t\t | " +
    // grape * grapePrice);
    // int total = (apple * applePrice) + (orange * orangePrice) + (grape *
    // grapePrice);
    // System.out.println();
    // System.out.println("Voucher code: " + voucherCode);
    // System.out.println();
    // System.out.println("Total\t\t\t\t\t | " + total);
    // System.out.println();

    // long discount = 0;
    // if(apple >= 5){
    // discount = Math.round(total * 0.1);
    // if(discount > 2500)
    // discount = 2500;
    // }

    // if(total > 50000)
    // discount += 5000;

    // if(voucherCode.equals("UPSCALE") & total >= 10000)
    // discount += 1000;

    // System.out.println("Discount\t\t\t\t | " + discount);
    // System.out.println("Final Price\t\t\t\t | " + (total - discount));
    // System.out.println("\n");
    // System.out.println("1. Edit number of apple");
    // System.out.println("2. Edit number of orange");
    // System.out.println("3. Edit number of grape");
    // System.out.println("4. Edit voucher code");
    // System.out.print("Your request (input 0 to go back): ");
    // try{
    // input = scanner.nextInt();
    // }
    // catch(Exception e){
    // input = -1;
    // scanner.nextLine();

    // if(input !== 0){
    // switch(input){
    // case 1:
    // int appleInput = 0;
    // do{
    // Boolean error = false;
    // System.out.print("Enter number of apple (0-99): ");
    // try{
    // appleInput = scanner.nextInt();
    // }
    // catch(Exception e){
    // error = true;
    // System.out.println("Please input a correct number");
    // scanner.nextLine();
    // }
    // if(!error){
    // if(appleInput < 0 )
    // System.out.println("The minimum number for apple is 0");
    // if(appleInput > 99 )
    // System.out.println("The maximum number for apple is 99");
    // }
    // } while(appleInput < 0 || appleInput > 99);
    // apple = appleInput;
    // break;
    // case 2
    // int orangeInput = 0;
    // do{
    // Boolean error = false;
    // System.out.print("Enter number of orange (0-99): ");
    // try{
    // orangeInput = scanner.nextInt();
    // }
    // catch(Exception exception){
    // error = true;
    // System.out.println("Please input a correct number");
    // scanner.nextLine();
    // }
    // if(!error){
    // if(orangeInput < 0 )
    // System.out.println("The minimum number for orange is 0");
    // if(orangeInput > 99 )
    // System.out.println("The maximum number for orange is 99");
    // }
    // } while(orangeInput < 0 || orangeInput > 99);
    // orange = orangeInput;
    // break;
    // case 3:
    // int grapeInput = 0;
    // do{
    // Boolean error = false;
    // System.out.print("Enter number of grape (0-99): ");
    // try{
    // grapeInput = scanner.nextDouble();
    // }
    // catch(Exception e){
    // error = true;
    // System.out.println("Please input a correct number");
    // scanner.nextLine();
    // }
    // if(!error){
    // if(grapeInput < 0 )
    // System.out.println("The minimum number for grape is 0");
    // if(grapeInput > 99 )
    // System.out.println("The maximum number for grape is 99");
    // }
    // } while(grapeInput < 0 || grapeInput > 99);
    // grape = grapeInput;
    // break;
    // case 4:
    // System.out.print("Enter voucher code: ");
    // voucherCode = scanner.next();
    // break;
    // }
    // clearScreen();
    // }
    // }
    // while(input != 0);

}