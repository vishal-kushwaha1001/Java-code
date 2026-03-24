import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input Number : ");
        int n = sc.nextInt();
       
        System.out.println("table is : ");
        for( int i = 1; i <= 10 ; i++){
            System.out.println( n + " * "+ i+ " = "+ n*i );
            
        }
        
        sc.close();
    }
    
}
