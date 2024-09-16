package Tugas1;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("masukkan jumlah elemen array : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("masukkan elemen-elemen array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++){
            sum+=arr[i];
        }
        System.out.println("jumlah elemen array adalah+ " + sum);
    }
}
