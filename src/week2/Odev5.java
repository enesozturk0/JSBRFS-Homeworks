package week2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Odev5 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int secim;
        double toplam = 0;

        int kola = 30;
        int ayran = 30;
        int döner = 300;
        int pizza = 400;
        int lahmacun = 100;
        int salata = 150;

        System.out.println("---MENU---");
        System.out.println("1 - Kola     30TL");
        System.out.println("2 - Ayran    30TL");
        System.out.println("3 - Döner    300TL");
        System.out.println("4 - Pizza    400TL");
        System.out.println("5 - Lahmacun 100TL");
        System.out.println("6 - Salata   150TL");
        System.out.println("0 - Siparişi Tamamla");

        do {
            System.out.println("Lütfen seçiminizi yapınız");
            secim = scan.nextInt();

            switch (secim) {
                case 1:
                    toplam += kola;
                    System.out.println("Kola eklendi.");
                    break;
                case 2:
                    toplam += ayran;
                    System.out.println("Ayran eklendi.");
                    break;
                case 3:
                    toplam += döner;
                    System.out.println("Döner eklendi.");
                    break;
                case 4:
                    toplam += pizza;
                    System.out.println("Pizza eklendi.");

                    break;
                case 5:
                    toplam += lahmacun;
                    System.out.println("Lahmacun eklendi.");
                    break;
                case 6:
                    toplam += salata;
                    System.out.println("Salata eklendi.");
                    break;
                default:
                    System.out.println("Geçerli bir değer giriniz");
                    break;

            }
        } while (secim != 0);

        System.out.println("Toplam hesap : " + toplam);


    }
}






