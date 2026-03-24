import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input year : ");
        int year = sc.nextInt();

        if (year % 4 != 0) {
            System.out.println("not a Leap Year");
        } 
        else if (year % 100 != 0) {
            System.out.println("Given year is leap year ");
        }
        else if (year % 400 == 0) {
            System.out.println("Given year is Leap year");
        }
        else
            System.out.println(" given year is not leap year");
    sc.close();

    }

}
