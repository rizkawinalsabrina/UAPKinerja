package pratikum;

public class Manusia {
    private String nama, nik;
    boolean jenisKelamin, menikah;


    Manusia(String n, String nk, boolean jk, boolean nkh){
        this.nama = n;
        this.nik = nk;
        this.jenisKelamin = jk;
        this.menikah = nkh;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getNama() {
        return nama;
    }
    public String getNik() {
        return nik;
    }
    public boolean getJK(){
        return jenisKelamin;
    }
    public void setBoleanM(boolean m){
        this.menikah = m;
    }
    public void setM(boolean m){
        this.menikah = m;
    }
    public boolean getM(){
        return menikah;
    }
    public double getTunjangan(){
        double tunjangan = 0;
        if(getM() == true && getJK()==true){
            tunjangan = 25;
        }else if(getM() == true && getJK()==false){
            tunjangan = 20;
        }else{
            tunjangan = 15;
        }

        return tunjangan;
    }
    public double getPendapatan(){
        return getTunjangan();
    }
    public String toString(){
        String jenisKelamin = null;
        if(getJK() == true){
            jenisKelamin = "Laki Laki";
        }else if(getJK()==false){
            jenisKelamin = "Perempuan";
        }
        return "Nama : "+nama+"\nNIK : "+getNik()+"\nJenis Kelamin : "+jenisKelamin
        +"\nJumlah Pendapatan : "+getTunjangan()+" Dollar";

    }
    
    
}
