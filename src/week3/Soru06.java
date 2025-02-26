package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Soru06 {
    public static void main(String[] args) {

        //Soru 6:
        //Bir ArrayList<Integer> oluşturun ve içine rastgele 20 sayı ekleyin.
        //	•	Sadece çift sayıları ayrı bir listeye ekleyin ve yazdırın.

        Random random = new Random();

        List<Integer> numbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println("Sayı Listesi : " + numbers);

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        System.out.println("Sadece çift sayıların olduğu liste : " + evenNumbers);
    }
}
