package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru07 {
    public static void main(String[] args) {
        //Soru 7:
        //Bir ArrayList<String> içerisine 5 farklı şehir ekleyin.
        //	•	Kullanıcıdan alınan bir şehrin listede olup olmadığını bulan bir Java programı yazın.
        //	•	Eğer şehir listede varsa, indeksini yazdırın.


        Scanner scan = new Scanner(System.in);
        boolean isExist = false;

        List<String> cities = new ArrayList<>();
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("İzmir");
        cities.add("Antalya");
        cities.add("Tokat");

        System.out.println("Şehir giriniz");
        String city = scan.nextLine();

        for (String sehir : cities) {
            if (sehir.equalsIgnoreCase(city)) {
                System.out.println(sehir + " Listede var, index :  " + cities.indexOf(sehir));
                isExist = true;
            }

        }

        if (!isExist) {
            System.out.println("Sehir listede yok");
        }


    }
}
