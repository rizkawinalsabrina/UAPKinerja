package Tugas1;
import java.io.*;
import java.util.*;


public class SuratKaisar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String kalimat = scan.nextLine();
        int n = scan.nextInt();

        getEnskripsi(kalimat, n);
    }

    static void getEnskripsi(String kalimat, int n){
        for (int i = 0; i < kalimat.length(); i++){
            if (kalimat.charAt(i) >= 65 && kalimat.charAt(i) <= 90){
                if (kalimat.charAt(i) + n > 90)
                    System.out.print((char)(kalimat.charAt(i) + n - 26));
                else
                    System.out.print((char)(kalimat.charAt(i) + n));
            }

            if (kalimat.charAt(i) >= 97 && kalimat.charAt(i) <= 122){
                if (kalimat.charAt(i) + n > 122)
                    System.out.print((char)(kalimat.charAt(i) + n - 26));
                else
                    System.out.print((char)(kalimat.charAt(i) + n));
            }

            if (kalimat.charAt(i) == ' '){
                System.out.print(' ');
            }
        }
    }
}