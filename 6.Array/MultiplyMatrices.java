import java.util.Scanner;

public class MultiplyMatrices {

    static void printMatrix(int arr[][], int r, int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }

    static void multiplyMatrix( int A[][],int row1, int col1,
            int B[][], int row2, int col2){

        int i, j, k;

        // Print the matrices A and B
        System.out.println("\nMatrix A:");
        printMatrix(A, row1, col1);
        System.out.println("\nMatrix B:");
        printMatrix(B, row2, col2);

        // Check if multiplication is Possible
        if (row2 != col1) {
            System.out.println(
                    "\nMultiplication Not Possible");
            return;
        }

        // Matrix to store the result
        // The product matrix will
        // be of size row1 x col2
        int C[][] = new int[row1][col2];

        // Multiply the two matrices
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }

        // Print the result
        System.out.println("\nResultant Matrix:");
        printMatrix(C, row1, col2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking Number of Rows and Columns from User for 1st array
        System.out.print("Enter number of rows: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c1 = sc.nextInt();

        int[][] arr1 = new int[r1][c1];

        System.out.println("Enter elements of array1: ");
        // Taking input from user for each element of array
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        // Taking Number of Rows and Columns from User for 2nd Array
        System.out.print("Enter number of rows: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter elements of array2: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        multiplyMatrix(arr1, r1, c1, arr2, r2, c2);

        sc.close();
    }
}
