package pratikum;

import static java.time.LocalDate.parse;
import java.nio.channels.Pipe;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Pekerja extends Manusia{
    private double gaji,bonus;
    private int jamKerja, harikerja;
    private String NIP;

    Pekerja(String n, String nk, boolean jk, boolean nkh, int jK, int hk , String NIP){
        super(n, nk, jk, nkh);
        this.jamKerja = jK;
        this.harikerja = hk;
        this.NIP = NIP;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    public void setHarikerja(int harikerja) {
        this.harikerja = harikerja;
    }
    public void setNIP(String nIP) {
        NIP = nIP;
    }
    public double getBonus() {
        int hariLibur=0;
        if(getHarikerja()>=28){
            hariLibur = 8;
            bonus = hariLibur*jamKerja*20;
        }else if(getHarikerja()>=21){
            hariLibur = 6;
            bonus = hariLibur*jamKerja*20;
        }else if(getHarikerja()>=14){
            hariLibur = 4;
            bonus = hariLibur*jamKerja*20;
        }else if(getHarikerja()>=7){
            hariLibur = 2;
            bonus = hariLibur*jamKerja*20;
        }
        int hariKosong = getHarikerja()-hariLibur;
        double gajiLembur=0;
        if(getJamKerja()>7){
            gajiLembur = 7*hariKosong*(getJamKerja()-7);
        }
        return bonus+gajiLembur;
    }
    public double getGaji() {
        return getHarikerja()*getJamKerja()*15;
    }
    public int getHarikerja() {
        return harikerja;
    }
    public int getJamKerja() {
        return jamKerja;
    }
    public String getNIP() {
        return NIP;
    }
    public String getStatus(){
        String departemen=null,kantor=null, kantorCabang;
       
        if(getNIP().substring(0,1).equals("1")){
            kantor = "Mondstadt";
        }else if(getNIP().substring(0,1).equals("2")){
            kantor = "Liyue";
        }else if(getNIP().substring(0,1).equals("3")){
            kantor = "Inazuma";
        }else if(getNIP().substring(0,1).equals("4")){
            kantor = "Sumeru";
        }else if(getNIP().substring(0,1).equals("5")){
            kantor = "Fontaine";
        }else if(getNIP().substring(0,1).equals("6")){
            kantor = "Natlan";
        }else if(getNIP().substring(0,1).equals("7")){
            kantor = "Snezhnaya";
        }

       kantorCabang = getNIP().substring(2,3);

       if(getNIP().substring(6,7).equals("1")){
           departemen = "Pemasaran";
       }else if(getNIP().substring(6,7).equals("2")){
        departemen = "Humas";
       }else if(getNIP().substring(6,7).equals("3")){
        departemen = "Riset";
       }else if(getNIP().substring(6,7).equals("4")){
        departemen = "Teknologi";
       }else if(getNIP().substring(6,7).equals("5")){
        departemen = "Personalia";
       }else if(getNIP().substring(6,7).equals("6")){
        departemen = "Akademik";
       }else if(getNIP().substring(6,7).equals("7")){
        departemen = "Administrasi";
       }else if(getNIP().substring(6,7).equals("8")){
        departemen = "Operasional";
       }else if(getNIP().substring(6,7).equals("9")){
        departemen = "Pembangunan";
       }

       return departemen+", "+kantor+" cabang "+kantorCabang;
    }
    @Override
    public double getTunjangan() {
        // TODO Auto-generated method stub
        return super.getTunjangan()+getBonus()+getGaji();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\nBonus : "+getBonus()+"\nGaji : "+getGaji()
        +"\nStatus : "+getStatus();
    }

}
