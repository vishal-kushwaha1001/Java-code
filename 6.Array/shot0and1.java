import java.util.Scanner;

public class shot0and1 {
     static void print(int[] arr){
        // printing Array
         for (int j = 0 ;j <arr.length ;j++) {
             System.out.print(arr[j]+ " ");
         }
    }
    static  void shot(int[] arr){
         int countZeros =0;
        for (int j =0 ; j< arr.length; j++) {
            if (arr[j] == 0) {
                countZeros++;
            }
        }
         // shorting
        for(int i =0 ; i< arr.length; i++){
             if(i < countZeros){
                 arr[i]= 0;
             }
             else{
                 arr[i] = 1;
             }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input array size :");
        int size = sc.nextInt();
        System.out.print("input array element : ");
        int[] arr = new int[size];
        // input array
        for( int i =0 ; i< arr.length ;i++){
            arr[i]=sc.nextInt();
        }
        shot(arr);
        print(arr);
        sc.close();
    }
    
}
