package Tugas2;
import java.util.*;

public class MenghitungLuas {
    static class Persegi {
        void LuasPersegi(int sisi) {
            int hasil = sisi * sisi;
            System.out.println(hasil);
        }
    }

    static class Segitiga {
        void LuasSegitiga(int alas, int tinggi) {
            int hasil = alas * tinggi / 2;
            System.out.println(hasil);
        }
    }

    static class Lingkaran {
        void LuasLingkaran(int radius) {
            if (radius % 7 == 0) {
                int rumusluas = (int) (22 / 7 * (Math.pow(radius, 2)));
                System.out.println((double) rumusluas);
            } else {
                int rumusluas = (int) (3.14 * (Math.pow(radius, 2)));
                System.out.println((double) rumusluas);
            }
        }
    }

    public class HitungLuas {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int sisi, alas, tinggi, radius;
            byte pilihan = sc.nextByte();
            switch (pilihan) {
                case 1:
                    sisi = sc.nextInt();
                    Persegi persegi = new Persegi();
                    persegi.LuasPersegi(sisi);
                    break;
                case 2:
                    alas = sc.nextInt();
                    tinggi = sc.nextInt();
                    Segitiga segitiga = new Segitiga();
                    segitiga.LuasSegitiga(alas, tinggi);
                    break;
                case 3:
                    radius = sc.nextInt();
                    Lingkaran lingkaran = new Lingkaran();
                    lingkaran.LuasLingkaran(radius);
                    break;
                default:
                    System.out.println("Input yang anda masukan tidak sesuai");
                    break;
            }
        }
    }
}