import java.util.Scanner;
public class subArray {
    public static void printSubArray(int arr[]){
        int totalSubArray = 0;
        int largestSum = Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++){
            int start =i;
            for(int j = i ; j<arr.length;j++){
                int last = j;
                int sum =0;
                for(int k= start ;k <=last; k++){
                    System.out.print(arr[k]+" ");
                    sum = sum +arr[k];
                }
                totalSubArray++;
                System.out.println();
                // System.out.println("  sum : "+sum);
                if(largestSum<sum){
                    largestSum =sum;
                }
            }
            System.out.println();
            
        }
        System.out.println("total number of Sub Array : "+totalSubArray);
        System.out.println("largest sum of subArray " +largestSum);
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
        printSubArray(array);
        sc.close();
    }
}
