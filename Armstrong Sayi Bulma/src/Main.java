import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = scanner.nextInt();
        int bolunenSayi = sayi;
        int basNumber = 0;
        int sayilarToplami = 1;
        int armstrongSayi = 0;
        // basamak sayisi bulma
        while (bolunenSayi !=0){
            bolunenSayi /= 10;
            basNumber++;
        }
        while (sayi > 0){
            for (int i = 1; i <=basNumber ; i++) {
                sayilarToplami *= (sayi%10) ;
            }
            armstrongSayi += sayilarToplami;
            sayilarToplami=1;
            sayi/=10;
        }
        System.out.println(armstrongSayi);

    }
}