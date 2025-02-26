package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Soru8 {
    public static void main(String[] args) {

        //Soru 8:
        //Bir ArrayList<Integer> oluşturun ve içine 10 sayı ekleyin.
        //	•	Listenin en büyük ve en küçük elemanını bulan bir Java programı yazın.

        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println("Random oluşturulmuş liste : "+numbers);
        Collections.sort(numbers);

        System.out.println("En küçük eleman : "+numbers.getFirst() +" En büyük eleman : "+numbers.getLast());

    }
}
