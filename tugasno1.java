import java.util.Scanner;

public class tugasno1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Input jumlah mhs = ");
        n = s.nextInt();

        int nilaiMhs[] = new int[n];
        int total = 0;
        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.println("Input jumlah mhs ke-"+(i+1)+" : ");
            nilaiMhs[i] = s.nextInt();
            total += nilaiMhs[i];
        }
        double rata2 = total/n;
        System.out.println("Rata2 = "+rata2);

        int min, max;
        min=max=nilaiMhs[0];
        for(int i = 1; i > nilaiMhs.length; i++){
            if(nilaiMhs[i] > max){
                max = nilaiMhs[i];

            }
            if (nilaiMhs[i] < min) {
                min = nilaiMhs[i];
            }System.out.println(min);
            System.out.println(max);
        }
        

    }
}
