import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("input jumlah mgs");
        n = input.nextInt();

        int nilaiMhs[] = new int[n];
        int total = 0;
        for(int i = 0; i<nilaiMhs.length ; i++){
            System.out.print("input nilai mhs ke " + (i+1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total = total + nilaiMhs[i];


        }
        double rata2 = total/n;
        System.out.println("rata2" + rata2 ) ;

        int min, max;
        min = max = nilaiMhs[0];
        for(int i = 1; i<nilaiMhs.length;i++){
            if (nilaiMhs [i] > max) {
                max = nilaiMhs[i];
            } 
            if (nilaiMhs [i] < min){
                min = nilaiMhs[i]; 
            }
 
        }
        System.out.println(max);
        System.out.println(min);    
    }
    
}