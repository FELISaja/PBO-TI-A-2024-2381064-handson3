package Tugas1;


import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("masukkan kata dalam format camelCase : ");
        String input = scanner.nextLine();

       int wordCount =1;

       for (int i = 0; i< input.length(); i++){
           if (Character.isUpperCase(input.charAt(i))){
               wordCount++;
           }
       }
        System.out.println("jumlahkata dalam format camelCase: " + wordCount);
    }
}
