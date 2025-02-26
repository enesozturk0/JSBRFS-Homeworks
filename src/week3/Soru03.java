package week3;

import java.util.Scanner;

public class Soru03 {

    public static void main(String[] args) {

        // Soru 3:
        // Bir dizide bulunan pozitif ve negatif sayıların toplamını ayrı ayrı hesaplayan bir Java programı yazın.

        Scanner scan = new Scanner(System.in);

        int sumPositive = 0;
        int sumNegative = 0;
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + ". sayıyı giriniz");
            numbers[i] = scan.nextInt();

        }

        for (int eleman : numbers) {
            System.out.print(eleman + " ");
            if (eleman > 0) {
                sumPositive += eleman;
            } else if (eleman < 0) {
                sumNegative += eleman;

            }
        }
        System.out.println("\n Pozitif sayıların toplamı : " + sumPositive);
        System.out.println(" Negatif sayıların toplamı : " + sumNegative);

    }
}
