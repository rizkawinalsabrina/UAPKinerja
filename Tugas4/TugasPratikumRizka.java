package tugaspratikumrizka;

import java.util.Scanner;

public class TugasPratikumRizka {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        int input = 0;
        do{
        DataMerchant.Menu();
        input = sc.nextInt();
        switch(input){
            case 1 : DataMerchant.tampilData(); break;
            case 2 :
                DataMerchant.nambahMerchant();
                break;
            case 3 :
                 DataMerchant.cariMerchant();
                 break;
            case 4 :
                 DataMerchant.updateMerchant();
                 break;
            case 5 :
                System.err.println("Terima Kasih"); break;
            default:
                System.out.println("Inputan Anda Tidak Tersedia");
        
    }
        }while(input != 5);
   }
}
