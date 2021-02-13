
import java.util.Scanner;

public class Tugas5 {

    private static Scanner scn = new Scanner(System.in);

    private static String apel(int pcs, String code) {
        int hasil, ttl, total;
        total = 5000 * pcs;
        int diskon = (total - ((total * 10) / 100));

        if (code.equalsIgnoreCase("upscale")) {
            if (total <= 10000) {
                hasil = total - 1000;
                System.out.println("Total bayar Apel (Memasukan kode voucher) : " + hasil);
            } else if (pcs >= 5) {
                hasil = (diskon - 2500) - 1000;
                System.out.println("Total Bayar Apel (Diskon 10% + Rp.2.500 + input kupon) : " + hasil);
            } else if (total >= 50000) {
                ttl = diskon - 2500;
                hasil = (ttl - ((total - 5000) - 2500) - 1000);
                System.out.println("Total Bayar Apel (Mendapatkan tambahan potongan Rp.5000 + input kupon) : " + hasil);
            }
        } else {
            if (pcs >= 5) {
                hasil = diskon - 2500;
                System.out.println("Total Bayar Apel (Diskon 10% dan tambahan potongan Rp.2.500) : " + hasil);
            }

            if (total >= 50000) {
                ttl = diskon - 2500;
                hasil = (ttl - (total - 5000) - 2500);
                System.out.println("Total Bayar Apel (Mendapatkan tambahan potongan Rp.5000) : " + hasil);
            }
        }

        return code;
    }

    private static String jeruk(int pcs, String code) {
        int hasil, ttl, total;
        total = 4500 * pcs;
        int diskon = (total - ((total * 10) / 100));

        if (code.equalsIgnoreCase("upscale")) {
            if (total <= 10000) {
                hasil = total - 1000;
                System.out.println("Total bayar Jeruk (Memasukan kode voucher) : " + hasil);
            } else if (pcs >= 5) {
                hasil = (diskon - 2500) - 1000;
                System.out.println("Total Bayar Jeruk (Diskon 10% + Rp.2.500 + input kupon) : " + hasil);
            } else if (total >= 50000) {
                ttl = diskon - 2500;
                hasil = (ttl - ((total - 5000) - 2500) - 1000);
                System.out
                        .println("Total Bayar Jeruk (Mendapatkan tambahan potongan Rp.5000 + input kupon) : " + hasil);
            }
        } else {
            if (pcs >= 5) {
                hasil = diskon - 2500;
                System.out.println("Total Bayar Jeruk (Diskon 10% dan tambahan potongan Rp.2.500) : " + hasil);
            }

            if (total >= 50000) {
                ttl = diskon - 2500;
                hasil = (ttl - (total - 5000) - 2500);
                System.out.println("Total Bayar Jeruk (Mendapatkan tambahan potongan Rp.5000) : " + hasil);
            }
        }

        return code;
    }

    private static String anggur(int pcs, String code) {
        int hasil, ttl, total;
        total = 500 * pcs;
        int diskon = (total - ((total * 10) / 100));

        if (code.equalsIgnoreCase("upscale")) {
            if (total <= 10000) {
                hasil = total - 1000;
                System.out.println("Total bayar anggur (Memasukan kode voucher) : " + hasil);
            } else if (pcs >= 5) {
                hasil = (diskon - 2500) - 1000;
                System.out.println("Total Bayar anggur (Diskon 10% + Rp.2.500 + input kupon) : " + hasil);
            } else if (total >= 50000) {
                ttl = diskon - 2500;
                hasil = (ttl - ((total - 5000) - 2500) - 1000);
                System.out
                        .println("Total Bayar anggur (Mendapatkan tambahan potongan Rp.5000 + input kupon) : " + hasil);
            }
        } else {
            if (pcs >= 5) {
                hasil = diskon - 2500;
                System.out.println("Total Bayar anggur (Diskon 10% dan tambahan potongan Rp.2.500) : " + hasil);
            }
            if (total >= 50000) {
                ttl = diskon - 2500;
                hasil = (ttl - (total - 5000) - 2500);
                System.out.println("Total Bayar anggur (Mendapatkan tambahan potongan Rp.5000) : " + hasil);
            }
        }

        return code;
    }

    public static void main(String[] args) {

        System.out.print("Kode Voucher : ");
        String code = scn.nextLine();

        System.out.print("Jumlah pcs : ");
        int pcs = scn.nextInt();

        apel(pcs, code);
        jeruk(pcs, code);
        anggur(pcs, code);
    }
}
