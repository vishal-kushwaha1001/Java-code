import java.util.Scanner;

public class rightAngleTriangle {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("input row : ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                
                    System.out.print("* ");
              

            }
            System.out.println();
        }

    }

}
