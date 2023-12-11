import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */

        int acilisUcreti = 10;
        double kmBasiUcret = 2.20;
        int minTutar = 20;
        double odenecekTutar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gidilen mesafeyi KM cinsinden yaziniz");
        double gidilenKM = scanner.nextDouble();

        odenecekTutar = (acilisUcreti)+ (kmBasiUcret*gidilenKM);

        System.out.println(odenecekTutar<20 ? minTutar: odenecekTutar);



    }
}