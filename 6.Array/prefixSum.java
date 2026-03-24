import java.util.*;

public class prefixSum {
    public static void prefix_sum(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0]= arr[0];
        for( int i =1; i<arr.length;i++ ){
            prefix[i]= prefix[i-1] + arr[i];
        }
        // for print prefix Array
        for(int i =0; i< prefix.length;i++){
            System.out.print(prefix[i] +" ");
        }
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
        prefix_sum(array);
        sc.close();
    }

}
