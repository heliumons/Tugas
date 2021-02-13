import java.util.*;
import com.upscale.Pegawai;

class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String name;
        int age;
        String lanjut;

        List<Pegawai> daftarSiswa = new ArrayList<Pegawai>();

        Pegawai pegawai;

        do {
            System.out.print("Name : ");
            name = s.nextLine();

            System.out.print("Age : ");

            age = Integer.parseInt(s.nextLine());

            pegawai = new Pegawai();

            pegawai.setName(name);
            pegawai.setAge(age);

            daftarSiswa.add(pegawai);

            System.out.print("Continue [y/n] : ");
            lanjut = s.nextLine();
        } while (!lanjut.equals("n"));

        for (int x = 0; x < daftarSiswa.size(); x++) {
            System.out.println();
            System.out.println("[" + x + "]");
            System.out.println("Name : " + daftarSiswa.get(x).getName());
            System.out.println("Age : " + daftarSiswa.get(x).getAge());
        }
    }
}