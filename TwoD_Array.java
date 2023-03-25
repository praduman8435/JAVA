import java.util.Scanner;

public class twoD_Array {
    public static boolean search(int matrix[][], int key){


        for (int i=0;i< matrix.length; i++){
            for (int j=0;j<matrix[0].length; j++){
                if (matrix[i][j] == key){
                    System.out.println("found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }


    public static void search_largest(int matrix[][]){
        int largest =Integer.MIN_VALUE;
        for (int i=0;i< matrix.length; i++){
            for (int j=0;j<matrix[0].length; j++){
                int number = matrix[i][j];
                if (number >largest){
                    largest=number;
                }
            }
        }
        System.out.println("largest no. is "+largest);
    }


    public static void search_smallest(int matrix[][]){
        int smallest =Integer.MAX_VALUE;
        for (int i=0;i< matrix.length; i++){
            for (int j=0;j<matrix[0].length; j++){
                int number = matrix[i][j];
                if (number <smallest){
                    smallest=number;
                }
            }
        }
        System.out.println("smallest no. is "+smallest);
    }


    //spiral matrices
    public static void printSpiral(int matrix[][]){
        int startRow =0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while (startRow<=endRow && startCol <=endCol){
            //top
            for(int j= startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for (int i =startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for (int j=endCol-1; j>=startCol; j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for (int i=endRow-1; i>=startRow+1; i--){
                if (startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }


    //diagonalSum
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (i == j) {
//                    sum += matrix[i][j];
//                }
//                if (i+j==matrix.length-1){
//                    sum +=matrix[i][j];
//                }
//            }
//        }

        //other approach
        for (int i=0; i< matrix.length; i++){
            sum += matrix[i][i];
            if(i != matrix.length-1-i){
                sum +=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }


    //search in sorted matrix
    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;
        while (row< matrix.length && col >=0){
            if (matrix[row][col]==key){
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if (key<matrix[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String args[]) {
        //multi-dimentional Array
        //1D,2D and 3D array

        //creating 2d array
//        int matrix[][] = new int[3][3];
//        int m = matrix.length, n = matrix[0].length;
        //total no. of cell == rows x column
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
        //outPut
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//        search(matrix, 5);
//        search_largest(matrix);
//        search_smallest(matrix);

        //spiral matrix
        int matrix[][] ={{1,2,3,4,},
                {5,6,7,8},
                {9,10,11,12},
                {33,14,15,16}};
//        printSpiral(matrix);

        //diagonalSum
//        System.out.println(diagonalSum(matrix));


        //search in sorted matrix
        int key =33;
        staircaseSearch(matrix,key);
    }
}
