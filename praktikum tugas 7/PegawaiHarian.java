package com;

public class PegawaiHarian extends Pegawai{
    double upahperJam;
    int totalJam;
    PegawaiHarian(String n, String NK, double uj, int tj) {
        super(n, NK);
        this.upahperJam = uj;
        this.totalJam = tj;
    }
    public void setUpahperJam(double upahperJam) {
        this.upahperJam = upahperJam;
    }
    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }
    public double getUpahperJam() {
        return upahperJam;
    }
    public int getTotalJam() {
        return totalJam;
    }
    @Override
    public double getGaji(){
        double gaji = 0;
        if(getTotalJam()<=40){
            gaji = getUpahperJam()*getTotalJam();
        }
        else if(getTotalJam()> 40){
            gaji = (getUpahperJam()*getTotalJam())+((getTotalJam()-40)*getUpahperJam()*1.5);
        }
        return super.getGaji()+gaji;
    }
    @Override
    public String toString() {
        return "\nPegawai Harian : "+super.getNama()+ super.toString()+
               "\nUpah/jam  : "+getUpahperJam()+
               "\nTotal Jam Kerja : "+getTotalJam()+
               "\nPendapatan : "+getGaji();
    }
}
