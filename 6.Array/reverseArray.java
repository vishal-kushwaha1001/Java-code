import java.util.*;

public class reverseArray {
    public static void reverse ( int array[]){
        int first = 0,last =array.length-1;
        while(first <last){
            int temp = array[last];
            array[last]= array[first];
            array[first]= temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input arrey Size : ");
        int inputSize = sc.nextInt();
        System.out.println(" Input your Data :");
        int array[] = new int[inputSize];
            for(int i = 0;i<array.length ; i++){
                array[i] = sc.nextInt();
            }

            System.out.println();

            reverse(array);
           for(int i =0 ; i<array.length;i++){
            System.out.print(array[i] +" ");
           }
            sc.close();
    }
    
}
