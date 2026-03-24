import java.util.Scanner;

public class Amstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number : ");
        int n = sc.nextInt();

        int count = 0, sum= 0;
        int a = n;
        while(a>0){
            a= a/10;
            count++;
        }
        int b =n ;
        while(b>0){
            int lastDigit = b%10;
            sum = sum +(int) Math.pow(lastDigit, count);
            b= b/10;
        }

        if(sum == n) System.out.println("Amstrong number");
        else System.out.println("not Amstrong number");


        sc.close();
    }
    
}
