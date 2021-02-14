import java.util.*;
import com.upscale.Pegawai;

class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String mainMenu, subMenu, name;
        float temp;
        Integer sleepHour;

        List<Pegawai> dftrPegawai = new ArrayList<Pegawai>();
        Pegawai pegawai;

        do {
            System.out.println("MAIN MENU");
            System.out.println("=====");

            System.out.println("Entries : " + dftrPegawai.size());
            System.out.println("Fit-To-Work : " + dftrPegawai.size());
            System.out.println("Not Fit : " + dftrPegawai.size());

            System.out.println("=====");
            System.out.println("[A]dd New Entry");
            System.out.println("[D]isplay All Entries\n");
            System.out.print("Your Input: ");
            mainMenu = s.nextLine();

            switch (mainMenu) {
                case "A":
                    do {
                        System.out.println("ADD NEW ENTRY");
                        System.out.println("=====\n");

                        System.out.print("Name: ");
                        name = s.next();
                        System.out.print("Temp (⁰C): ");
                        temp = s.nextFloat();
                        System.out.print("Sleep Time (hrs): ");
                        sleepHour = s.nextInt();

                        pegawai = new Pegawai();
                        pegawai.setName(name);
                        pegawai.setTemp(temp);
                        pegawai.setSleepHour(sleepHour);

                        System.out.println("");
                        if (temp >= 33 && sleepHour >= 6) {
                            System.out.println("YOU ARE: FIT TO WORK!\n");
                            pegawai.setFitNote("Fit");
                        } else {
                            System.out.println("YOU ARE: NOT FIT TO WORK!\n");
                            pegawai.setFitNote("Not Fit");
                        }

                        dftrPegawai.add(pegawai);

                        System.out.println("[A]dd Another Entry");
                        System.out.println("[B]ack to main menu\n");
                        System.out.print("Your Input: ");
                        subMenu = s.next();
                    } while (!subMenu.equals("B"));
                    break;

                case "B":
                    System.out.println();

                    break;
                case "D":
                    System.out.println("ALL ENTRY");
                    System.out.println("=====");
                    for (int x = 0; x < dftrPegawai.size(); x++) {
                        System.out.print(dftrPegawai.get(x).getName() + ", " + dftrPegawai.get(x).getTemp() + "⁰C, "
                                + dftrPegawai.get(x).getSleepHour() + "hrs sleep, " + dftrPegawai.get(x).getFitNote()
                                + "\n");
                    }

                    System.out.println();

                    System.out.println("=====");
                    System.out.println("[B]ack to main menu\n");
                    System.out.print("Your Input: ");
                    subMenu = s.nextLine();

                    break;

                default:
                    System.out.println("You entered a wrong menu\n");
                    break;
            }
        } while (!mainMenu.equals(args));
    }
}