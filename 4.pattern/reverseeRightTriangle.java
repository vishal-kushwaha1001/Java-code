

import java.util.Scanner;
// reversee Right  angle Triangle

public class reverseeRightTriangle {
    public static void main(String[] args) {
        Scanner vishal = new Scanner(System.in);

        System.out.print("input row : ");
        int n = vishal.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for( int k = 1 ; k<=n-i; k++){
                System.out.print("  ");
            }


            for (int j = 1; j <= i; j++) {
                
                    System.out.print("* ");
              

            }
            System.out.println();
        }

        vishal.close();
    }

}
