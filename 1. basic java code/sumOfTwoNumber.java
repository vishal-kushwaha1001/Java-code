import java.util.Scanner;

public class sumOfTwoNumber{
public static void main(String[] args) { 
   
    Scanner sc = new Scanner(System.in);

    System.out.print("input a : ");
    int a = sc.nextInt();
    
    System.out.print("input b : ");
    int b = sc.nextInt();

    int sum = a + b;
    System.out.println("sum of a and b  is "+ sum);

    sc.close();

}

}