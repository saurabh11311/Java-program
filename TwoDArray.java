/* 

public class TwoDArray {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
                System.out.println();
            }
        }
    }
}

*/
/* 
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int number[][] = new int[rows][cols];
        //input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}

*/

//Take a matrix as input from  the user and search for a number x and print the indicate at which it occure
/* 
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int number[][] = new int[rows][cols];
        
        // Input the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        
        // Search for a number x
        int x = sc.nextInt();
        
        // Search in the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //compare with x
                if (number[i][j] == x) {
                    System.out.println("Number " + x + " found at position: (" + i + ", " + j + ")");
                
                }
            }
        }
    }
}

*/

//Print the spiral order materix as output for a given number 
//spiral order matrixis ginen by: 1 5 7 9 10 11 6 10 12 13 20 21 9 25 29 30 32 41 15 55 59 63 98 70 40 70 79 81 95 105
 
/* 

import java.util.Scanner;
public class TwoDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        
        // Input the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Print the spiral order
        System.out.println("Spiral order of the matrix:");
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;

        //to print spirl order matrix
        while (rowStart <= rowEnd && colStart <= colEnd) {
            //1st row 
                for (int col = colStart; col<= colEnd; col++) {
                    System.out.print(matrix[rowStart][col] + " ");
                }
                rowStart++;

                //2nd row

                for(int row = rowStart; row <= rowEnd; row++) {
                    System.out.print(matrix[row][colEnd] + " ");
                }
                colEnd--;

                //3rd row

                for(int col=colEnd ; col >= colStart; col--) {
                        System.out.print(matrix[rowEnd][col] + " ");
                    }
                    rowEnd--;   

                //4th row 

                for(int row = rowEnd; row >= rowStart; row--) {
                        System.out.print(matrix[row][colStart] + " ");
                    }
                    colStart++; 
                    System.out.println();

                }
            }
            
    }


    */


    

//For a given matrix of N*M, Print its transpose
import java.util.Scanner;
public class TwoDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        
        // Input the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Print the transpose of the matrix
        System.out.println("Transpose of the matrix:");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}    