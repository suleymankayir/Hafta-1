import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın.
        İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre
        müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim angular.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

        int km,yas,tip;
        double indirimTutari;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        km = scanner.nextInt();
        if (km < 0){
            System.out.println("Hatalı Veri Girdiniz !");
        }

        System.out.print("Yasinizi giriniz: ");
        yas = scanner.nextInt();
        if (yas < 0){
            System.out.println("Hatalı Veri Girdiniz !");
        }

        System.out.print("Yolculuk tipinizi giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        tip = scanner.nextInt();
        if (!((tip == 1) || (tip == 2) )){
            System.out.println("Hatalı Veri Girdiniz !");
        }

        double mesafeÜcreti = km * 0.10 ;

        if (yas < 12) {
            indirimTutari = mesafeÜcreti*0.5;
            mesafeÜcreti -= indirimTutari;
        } else if (yas < 24){
            indirimTutari = mesafeÜcreti*0.1;
            mesafeÜcreti -= indirimTutari;
        } else if (yas > 65){
            indirimTutari = mesafeÜcreti*0.3;
            mesafeÜcreti -= indirimTutari;
        }

        if (tip == 2){
            indirimTutari = mesafeÜcreti*0.2;
            mesafeÜcreti -= indirimTutari;
            mesafeÜcreti *= 2;
        }

        System.out.println("Toplam Tutar = " + mesafeÜcreti + " TL");

    }
}