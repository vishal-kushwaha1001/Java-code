import java.util.Scanner;

public class typeCasting{


public static void main( String[] args){
    Scanner sc = new Scanner( System.in);

    System.out.print(" Input number");
    int  a = sc.nextInt();
     char ch = (char)a;
     System.out.println(ch);

System.out.println("input price");
     float price = sc.nextFloat();
     int number = (int) price;
     System.out.println(number);
     sc.close();

} 

}