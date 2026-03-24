import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {            
    Scanner sc = new Scanner(System.in);
    System.out.print("input Number : ");
    int n = sc.nextInt();

    boolean prime = true ;
    for (int i =(int) Math.sqrt(n); i >1; i--) {
        if (n % i == 0) {
           System.out.println("number is not prime number");
           prime= false;
            break;
        } 

    }
    if(prime == true){System.out.println("number is prime number");}
    sc.close();
   
}
}