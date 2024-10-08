package day07_ifStatements_IfElseStatements;

import java.util.Scanner;

public class C02_BagimsizIfCumleleri_SayacYontemi {
    public static void main(String[] args) {
        // Kullanicidan iki tamsayi isteyin

        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int sayac = 0;

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        if (sayi1<sayi2){
            System.out.println("birinci sayi daha kucuk");
            sayac++;
        }
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        if (sayi1>0){
            System.out.println("birinci sayi sifirdan buyuk");
            sayac++;
        }
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den kucuk"
        if (sayi2>50){
            System.out.println("ikinci sayi 50'den buyuk");
            sayac++;
        }
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        if (sayi2 % 5 == 0){
            System.out.println("ikinci sayi 5'in tam kati");
            sayac++;
        }


        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin

        if (sayac == 0) System.out.println("Nasil sayi sectiniz , hicbir sarti saglamiyor");


        // 6- EGER tum sartlari sagliyorsa
        //    "aferin, cok guzel sayi secmissin" yazdirin

        if (sayac == 4) System.out.println("aferin, cok guzel sayi secmissin");

    }
}
