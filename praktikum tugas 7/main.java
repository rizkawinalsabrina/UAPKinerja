package com;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        ArrayList <Pegawai> staff = new ArrayList<Pegawai>();

        staff.add(new PegawaiTetap("Rizka", "21231231312", 100000));
        staff.add(new PegawaiTetap("Aal", "2123321213", 600000));
        staff.add(new PegawaiTetap("Sabrina", "21324342312", 300000));

        staff.add(new PegawaiHarian("Ilhan", "2131312321", 5000, 42));
        staff.add(new PegawaiHarian("Irham", "213656421", 6000, 35));
        staff.add(new PegawaiHarian("Dilan", "213132432", 8500, 50));

        staff.add(new Sales("Jefri", "3213919321", 50, 100000));
        staff.add(new Sales("Nichol", "9090219112", 45, 85000));
        staff.add(new Sales("ilham", "3213919321", 30, 50000));

        for(int i = 0;i<staff.size();i++){
            getToString(staff.get(i));
            System.out.println("-------------------------------------------");
        }
    }
    public static void getToString(Pegawai pgw){
        if(pgw instanceof PegawaiTetap){
            PegawaiTetap pegawaiTetap = (PegawaiTetap) pgw;
            System.out.println(pegawaiTetap.toString());
        }else if(pgw instanceof PegawaiHarian){
            PegawaiHarian pegawaiharian = (PegawaiHarian) pgw; 
            System.out.println(pegawaiharian.toString());
        }else if(pgw instanceof Sales){
            Sales sls = (Sales) pgw; 
            System.out.println(sls.toString());
        }
    }
    
}