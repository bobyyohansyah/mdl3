import refactor.persegi;
import refactor.persegipanjang;
import refactor.segitiga;

public class Tugas4R {

    public static double hitungSegitiga(segitiga segitiga) {
        return 0.5 * segitiga.alas() * segitiga.tinggi();
    }

    public static double hitungPersegiPanjang(persegipanjang persegipanjang) {
        return persegipanjang.panjang() * persegipanjang.lebar();
    }

    public static double hitungPersegi(persegi persegi) {
        return persegi.sisi() * persegi.sisi();
    }
}
