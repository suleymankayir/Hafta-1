import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ussu alinacak sayiyi giriniz");
        int n = scanner.nextInt();
        System.out.println("Us olacak sayiyi giriniz");
        int k = scanner.nextInt();

        for (int i = 1; i <=k ; i++) {
            sayi *= n;
        }
        System.out.println(sayi);
    }
}