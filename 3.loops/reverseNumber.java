import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" input number ");
        int num = sc.nextInt();
        int rev = 0;
         while(num>0){                  //234
            int lastDigit = num%10;     //432
            rev = rev*10;
            rev = rev + lastDigit;
            num = num/10;
            
           
         }

         System.out.println("Sum Of Digit Of Number Is : "+ rev);
         sc.close();
      }
}
