import java.util.Scanner;

public class pairs {
    public static void numberPairs(int arr[]){
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + current + "," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs : " + tp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input array size : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.print("input  element in Array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        numberPairs(array);

        sc.close();
    }

}
