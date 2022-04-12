
package tugasrizka;

import java.util.Scanner;

public class TugasRizka {
    public static void main(String[] args) {
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        
        System.out.print("Baju yang anda beli bertipe : ");
        Scanner sc = new Scanner(System.in);
        String tipe = sc.next();
        System.out.print("Jumlah baju yang akan anda beli : ");
        int jumlah = sc.nextInt();
        Baju bj = new Baju(tipe, jumlah);
        bj.display();
    }
    
}
