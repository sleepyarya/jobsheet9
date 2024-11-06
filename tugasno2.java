import java.util.Scanner;

public class tugasno2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Jumlah pesanan : ");
        n = s.nextInt();
        String[] menu = new String[n];
        int[] harga = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("menu "+(i+1)+" : ");
            menu[i] = s.nextLine();
            System.out.println("harga "+(i+1)+" : ");
            harga[i] = s.nextInt();

        }
        int total= 0;
        for(int i = 0; i < harga.length; i++){
            total += harga[i];

        }
        
    }
}