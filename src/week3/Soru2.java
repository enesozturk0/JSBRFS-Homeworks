package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru2 {

    public static void main(String[] args) {

        //Soru 2:
        //Bir dizide tekrar eden elemanları bulan bir program yazın.

        List<Integer> sameNumber = new ArrayList<>();

        int[] numbers = new int[7];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + ". sayıyı giriniz");
            numbers[i] = scan.nextInt();
        }

        for (int eleman : numbers) {
            System.out.print(eleman + " ");
        }

        System.out.println("\n Tekrar eden sayılar = ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    sameNumber.add(numbers[i]);

                }
            }
        }
        System.out.println(sameNumber);
    }
}
