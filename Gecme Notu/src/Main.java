import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int mat, fizik, turkce, kimya, muzik;
        int ortalama = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        mat = scanner.nextInt();
        if (mat >= 0 && mat <= 100) {
            ortalama += mat;
        }

        System.out.print("Fizik notunu giriniz: ");
        fizik = scanner.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            ortalama += fizik;
        }

        System.out.print("Turkce notunu giriniz: ");
        turkce = scanner.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            ortalama += turkce;
        }

        System.out.print("Kimya notunu giriniz: ");
        kimya = scanner.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            ortalama += kimya;
        }

        System.out.print("Muzik notunu giriniz: ");
        muzik = scanner.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            ortalama += muzik;
        }

        System.out.println("Not Ortalamaniz = " + (ortalama/5));



    }
}