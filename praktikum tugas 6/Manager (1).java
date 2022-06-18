package pratikum;



public class Manager extends Pekerja{
    private int lamaKerja;

    Manager(String n, String nk, boolean jk, boolean nkh, int jK, int hk , String NIP, int d){
        super(n, nk, jk, nkh, jK, hk, NIP);
        this.lamaKerja = d;
        
    }
    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }
    public int getLamaKerja() {
        return lamaKerja;
    }
    @Override
    public double getGaji() {
        // TODO Auto-generated method stub
        
        return super.getGaji();
    }
    @Override
    public double getBonus() {
        // TODO Auto-generated method stub
        int hariLibur = 0;
        int minggu = 0;
        for(int i =1; i<=getHarikerja();i++){
            if((i-minggu)%6==0){
                hariLibur++;
            }
            if(i%7==0){
                hariLibur++;
                minggu++;
            }
        }
        double Lembur = (getJamKerja() -7) < 0 ? 0 : getJamKerja() - 7;
        double bonusLembur = (getHarikerja()-hariLibur) * Lembur * 7;
        double bonusLibur = hariLibur * getJamKerja() * 20;
        double bonus = (bonusLembur * 0.3) + (bonusLibur * 0.3);
        return super.getBonus()+bonus;
    }
    @Override
    public double getTunjangan() {
        // TODO Auto-generated method stub
        return super.getTunjangan()+15;
    }
    @Override
    public double getPendapatan() {
        // TODO Auto-generated method stub
        return this.getTunjangan()+super.getGaji()+this.getBonus();
        
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\nLama Kerja : "+getLamaKerja();
    }
}
