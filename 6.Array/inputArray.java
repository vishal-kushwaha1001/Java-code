import java.util.Scanner;

public class inputArray {   
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("input array size :  ");
        int size = sc.nextInt(); 
        // Declare Array 
        int marks[] = new int[size]; 
        // input Array
        System.out.print("input element int array : ");
        for(int i= 0 ; i<marks.length; i++){
            marks[i]=sc.nextInt();
        }

        // Print array
        System.out.print("element are : ");
        for(int i :marks){
            System.out.print(i + " ");
        }
        sc.close();
    }  
}
