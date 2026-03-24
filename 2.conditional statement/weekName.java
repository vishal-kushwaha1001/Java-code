import java.util.Scanner;

public class weekName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input week number between 1 to 7 : ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println(" MONDAY");
                break;
            case 2:
                System.out.println(" TUESDAY");
                break;
            case 3:
                System.out.println(" WEDNESDAY");
                break;
            case 4:
                System.out.println(" THRUSDAY");
                break;
            case 5:
                System.out.println(" FRIDAY");
                break;
            case 6:
                System.out.println(" SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;

            default:
                System.out.println("DAY NAME NOT EXIST IN A WEEK");
                break;
        }
        sc.close();
    }

}
