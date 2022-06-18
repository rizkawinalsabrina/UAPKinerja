package com;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;
    Sales(String n, String NK, int p, double k) {
        super(n, NK);
        this.penjualan = p;
        this.komisi = k;
    }
    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }
    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }
    public double getKomisi() {
        return komisi;
    }
    public int getPenjualan() {
        return penjualan;
    }
    @Override
    public double getGaji() {
       
        return super.getGaji()+(super.getGaji()*getPenjualan());
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nSales : "+super.getNama()+
                super.toString()+
               "\nTotal Penjualan : "+getPenjualan()+
               "\nBesaran Komisi : "+getKomisi()+
               "\nPendapatan : "+getGaji();
    }
}
