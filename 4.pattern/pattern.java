import java.util.Scanner; 
// palindromic  triangle pattern

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input row : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j= 0;j<i;j++) {
                System.out.print((i+j) +" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print((i*2-j)+ " ");
            }

            System.out.println();
        }

        sc.close();
    }

}
