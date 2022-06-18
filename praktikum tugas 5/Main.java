package PratikumPemlan;
public class Main {
    public static void main(String[] args) {
         
        CarRider ahmad = new CarRider("Ahmad", 18, "085232131231");
        CarRider danial = new CarRider("Daniall", 19, "08231242342");
        CarRider nabil = new CarRider("Nabil", 20, "081314123432");
        CarRider cua = new CarRider("Cua Momo", 17, "0852041810481");

        CarData data = new CarData();
        data.addCar("SUV", "BA 2133 QF", " Toyota");
        data.addCar("SPORT", "BA 1234 YP", " Ferrari");
        data.addCar("TRUCK", "BA 1232 AF", " FUSO");
        data.addCar("PICK UP", "BA 3341 GH", " Mitsubisi");

        data.listOfCar();
        System.out.println();
       
        RentArchive arsip = new RentArchive();
        arsip.Rent(ahmad, data.getCarList().get(1), 9);
        arsip.Rent(danial, data.getCarList().get(2), 3);
        arsip.Rent(nabil, data.getCarList().get(3), 2);
        arsip.Rent(cua, data.getCarList().get(2), 8);

        System.out.println();
        arsip.info();

        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("DIBUAT OLEH");
        System.out.println("--------------------------------------------");
        System.out.println("NAMA          : Rizka Winal Sabrina");
        System.out.println("NIM           : 215150707111029");
        System.out.println("--------------------------------------------");
    }   
}