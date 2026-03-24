import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
       
        Scanner sc = new  Scanner(System.in);

    System.out.print(" input base : ");
    int base = sc.nextInt();
    System.out.print("input Exponent : ");
    int e = sc.nextInt();

    int p =(int) Math.pow(base, e);
    System.out.println(p);

    sc.close();


    }
    
}
