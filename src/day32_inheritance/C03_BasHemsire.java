package day32_inheritance;

public class C03_BasHemsire extends C01_Personel{

    /*
        1- Child class baslangic itibariyle
           Parent class'daki tum ozelliklere (variable / method) sahip olur

        2- Child class ISTERSE bazi ozellikleri
           kendisine uyarlayabilir
           maas() ve statu gibi

        3- Child class ISTERSE parent class'da olmayan
           bazi ozellikleri ekleyebilir
           nobet gibi...

     */

    String statu = "Bashemsire";
    String nobet = "haftada 1 gun";


    public static void main(String[] args) {


        C03_BasHemsire basHemsire1 = new C03_BasHemsire();

        basHemsire1.isim = "Ayse";
        basHemsire1.adres = "Cankaya";
        basHemsire1.dogumTarihi = "1.1.1971";
        basHemsire1.telefon = "05343453637";


        System.out.println(basHemsire1);

        basHemsire1.maas();


    }

    public void maas(){
        System.out.println("Bashemsireler icin minumum maas 21000 tl'dir");

    }

    @Override
    public String toString() {
        return  "C01_Personel{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                ", telefon='" + telefon + '\'' +
                ", statu='" + statu + '\'' +
                ", nobet='" + nobet + '\'' +
                '}';
    }
}