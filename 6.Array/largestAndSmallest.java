import java.util.*;
// function for largest number
public class largestAndSmallest {
    public static int largestNum(int array[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
        }
        return largest;
    }
// function for smallest number  
    public static int smallestNum(int array[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("input array Size : ");
        int inputSize = sc.nextInt();
        System.out.println(" Input your Data :- ");
        int array[] = new int[inputSize];
        for (int i =0 ; i<array.length; i++) {
            array[i] = sc.nextInt();
        }
         // functon call
        System.out.println("largest number is : " + largestNum(array));
        System.out.println(" And smallest number is : " + smallestNum(array));

        sc.close();
    }
}
