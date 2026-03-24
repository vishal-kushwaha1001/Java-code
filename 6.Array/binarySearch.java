import java.util.*;

public class binarySearch {
    public static int binary_Search(int array[], int key) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input arrey Size : ");
        int inputSize = sc.nextInt();
        System.out.println(" Input your Data :");
        int array[] = new int[inputSize];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Input element which you want to search : ");
        int key = sc.nextInt();

        System.out.println(" Index Of Number is : " + binary_Search(array, key));
        if (binary_Search(array, key) == -1)
            System.out.println("number not avilable");
        sc.close();
    }

}
