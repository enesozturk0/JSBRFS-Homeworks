package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Soru05 {
    public static void main(String[] args) {

        //Soru 5:
        //Kullanıcıdan 10 adet kelime alarak bir ArrayList<String> içine ekleyin.
        // Girilen kelimeleri alfabetik sıraya göre sıralayan bir Java programı yazın.

        Scanner scan = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". kelimeyi giriniz");
            words.add(scan.nextLine());
        }

        System.out.println("Sıralanmamış : " + words);

        Collections.sort(words);

        System.out.println("Sıralanmış :" + words);
    }

}
