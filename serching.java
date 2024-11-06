public class serching {
    public static void main(String[] args) {
        int data [] = { 5, 10, 15, 20, 25 };
        int kunci = 25;
        for (int i = 0; i < data.length; i++) {
            if (kunci == data[i]) {
                System.out.println("Data " + kunci + " berada di baris " + (i+1));
            }
        }
    }

}