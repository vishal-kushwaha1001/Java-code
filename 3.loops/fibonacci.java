import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print(" input terms in series : ");
         int num = sc.nextInt();
         int a= 0 ,b = 1 ,c;
         System.out.print( "Fibonacci series is : "+ a);
         System.out.print( " " +b);

          for( int i = num; i>2; i--){ c = a+b;
            System.out.print(" "+c);
            a = b;
            b= c;


          }

          
          sc.close();
        }
    
}
