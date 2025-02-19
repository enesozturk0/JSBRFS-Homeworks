package week2;

import java.util.Scanner;
public class Odev2 {


    public static void main(String[] args) {

        System.out.println("Sepetinize eklemek istediğiniz ürünleri seçiniz, Alışverişin tamamlanması için 0 tuşuna basınız.");
        System.out.println("-------------------------------");
        double ekmek = 15;
        double cikolata = 19.50;
        double süt = 38.25;

        double toplam = 0;
        String indirimKodu = "SEPETTE10";

        System.out.println("1 - Ekmek  15TL");
        System.out.println("2 - Çikolata  19.50TL");
        System.out.println("3 - Süt  38.25TL");
        Scanner scan = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Ürün seçiniz veya alışverişin sonlanması için 0 tuşuna basınız");
            int secim = scan.nextInt();


            if (secim > 0 && secim < 4) {

                switch (secim) {
                    case 1:
                        toplam += ekmek;
                        System.out.println("Ekmek Sepete eklendi");
                        break;
                    case 2:
                        toplam += cikolata;
                        System.out.println("Cikolata Sepete eklendi");
                        break;
                    case 3:
                        toplam += süt;
                        System.out.println("Süt Sepete eklendi");
                        break;
                }
            } else if (secim == 0) {

                System.out.println("Toplam fiyat : " + toplam);
                System.out.println("indirim kodu girmek için 1 \n Devam etmek için 2");

                int tercih = scan.nextInt();

                if (tercih == 1) {
                    System.out.println("İndirim kodunu giriniz");
                    String kod = scan.next();
                    if (indirimKodu.equalsIgnoreCase(kod)) {
                        toplam = toplam * 0.9;
                        System.out.println("SEPETTE10 indirim kodu uygulanmıştır \n " +
                                " Toplam :" + toplam + "TL  \n Alışveriş tamamlanmıştır.");
                        break;

                    } else {
                        System.out.println("Geçersiz bir indirim kodu girdiniz.");

                    }
                } else if (tercih == 2) {
                    System.out.println("Toplam fiyat :" + toplam + "\n Alışveriş tamamlandı");
                    break;
                } else {
                    System.out.println("Sadece 1 veya 2 giriniz");
                }

            } else {
                System.out.println(secim + " Mevcut değil. Geçerli sayı giriniz.");
            }



        }
    }

}
