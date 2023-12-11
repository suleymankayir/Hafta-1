import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
         */
    double kgArmut = 2.14;
    double kgElma = 3.67;
    double kgDomates = 1.11;
    double kgMuz = 0.95;
    double kgPatlican = 5.0;

    Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç kg armut istersiniz?");
        int armut = scanner.nextInt();
        System.out.println("Kaç kg elma istersiniz?");
        int elma = scanner.nextInt();
        System.out.println("Kaç kg domates istersiniz?");
        int domates = scanner.nextInt();
        System.out.println("Kaç kg muz istersiniz?");
        int muz = scanner.nextInt();
        System.out.println("Kaç kg patlican istersiniz?");
        int patlican = scanner.nextInt();

        double toplamTutar = (kgArmut*armut)+(kgElma*elma)+(kgDomates*domates)+(kgMuz*muz)+(kgPatlican*patlican);
        System.out.println("Armut Kaç Kilo ? :" + armut);
        System.out.println("Elma Kaç Kilo ? :" + elma);
        System.out.println("Domates Kaç Kilo ? :" + domates);
        System.out.println("Muz Kaç Kilo ? :" + muz);
        System.out.println("Patlıcan Kaç Kilo ? :" + patlican);
        System.out.println("Toplam Tutar : " + toplamTutar + " TL");

    }
}