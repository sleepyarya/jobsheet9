import java.util.Scanner;

public class ArrayNilai03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] NilaiAkhir = new int[10];
        for (int i = 0; i < NilaiAkhir.length; i++){
            System.out.println("Masukkan Nilai Akhir ke-"+i+" : ");
            NilaiAkhir[i] = s.nextInt();
        }
        System.out.println("============================================");
        
        for (int i = 0; i < 10; i++){
            // if (NilaiAkhir[i] > 70) {
            // //     System.out.println("Nilai akhir ke-"+i+" Adalah "+NilaiAkhir[i]+" Mahasiswa ke"+i+" Lulus!");
            // }
            if (NilaiAkhir[i] > 70){
                System.out.println("Mahasiswa ke-"+i+ " Lulus");
            }else{
                System.out.println("Mahasiswa ke-"+i+ " Tidak Lulus");
            }
        }
    }
}
