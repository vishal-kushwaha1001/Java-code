import java.util.Scanner;
public class palindrome {    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" input number ");
    int num = sc.nextInt();
    int rev = 0;
    int inputNumber = num;
     while(num>0){                  //234
        int lastDigit = num%10;     //432
        rev = rev*10;
        rev = rev + lastDigit;
        num = num/10;
        
       
     }
if(inputNumber == rev ){System.out.println("Number is pallindrome number");}
else System.out.println("Number is not  pallindrome number");
sc.close();
    
}
    
}
