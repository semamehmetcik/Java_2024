package day15_methodOlusturmaVeKullanma;

public class C07_MethodlariKullanma {
    public static void main(String[] args) {

        // 6! 'i yazdirin
        C02_MethodOlusturma.faktoryelDegeriYazdir(4); // 4! = 24

        // 10! i yazdirin
        C02_MethodOlusturma.faktoryelDegeriYazdir(10); // 10! = 3628800

        // 20719 asal ise true, asal degilse false yazdirin
        C03_MethodOlusturma_AsalMi.asalMi(20719); // true

        System.out.println(C05_IsimDuzenle.ismiDuzenle("CEM", "BAKIR")); // Cem Bakir

        // MEHMET AVCI ismini duzenleyip, olusturdugunuz yeniOrenci String'ine atayin

        String yeniOgrenci = C05_IsimDuzenle.ismiDuzenle("MEHMET","AVCI");

    }
}
