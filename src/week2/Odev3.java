package week2;

import java.util.Scanner;

public class Odev3 {

    public static void main(String[] args) {

        int limit = 90;
        int kategori = 0;
        int ceza = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hızınızı giriniz");
        int hız = scan.nextInt();

        if (hız > 0 && hız <= 90) {
            kategori = 1;

        } else if (hız > 90 && hız <= 110) {
            kategori = 2;

        } else if (hız > 110 && hız <= 130) {
            kategori = 3;
        } else if (hız > 130) {
            kategori = 4;
        } else {
            System.out.println("Geçerli hız giriniz");
        }

        switch (kategori) {
            case 1:
                System.out.println("Hız sınırını aşmadınız.");
                break;
            case 2:
                ceza = 1000;
                System.out.println("Hız sınırını aştınız Cezanız : " + ceza + "TL");
                break;

            case 3:
                ceza = 2000;
                System.out.println("Hız sınırını aştınız Cezanız :" + ceza );
                break;

            case 4:
                System.out.println("Ehliyetinize el konulmuştur.");
                break;
        }
    }
}
