package day11_stringManipulations;

import java.util.Scanner;

public class C07_indexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve cumlede aratilacak bir metin isteyin
        // girilen cumle ve metin'e gore asagidaki 3 sonucdan uygun olani yazdirin
        // 1- cumle aranan metni icermiyor
        // 2- cumle aranan metni sadece 1 adet iceriyor
        // 3- cumle aranan metni 1'den fazla iceriyor


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen cumlede aranacak metni girin...");
        String metin = scanner.nextLine();

        int birinciIndex = cumle.indexOf(metin);
        int ikinciIndex = cumle.indexOf(metin,birinciIndex+1);

        // 1- cumle aranan metni icermiyor

        if (birinciIndex == -1){
            System.out.println("cumle aranan metni icermiyor");
        } else if ( ikinciIndex == -1) {
            System.out.println("cumle aranan metni sadece 1 adet iceriyor");
        } else {
            System.out.println("cumle aranan metni 1'den fazla iceriyor");
        }
    }
}
