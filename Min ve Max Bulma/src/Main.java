import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;
        /*
        Java ile klavyeden girilen N tane sayma sayısından
        en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kac sayi gireceginizi belirtiniz");
        int sayi = scanner.nextInt();
        for (int i = 1; i <= sayi ; i++) {
            System.out.print(i + ". sayiyi giriniz: ");
            int girilenSayi = scanner.nextInt();

            if (girilenSayi>enBuyuk){
                enBuyuk = girilenSayi;
            }

            if (girilenSayi < enKucuk){
                enKucuk = girilenSayi;
            }
        }

        System.out.println("En kucuk sayi: " + enKucuk);
        System.out.println("En buyuk sayi: " + enBuyuk);

    }
}