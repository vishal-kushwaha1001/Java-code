import java.util.Scanner;

public class primeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input Number : ");
        int n = sc.nextInt();
        int hf;

        for (int i = n / 2; i >= 1; i--) {
            if (n % i == 0) {
                
                hf = i;
                if (hf == 1) {
                    System.out.println("number is prime number");
                } else
                    System.out.println("not prime number");
                break;
            }

        }
        sc.close();

    }
}
