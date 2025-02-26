package week3;

import java.util.Arrays;

public class Soru10 {
    public static void main(String[] args) {

        /*
    Aşağıdaki dizilerle ilgili metodları araştırın ve her biri için açıklama ve örnek kod yazın:
	•	Arrays.sort()
	•	Arrays.binarySearch()
	•	Arrays.copyOfRange()
	•	Arrays.equals()
	•	Arrays.fill()
     */

        int[] numbers1 = {1,7,3,9,5};
        String [] names = {"Enes","Arif","Talat","Berke","Salih"};

        // Arrays.sort() : Dizideki elemanları küçükten büyüğe doğru sıralar. String dizilerde alfabetik sıralama yapar.
        Arrays.sort(numbers1);
        Arrays.sort(names);

        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(names));

        /* Arrays.binarySearch() : Sıralı bir dizide belirtilen öğenin indeksini bulur. Eğer öğe bulunamazsa negatif bir değer döndürür.
        • Arrays.binarySearch() yalnızca sıralı dizilerde doğru çalışır.
        • Eğer öğe dizide yoksa negatif bir değer döndürür
        */
        int [] numbers2 = {15,11,23,19,45,13};
        System.out.println(Arrays.binarySearch(numbers1, 5));
        System.out.println(Arrays.binarySearch(numbers1, 10));
        System.out.println(Arrays.binarySearch(numbers2, 13));

        // Arrays.copyOfRange() : Dizinin belirli bir aralığını yeni bir diziye kopyalar. Son index dahil değil.
        String[] names2 = Arrays.copyOfRange(names, 0, 3);
        System.out.println(Arrays.toString(names2));

        // Arrays.equals() : İki dizinin aynı elemanlara sahip olup olmadığını kontrol eder.
        System.out.println(Arrays.equals(numbers2, numbers1));

        // Arrays.fill() : Dizinin istenilen aralıktaki tüm elemanlarını belirtilen değerle doldurur.
        Arrays.fill(numbers2, 0,3,10);
        System.out.println(Arrays.toString(numbers2));









    }
}
