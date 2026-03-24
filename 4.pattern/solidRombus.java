
import java.util.Scanner;
// solid Rombus pattern

public class solidRombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input row : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {

                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }

}
