package com;

public class Pegawai {
    String nama, noKtp;

    Pegawai(String n, String NK){
        this.nama = n;
        this.noKtp = NK;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }
    public String getNama() {
        return nama;
    }
    public String getNoKtp() {
        return noKtp;
    }
    public double getGaji(){
        return 0;
    }
    public String toString(){
        return "\nNo. KTP : "+getNoKtp();
    }
}
