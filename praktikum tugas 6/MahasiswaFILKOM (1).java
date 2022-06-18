package pratikum;

public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;
    MahasiswaFILKOM(String n, String nk, boolean jk, boolean nkh, String nim, double ipk){
        super(n, nk, jk, nkh);
        this.ipk = ipk;
        this.nim = nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    public String getNim() {
        return nim;
    }
    public double getIpk() {
        return ipk;
    }
    public String getStatus(){
        String angkatan = getNim().substring(0, 2);
        String prodi = getNim().substring(6,7   );

        if(prodi.equals("2")){
            prodi = "Teknik Meniup Gelembung";
        }else if(prodi.equals("3")){
            prodi = "Teknik Berburu Ubur Ubur";
        }else if(prodi.equals("4")){
            prodi = "Sistem Perhamburgeran";
        }else if(prodi.equals("6")){
            prodi = "Pendidikan Chum Bucket";
        }else if(prodi.equals("7")){
            prodi = "Teknologi Telpon Kerang";
        }
        return prodi+ " , 20"+angkatan;        
    }
    public double getBeasiswa(){
        double beasiswa = 0;
        if(getIpk()>=3.5){
            beasiswa = 75;
        }else if(getIpk()>=3.0){
            beasiswa = 50;
        }else{
            beasiswa = 0;
        }
        return beasiswa;
    }
    @Override
    public double getTunjangan() {
        // TODO Auto-generated method stub
        return super.getTunjangan()+getBeasiswa();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nNIM : "+getNim()+"\nIPK : "+getIpk()
        +"\nStatus : "+getStatus();
    }     
}
