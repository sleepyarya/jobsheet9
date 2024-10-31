import java.util.Scanner;

import org.xml.sax.SAXParseException;

public class ArrayRataNilai03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;

        // input nilai mhs
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = s.nextInt();
        }
        System.out.println("============================================");
        // menjumlahkan nilai sekarang dengan nilai sebelumnya (5, 10, 15, .....) yang diambil nilai paling akhir hasil penjumlahan
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        System.out.println("============================================");
        // menghitung rata rata nilai mhs
        rata2 = total / nilaiMhs.length;
        System.out.println("Total nilai = " + total);
        System.out.println("rata-rata nilai = " + rata2);

    }
}
