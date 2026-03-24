import java.util.Scanner;
public class fctorialOfNumber {


    public  static int factorial( int n ){
        int f =1;
        for( int i =1 ; i<=n ; i++){
            f*=i;
    
        }
        return f;
     }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Input number : ");
         int number = sc.nextInt();
         int result = factorial(number);
         System.out.println( "factorial is : "+  result);

         sc.close();
        }
    
}
