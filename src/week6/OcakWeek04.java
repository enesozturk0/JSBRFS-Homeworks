package week6;

import java.util.Scanner;

public class OcakWeek04 {

    /* 1️-)Döngüler (for, while) ne işe yarar? Kullanım alanlarını açıklayın.

        Döngüler, belirli bir koşul sağlandığı sürece tekrar eden işlemleri gerçekleştirmek için kullanılır.
         Programlamada tekrarlayan görevleri daha verimli ve kısa şekilde yazmamıza yardımcı olur.

    Döngü Türleri ve Kullanım Alanları:

    for Döngüsü: Döngünün kaç kez çalışacağını biliyorsak kullanılır.

    Örnek: 1 den 100e kadar olan sayıların toplamını hesaplamak.

    while Döngüsü: Döngü çalıştırılmadan önce koşul kontrol edilir. Koşul doğru olduğu sürece döngü devam eder.

    Örnek: Kullanıcı "çıkış" yazana kadar veri almak.

    do-while Döngüsü: while döngüsüne benzer, ancak en az bir kez çalıştırılır.

    Örnek: Kullanıcıdan en az bir kez giriş alıp, hatalıysa tekrar istemek.

     */

    public static void main(String[] args) {

        // 2️-)1’den 10’a kadar olan sayıları ekrana yazdıran bir for döngüsü yazın.

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 3️-)Kullanıcıdan alınan bir sayıya kadar olan sayıların toplamını hesaplayan bir program yazın.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        for (int i = 1; i <= sayi; i++) {
            toplam += i;
        }

        System.out.println("1'den " + sayi + "'e kadar olan sayıların toplamı: " + toplam);

    }


}
