
import java.util.Scanner;

public class power {
    public static int pow(int b, int e) {
        int p = 1;
        for (int i = 1; i <= e; i++) {
            p *= b;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("inter base");
        int base = sc.nextInt();
        System.out.print("inter exponnt");
        int exponnt = sc.nextInt();

        int x = pow(base, exponnt);
        System.out.println("power is : " + x);

        sc.close();
    }

}
