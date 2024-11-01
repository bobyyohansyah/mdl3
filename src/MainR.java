import refactor.persegi;
import refactor.persegipanjang;
import refactor.segitiga;

import java.util.Scanner;

public class MainR {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            System.out.println("Selamat datang di Kalkulator hitung luas");
            System.out.println("1. Hitung Luas Persegi");
            System.out.println("2. Hitung Luas Persegi Panjang");
            System.out.println("3. Hitung Luas Segitiga");
            System.out.print("Pilih No 1-3: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi persegi: ");
                    double sisi = input.nextDouble();
                    System.out.println("Luas Persegi adalah: " + Tugas4R.hitungPersegi(new persegi(sisi)) + " cm²");
                    ulang = false;
                    break;

                case 2:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    double lebar = input.nextDouble();
                    System.out.println("Luas Persegi Panjang adalah: " + Tugas4R.hitungPersegiPanjang(new persegipanjang(panjang, lebar)) + " cm²");
                    ulang = false;
                    break;

                case 3:
                    System.out.print("Masukkan alas segitiga: ");
                    double alas = input.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggi = input.nextDouble();
                    System.out.println("Luas Segitiga adalah: " + Tugas4R.hitungSegitiga(new segitiga(alas, tinggi)) + " cm²");
                    ulang = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid, pilih no 1-3.");
                    break;
            }
        }

        input.close();
    }
}
