package week6;

import java.util.Scanner;

public class OcakWeek02 {

    /*

    Type            Size                                    Description

    byte	    1 byte (8 bit)	                    -128 ile 127 arasında tamsayı
    short	    2 byte (16 bit)		                -32,768 ile 32,767 arasında tamsayı
    int	        4 byte (32 bit)	                    -2^31 ile (2^31)-1 arasında tamsayı
    long	    8 byte (64 bit)		                -2^63 ile (2^63)-1 arasında tamsayı
    float	    4 byte (32 bit)		                Ondalıklı sayı (32 bit hassasiyet)
    double	    8 byte (64 bit)		                Ondalıklı sayı (64 bit hassasiyet)
    char	    2 byte (16 bit)		                Unicode karakter depolar
    boolean	    1 bit (Java'da tam belirlenmemiş)	true veya false değeri alır


    int a = 10;
    double b = 3.5;
    System.out.println(a + b);

    Çıktı : 13.5


     */



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        double toplam = sayi1 + sayi2;
        System.out.println("Toplam: " + toplam);
    }
}
