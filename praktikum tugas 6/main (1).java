package pratikum;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
     Manusia mn = new Manusia("Danial", "12341423", true, true);
     Manusia mn2 = new Manusia("Rizka", "21312431", false, true);
     Manusia mn3 = new Manusia("Ajeng", "13213131", false, false);
    
     System.out.println("==========================================");
     System.out.println(mn.toString());
     System.out.println("==========================================");
     System.out.println(mn2.toString());
     System.out.println("==========================================");
     System.out.println(mn3.toString());
     System.out.println("==========================================");

     System.out.println("");
     System.out.println("==========================================");
     MahasiswaFILKOM mf3 = new MahasiswaFILKOM("Dzaky Bewe", "12321312", true, false, "215150201111007", 2.4);
     System.out.println(mf3.toString());
     System.out.println("===========================================");

     System.out.println("");
     System.out.println("==========================================");
     MahasiswaFILKOM mf2 = new MahasiswaFILKOM("Danial", "12321312", true, false, "215150701111007", 3.2);
     System.out.println(mf2.toString());
     System.out.println("===========================================");


     System.out.println("");
     System.out.println("==========================================");
     MahasiswaFILKOM mf = new MahasiswaFILKOM("Rizka", "12313141", false, false, "215150707111029", 4);
     System.out.println(mf.toString());
     System.out.println("===========================================");

     System.out.println("");
     System.out.println("==========================================");
     Pekerja pk1 = new Pekerja("Rizka", "3123123", false, false, 28, 19, "32131213221");
     System.out.println(pk1.toString());
     System.out.println("===========================================");
     
     System.out.println("");
     System.out.println("==========================================");
     Pekerja pk2 = new Pekerja("Iqbal", "3123123", true, true, 7, 22, "32131213221");
     System.out.println(pk2.toString());
     System.out.println("===========================================");

     System.out.println("");
     System.out.println("==========================================");
     Pekerja pk3 = new Pekerja("CUA", "321321321", false, true, 10, 21, "231131321");
     System.out.println(pk3.toString());
     System.out.println("===========================================");

     System.out.println("");
     System.out.println("==========================================");
     Manager mg1 = new Manager("AHMAD", "33341412", true, false, 10, 19, "32131321321", 1000);
     System.out.println(mg1.toString());
     System.out.println("===========================================");

     System.out.println("");
     System.out.println("==========================================");
     Manager mg2 = new Manager("Lyra Hertin", "351707384392", false, false, 9, 20, "204837283728", 200);
     System.out.println(mg2.toString());
     System.out.println("===========================================");

     System.out.println("");
     System.out.println("==========================================");
     Manager mg3 = new Manager("Ferri Abdul", "61237613671", true, false, 8, 25, "20482313131", 20);
     System.out.println(mg3.toString());
     System.out.println("===========================================");
    
    
    }
}
