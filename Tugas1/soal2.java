package Tugas1;


public class soal2 {
    public static void main(String[] args) {
        int n = 4;

        int i = 1;
        while (i <= n) {
            int spasi = n - i;
            int j = 1;

            while (spasi > 0) {
                System.out.println(" ");
                spasi--;
            }
            while (j <= i) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
