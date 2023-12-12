import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }

        }
    }
}