package com;

public class PegawaiTetap extends Pegawai{
    double upah;
    PegawaiTetap(String n, String NK, double u) {
        super(n, NK);
        this.upah = u;
    }
    public void setUpah(double upah) {
        this.upah = upah;
    }
    public double getUpah() {
        return upah;
    }
    @Override
    public double getGaji() {
        
        return super.getGaji()+getUpah();
    }
    @Override
    public String toString() {
        return "\nPegawai Tetap : "+super.getNama()+super.toString()
        +"\nUpah : "+getUpah()+"\nPendapatan : "+getGaji();
    }
}
