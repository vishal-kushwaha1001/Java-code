import java.util.*;

public class maxSubArraySumInPrefix {
    public static void prefixSum(int arr[]) {
        int prefix[] = new int[arr.length];
        // calculating sum of prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        // for print prefix Array
        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i] + " ");
        }

        // calculating maximum sum of sub array using prefix array
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int last = j;
                int currSum = 0;
                currSum = currSum == 0 ? prefix[last] : prefix[last] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println();
        System.out.println("largest sum of subArray " + maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input array size : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        // input Array element
        System.out.print("input  element in Array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        prefixSum(array);
        sc.close();
    }
}