
import java.util.Scanner;
 // creating class
 class Data {
    // creating instance variable x and y
    int x ,y;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("input first value :");
        x = sc.nextInt();
        System.out.print("input second value : ");
        y = sc.nextInt();
        sc.close();
    }

    void putData(){
        System.out.println("Multiplication is :  "+ (x * y));
    }
}  
// creatind public class
public class Multiply {

    public static void main(String[] args){
        // creating object
        Data aa = new Data();
        aa.getData();
        aa.putData();
    }
}