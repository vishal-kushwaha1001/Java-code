import java.util.Scanner;

public class kadans_sAlgorithm {
    public static void kadans(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("maximum sub array sum is : " + maxSum);
    }

    public static void main(String[] args) {
        // int array[] ={-2,-3,4,-1,-2,1,5,-3};
        Scanner sc = new Scanner(System.in);
        System.out.print("input array size : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        // input Array element
        System.out.print("input  element in Array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        kadans(array);
        sc.close();
    }
}
