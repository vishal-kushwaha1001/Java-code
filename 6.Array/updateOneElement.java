import java.util.Scanner;

public class updateOneElement {
    public static int update(int index[],int key, int updateNum){
        for(int i = 0 ;i<index.length; i++ ){
            if(index[i]==key){
                System.out.println("Found at index : " + i);
                return index[i] + updateNum;
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
            for(int i = 0;i<array.length ; i++){
                array[i] = sc.nextInt();
            }
        System.out.print("Input element which you want to update : "); 
        int key = sc.nextInt();
        System.out.print("How much you want to update  : ");   
        int updateNum = sc.nextInt();

        int update = update(array, key, updateNum);

        if(update == -1 ){System.out.println(" Element not found in array : ");}
        else {System.out.println(" Updatation Successful");
            System.out.println(" Now element has been : "+ update);}



     sc.close();   
    }
    
}
