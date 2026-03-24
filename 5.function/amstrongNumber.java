import java.util.Scanner;

public class amstrongNumber {
    public static int pow(int b, int e) {
        int p = 1;
        for (int i = 1; i <= e; i++) {
            p *= b;
        }
        return p;

    }

    public static int numberOfDigit(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static int amstrong(int n) {
        int sum = 0;
        int a = n;
        while (a > 0) {
            int lastdigit = a % 10;
            sum = sum + pow(lastdigit, numberOfDigit(n));
            a = a / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("inter number : ");
        int number = sc.nextInt();
        int x = amstrong(number);
        if(number == x) System.out.println("number is Armstrong number");
        else System.out.println("not Armstrong number");
        sc.close();
    }

}
