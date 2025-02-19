package week2;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {


        String password = "1234";

        System.out.println("Lütfen şifrenizi giriniz ");
        Scanner scan = new Scanner(System.in);
        String passwordInput = scan.nextLine();

        if (!password.equals(passwordInput)) {

            System.out.println("Hatalı şifre girdiniz");
        } else {

            int bakiye = 10000;

            System.out.println("Başarıyla giriş yaptınız");

            System.out.println("Lütfen Yapmak istediğiniz işlemi seçiniz");
            System.out.println("1 - Bakiye Görüntüle");
            System.out.println("2 - Para yatırma");
            System.out.println("3 - Para Çekme");
            System.out.println("4 - Çıkış");

            int operation = scan.nextInt();
            while (operation != 4) {

                if (operation == 1) {

                    System.out.println("Bakiye :" + bakiye);

                } else if (operation == 2) {

                    System.out.println("Hesabınıza yatırmak istediğiniz bakiyeyi giriniz");
                    int balance = scan.nextInt();

                    if (balance < 10) {
                        System.out.println("Hesabınıza minimum 10Tl yatırmalısınız");

                    } else {

                        bakiye = bakiye + balance;
                        System.out.println("İşlem gerçekleşti. Yeni bakiyeniz : " + bakiye);
                    }
                } else if (operation == 3) {

                    System.out.println("Hesabınızdaki Bakiye : " + bakiye);
                    System.out.println("Çekmek istediğiniz tutarı giriniz");
                    int cekilen = scan.nextInt();

                    if (cekilen > bakiye) {
                        System.out.println("Hesabınızda " + cekilen + "TL bulunmamaktadır. ");
                    } else if (cekilen > 0) {
                        bakiye = bakiye - cekilen;
                        System.out.println("Kalan bakiyeniz : " + bakiye);
                    } else {
                        System.out.println("Geçerli bir değer giriniz");
                    }
                }
                System.out.println("-----------------------------");
                System.out.println("Lütfen Yapmak istediğiniz işlemi seçiniz");
                System.out.println("1 - Bakiye Görüntüle");
                System.out.println("2 - Para yatırma");
                System.out.println("3 - Para Çekme");
                System.out.println("4 - Çıkış");

                operation = scan.nextInt();

            }
            System.out.println("Başarıyla çıkış yaptınız");

        }


    }
}
