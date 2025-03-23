package week6;

import java.util.Scanner;

public class OcakWeek03 {

    /*

    1️-)Koşullu ifadeler (if-else) ne işe yarar? Gerçek hayattan bir örnek verin.

    Bir asansör sistemi düşünelim.
    Eğer asansör maksimum ağırlık sınırını aşarsa, uyarı verir ve kapıları kapatmaz.
    Eğer ağırlık sınırın altındaysa, kapılar kapanır ve hareket eder.


     */

    public static void main(String[] args) {
        //  2️-)Girilen bir sayının tek mi çift mi olduğunu bulan bir Java programı yazın.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println(sayi + " bir çift sayıdır.");
        } else {
            System.out.println(sayi + " bir tek sayıdır.");
        }

        //  Bir sayının pozitif, negatif veya sıfır olup olmadığını belirleyen bir program yazın.


        System.out.print("Bir sayı girin: ");
        int sayi2 = scanner.nextInt();

        if (sayi2 > 0) {
            System.out.println(sayi2 + " pozitif bir sayıdır.");
        } else if (sayi2 < 0) {
            System.out.println(sayi2 + " negatif bir sayıdır.");
        } else {
            System.out.println("Girilen sayı sıfırdır.");
        }




    }


}

