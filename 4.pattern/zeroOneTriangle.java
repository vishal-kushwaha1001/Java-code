
import java.util.Scanner;
// zero One  (0,1)  Right angle Triangle pattern

public class zeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input row : ");
        int n = sc.nextInt();
        int a = 1, b = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2 == 0){System.out.print(a+" ");}
                else System.out.print(b + " ");
              

            }
            System.out.println();
        }

        sc.close();
    }

}
