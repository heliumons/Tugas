import java.util.*;
import com.upscale.Pegawai;

class Main {
    private static Scanner s = new Scanner(System.in);
    private String mainMenu, subMenu, name;
    private float temp;
    private Integer sleepHour;

    List<Pegawai> dftrPegawai = new ArrayList<Pegawai>();
    List<String> fitNote = new ArrayList<String>();
    List<String> notFit = new ArrayList<String>();

    Pegawai pegawai;

    public void mainMenu() {
        System.out.println("MAIN MENU");
        System.out.println("=====");

        System.out.println("Entries : " + dftrPegawai.size());
        System.out.println("Fit-To-Work : " + fitNote.size());
        System.out.println("Not Fit : " + notFit.size());

        System.out.println("=====");
        System.out.println("[A]dd New Entry");
        System.out.println("[D]isplay All Entries");
        System.out.println("[E]xit\n");
        System.out.print("Your Input: ");
        mainMenu = s.nextLine();

        do {
            switch (mainMenu) {
                case "A":
                    caseA();
                    break;

                case "D":
                    caseD();
                    break;

                case "E":
                    System.exit(0);
                    break;

                default:
                    System.out.println("You entered a wrong menu\n");
                    break;
            }
        } while (!mainMenu.equals("E"));
    }

    public void subMain() {
        // do {
        System.out.println("[A]dd Another Entry");
        System.out.println("[B]ack to main menu");
        System.out.println("[E]xit\n");
        System.out.print("Your Input: ");
        subMenu = s.next();

        switch (subMenu) {
            case "A":
                caseA();
                break;

            case "B":
                mainMenu();
                break;

            case "E":
                System.exit(0);
                break;

            default:
                System.out.println("You entered a wrong menu\n");
                break;
        }
        // } while (!subMenu.equals("E"));
    }

    public void caseA() {
        System.out.println("ADD NEW ENTRY");
        System.out.println("=====\n");

        System.out.print("Name: ");
        name = s.next();
        System.out.print("Temp (⁰C): ");
        temp = s.nextFloat();
        System.out.print("Sleep Time (hrs): ");
        sleepHour = s.nextInt();

        pegawai = new Pegawai();
        pegawai.setName(name.trim());
        pegawai.setTemp(temp);
        pegawai.setSleepHour(sleepHour);

        System.out.println("");
        if (temp >= 33 && sleepHour >= 6) {
            System.out.println("YOU ARE: FIT TO WORK!\n");
            pegawai.setFitNote("Fit");
            fitNote.add("Fit");
        } else if (temp <= 37 && sleepHour >= 6) {
            System.out.println("YOU ARE: FIT TO WORK!\n");
            pegawai.setFitNote("Fit");
            fitNote.add("Fit");
        } else {
            System.out.println("YOU ARE: NOT FIT TO WORK!\n");
            pegawai.setFitNote("Not Fit");
            notFit.add("Fit");
        }

        dftrPegawai.add(pegawai);
        subMain();
    }

    public void caseD() {
        System.out.println("ALL ENTRY");
        System.out.println("=========");
        for (int x = 0; x < dftrPegawai.size(); x++) {
            System.out.print(dftrPegawai.get(x).getName() + ", " + dftrPegawai.get(x).getTemp() + "⁰C, "
                    + dftrPegawai.get(x).getSleepHour() + "hrs sleep, " + dftrPegawai.get(x).getFitNote() + "\n");
        }

        System.out.println();

        System.out.println("=========");
        subMain();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.mainMenu();
    }
}