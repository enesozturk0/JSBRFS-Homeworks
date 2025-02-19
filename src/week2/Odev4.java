package week2;

import java.util.Scanner;

public class Odev4 {

    public static void main(String[] args) {
        System.out.println("Notlarınızı giriniz");
        int sayac = 0;
        int not = 0;
        int toplam = 0;
        double ortalama = 0;
        boolean düsükNot = false;
        int enYüksekNot = 0;
        int enDüsükNot = 100;

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println(i + ". Notunuzu giriniz ");

            not = scan.nextInt();
            if (not >= 0 && not <= 100) {


                toplam += not;
                if (not >= 0 && not < 30) {
                    düsükNot = true;
                }
                if (not > enYüksekNot) {
                    enYüksekNot = not;
                }
                if (not < enDüsükNot) {
                    enDüsükNot = not;
                }


            } else {
                System.out.println("Not  0 ile 100 arasında olmalıdır.");
                break;
            }
            sayac++;

        }

        if (sayac == 5) {
            ortalama = toplam / 5;
            System.out.println("Ortalamanız : " + ortalama);
            if (ortalama > 50) {
                System.out.println("Geçtiniz");
            } else {
                System.out.println("Kaldınız");
            }

            System.out.println("En yüksek not : " + enYüksekNot);
            System.out.println("En düşük not : " + enDüsükNot);

            if (düsükNot) {
                System.out.println("Düşük not aldığınız dersler var! ");
            }
        }
    }
}
