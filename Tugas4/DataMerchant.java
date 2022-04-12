package tugaspratikumrizka;

import java.util.Scanner;

public class DataMerchant {
    static Merchant[] merc = new Merchant[0];
    static Scanner sc = new Scanner(System.in);
    static double harga;
    public static int tambah(int baru){
        return baru;
    }
    public static void nambahMerchant(){
                System.out.print("Masukkan Merchant : ");
                String merchant = sc.nextLine();
                
                System.out.print("Masukkan Produk   : ");
                String produk = sc.nextLine();
                System.out.print("Harga barang      : ");
                double harga = sc.nextDouble();
        DataMerchant.merc = tambahMerchant(new Merchant(merchant, produk, harga));
    }
    public static void cariMerchant(){
        System.out.print("Pilih Mechant yang mau dicari : ");
        String namaMerchant = sc.nextLine();
        sc.next();
        for(Merchant merchant : merc){
            if(namaMerchant.equalsIgnoreCase(merchant.getNamaMerchant())){
                System.out.println("Hasil Pencarian Anda");
                System.out.println("Nama Merchant   : "+merchant.getNamaMerchant());
                System.out.println("Nama Produk     : "+merchant.getNamaProduk());
                System.out.println("Harga           : "+(int)merchant.getHargaMakanan());
            }
        }
    }
    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant[] temp = new Merchant[DataMerchant.merc.length+1];
        for (int i = 0; i < DataMerchant.merc.length; i++) {
            temp[i] = DataMerchant.merc[i];
        }
        temp[temp.length - 1] = merchant;
        return temp;
    }
    public static void tampilData(){
        for (Merchant merchant : merc) {
            System.out.println("==== Tampilan Data Merchant UBFood ====");
            System.out.println("Nama Merchant   : "+merchant.getNamaMerchant());
            System.out.println("Nama Produk     : "+merchant.getNamaProduk());
            System.out.println("Harga           : "+(int)merchant.getHargaMakanan());
        }
    }
    public static void updateMerchant(){
        System.out.print("Nama Merchant yang akan di update : ");
        String nama = sc.nextLine();
        for(Merchant merchant : merc){
            if(nama.equalsIgnoreCase(merchant.getNamaMerchant())){
                System.out.print("Masukkan nama produk : ");
                String namaProduk = sc.nextLine();
                System.out.print("Masukkan Harga Produk yang akan di update : ");
                harga = sc.nextDouble();
                merchant.setHargaMakanan(harga);
            }
        }
    }
    
    static void Menu(){
        System.out.println("==== Selamat Datang di UBFood ====");
        System.out.println("1. Tampil Data");
        System.out.println("2. Tambah Merchant");
        System.out.println("3. Cari Merchant");
        System.out.println("4. Update Merchant");
        System.out.println("5. Keluar");
        System.out.print("Masukkan Inputan Anda : ");
    }

}
