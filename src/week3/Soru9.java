package week3;

import java.util.ArrayList;
import java.util.List;

public class Soru9 {
    public static void main(String[] args) {

        /* Soru 9:
    Java’daki ArrayList metodlarını araştırın ve her biri için ne işe yaradığını, nasıl kullanıldığını ve örnek kod yazın:
	•	get()
	•	set()
	•	remove()
	•	clear()
	•	size()
    */

        List<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add("Enes");
        numbers.add('A');

        // get() : ArrayList içindeki belirtilen index numarasındaki veriyi döndürür.
        System.out.println(numbers.get(0));

        //set() : ArrayList içindeki belirtilen index numarasındaki veriyi değiştirir.
        numbers.set(0, 5);
        System.out.println(numbers.get(0));

        // remove() : ArrayList içindeki belirtilen index numarasındaki veriyi veya varsa belirtilen veriyi siler.
        numbers.remove(0);
        numbers.remove("Enes");
        System.out.println(numbers.get(0));

        // clear() : ArrayList içindeki tüm verileri temizler.
        numbers.clear();
        System.out.println(numbers);

        // size() : ArrayList içindeki eleman sayısını döndürür.
        System.out.println(numbers.size());
    }
}
