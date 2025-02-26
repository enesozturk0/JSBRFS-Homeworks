package week3;

import java.util.Scanner;

public class Soru01 {

    public static void main(String[] args) {

        // Soru 1: Kullanıcıdan 10 adet tam sayı alarak bir diziye ekleyin.
        // Dizinin ortalamasını hesaplayan ve 50’den büyük olan elemanları listeleyen bir Java programı yazın.

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + ". sayıyı giriniz");
            numbers[i] = scan.nextInt();

            sum += numbers[i];
        }
        System.out.println("Dizini ortalaması : " + (sum / 10));
        System.out.println("Dizideki 50' den büyük sayılar \n --------------");


        for (int eleman : numbers) {
            if (eleman > 50) {
                System.out.println(eleman);
            }
        }
    }
}
