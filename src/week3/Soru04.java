package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru04 {
    public static void main(String[] args) {

        //Soru 4:
        //Kullanıcıdan 10 adet sayı alıp bir ArrayList içine ekleyen ve ardından bu sayıları büyükten küçüğe sıralayan bir program yazın.

        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". sayıyı giriniz");
            numbers.add(scan.nextInt());
        }

        System.out.println("Normalde Liste : " + numbers);
        numbers.sort((x, y) -> y - x);
        System.out.println("Sıralanmış liste :" + numbers);
    }
}
