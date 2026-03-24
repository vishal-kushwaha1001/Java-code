import java.util.Scanner;

public class higestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input Number : ");
        int n = sc.nextInt();

        for (int i = n / 2; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println("higest factor is :" + i);
                
                break;
            }

        }
        sc.close();
    }
}
