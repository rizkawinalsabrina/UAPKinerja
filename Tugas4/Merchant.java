/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspratikumrizka;

/**
 *
 * @author LENOVO
 */
public class Merchant {
    private String namaMerchant;
    private String namaProduk;
    private double hargaMakanan;

    Merchant(String namaMerchant, String namaProduk, double hargaMakanan){
        this.namaMerchant = namaMerchant;
        this.namaProduk = namaProduk;
        this.hargaMakanan = hargaMakanan;

    }
    public void setNamaMerchant(String namaMerchant){
        this.namaMerchant = namaMerchant;
    }
    public String getNamaMerchant(){
        return namaMerchant;
    }
     public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    public String getNamaProduk(){
        return namaProduk;
    }
    public void setHargaMakanan(double hargaMakanan){
        this.hargaMakanan = hargaMakanan;
    }
    public double getHargaMakanan(){
        return hargaMakanan;
    }

    
    
}