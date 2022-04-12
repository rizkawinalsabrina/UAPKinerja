package Tugas1;
import java.io.*;
import java.util.*;

public class Selde {
    public static void selde (String newAngka, String newAngka2){

            boolean check;

            String check1 = newAngka.replaceAll("\\s", "");
            String check2 = newAngka2.replaceAll("\\s", "");

            if(check1.length() != check2.length()){
                check = false ;
            }
            else{
                char[] arrCheck1 = check1.toLowerCase().toCharArray();
                char[] arrCheck2 = check2.toLowerCase().toCharArray();
                check = Arrays.equals(arrCheck1, arrCheck2);
            }

            if(check){
                System.out.println(newAngka + " adalah selde.");
            }
            else{
                System.out.println(newAngka + " bukan selde.");
            }

        }

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner input = new Scanner(System.in);


            int angka = input.nextInt();

            String newAngka = Integer.toString(angka);
            StringBuilder rev = new StringBuilder(newAngka) ;
            rev.reverse();
            String newAngka2 = rev.toString();

            selde(newAngka, newAngka2);
        }
    }