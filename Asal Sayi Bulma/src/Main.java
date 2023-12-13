public class Main {

    public static void main(String[] args) {

        System.out.print("1 ile 100 arasindaki sayilar: ");
        for (int i = 1; i < 100; i++) {
            boolean asalMi = true;

            if (i < 2) {
                continue;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        asalMi = false;
                        break;
                    }
                }
            }
            if (asalMi) {
                System.out.print(i + " ");
            }
        }




    }
}
