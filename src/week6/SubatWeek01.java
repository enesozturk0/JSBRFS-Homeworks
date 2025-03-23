package week6;

import java.util.Scanner;

public class SubatWeek01 {

    /*
    1️-)Dizi (Array) nedir? Java’da nasıl tanımlanır?

    Dizi (Array), aynı türdeki birden fazla veriyi tek bir değişken altında saklamaya yarayan veri yapısıdır.
    Diziler, bellekte ardışık olarak depolanır ve indeksleme kullanılarak elemanlara erişilir.
    Java'da diziler sıfırdan (0) başlayan indekslerle erişilir.

     */

    public static void main(String[] args) {
        //2️-)5 elemanlı bir int dizisi oluşturup, kullanıcıdan aldığı değerlerle diziyi dolduran ve ekrana yazdıran bir program yazın.

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];


        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını girin: ");
            numbers[i] = scanner.nextInt();
        }


        System.out.println("Girilen sayılar:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    //3️-)Bir dizinin içindeki en büyük sayıyı bulan bir Java programı yazın.


        int[] numbers2 = {12, 45, 78, 23, 56};
        int max = numbers2[0];

        for (int num : numbers2) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Dizideki en büyük sayı: " + max);

    }

    }

