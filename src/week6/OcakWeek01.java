package week6;

import java.util.Scanner;

public class OcakWeek01 {
    /*
    1️-)Java nedir? Nerelerde kullanılır? Araştırın ve kısa bir açıklama yazın.

    Java, Sun Microsystems (şimdi Oracle) tarafından geliştirilmiş, nesne yönelimli, platform bağımsız bir programlama dilidir.
    İlk kez 1995 yılında piyasaya sürülmüştür.
    "Bir kez yaz, her yerde çalıştır" (Write Once, Run Anywhere) prensibiyle, Java programları farklı işletim sistemlerinde çalışabilir.
    Bu özellik, Java'nın sanal makine (JVM) kullanarak çalıştırılmasından kaynaklanır.
    Java, web uygulamaları, mobil uygulamalar (Android), masaüstü yazılımlar, büyük ölçekli kurumsal uygulamalar, oyunlar ve daha birçok alanda yaygın olarak kullanılır.

    2 ️-)Java’nın JDK, JRE ve JVM bileşenlerini açıklayın.

    JDK (Java Development Kit):
        Java uygulamaları geliştirmek için gerekli olan tüm araçları ve yazılımları içeren bir yazılım paketidir.
        JDK, derleyici (javac), Java API kütüphaneleri ve JVM gibi bileşenleri içerir. Geliştiriciler için kullanılır.


    JRE (Java Runtime Environment):
        Java uygulamalarını çalıştırmak için gerekli olan ortamı sağlar.
        JRE, JVM ve Java kütüphanelerini içerir ancak geliştirme araçları (derleyici gibi) içermez.
        Kullanıcıların Java uygulamalarını çalıştırabilmesi için gereklidir.


    JVM (Java Virtual Machine):
    Java programlarının farklı platformlarda çalışabilmesini sağlayan sanal bir makinedir.
    JVM, Java bytecode'larını (JDK tarafından derlenen kod) çalıştırır ve her işletim sistemi için özgü olabilecek detayları yönetir, böylece aynı Java programı farklı sistemlerde sorunsuzca çalışabilir.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println(name);
    }


}
