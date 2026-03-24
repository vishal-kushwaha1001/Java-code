import java.util.Scanner;


public class Reverse {
    static  void reverse( int num){
        int count = 0;
        int reverse =0;
        int sum= 0;
            while(num!=0){
            int digit = num%10;
            sum = sum + digit;  
            reverse = reverse*10 + digit;
            num = num/10;
            count++;     
        }
        System.out.println("Reverse Number is : "+reverse);
        // System.out.println("Reverse Number is: " + reverse);
        System.out.println("Sum of digits is: " + sum);
        System.out.println("Count of digits is: " + count);
        

    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int num;
        System.out.print("input Number :");
        num = sc.nextInt();
       reverse(num);
         sc.close();
    }
}
