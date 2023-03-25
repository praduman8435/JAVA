public class backtracking {

    public static void change_arr(int arr[], int i, int value){
//bASE CASE
if (i== arr.length){
    printArr(arr);
    return;
}

        // RECURSION
        arr[i]=value;
        change_arr(arr,i+1,value+1);
        arr[i]=arr[i]-2;//backtraking step
    }
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

   public static void findSubset(String str,String ans,int index){
        //base case
       if(index==str.length()){
           System.out.println(ans);
           return;
       }
       //recursion

       //yes choice
       findSubset(str,ans+str.charAt(index),index+1);
       //no choice
       findSubset(str,ans,index+1);
   }


   //find permutation
    public static void findPermutation(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
           String Newstr=str.substring(0,i)+str.substring(i+1);
            findPermutation(Newstr,ans+curr);
        }
    }

public static boolean isSafe(char board[][],int row, int col){
    //vertically up
    for(int i=row-1;i>=0;i--){
        if(board[i][col]=='Q'){
            return false;
        }
    }
    //diagonal left up
    for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
        if (board[i][j]=='Q'){
            return false;
        }
    }
    //diagonally right up
    for (int i=row-1,j=col+1;i>=0&&j< board.length;i--,j++){
        if (board[i][j]=='Q'){
            return false;
        }
    }
    return true;
}
    public static void nQueens(char board[][],int row){
        if(row== board.length){
            printBoard(board);
            return;
        }
        for (int j=0;j< board.length;j++){
            if (isSafe(board,row,j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'x';
            }
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("-------chess board-------");
        for (int i=0;i< board.length;i++){
            for (int j=0;j< board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }


    public static int gridWays(int i,int j,int m, int n){
        //base case
        if(i==m-1&&j==n-1){//condition for last cell
            return 1;
        }
        else if(i==m || j==n){//boundary cross condition
            return 0;
        }
        int w1=gridWays(i+1,j,n,m);
        int w2=gridWays(i,j+1,m,n);
        return w1+w2;
    }

    
    //sudoku solver
//    public static boolean sudoku_solver(int sudoku[][],int row, int col){
//        //base case
//        if(row==9&& col==9){
//            return true;
//        }else if(row==9){
//            return false;
//        }
//        //recursion
//        int nextRow=row,nextCol=col+1;
//        if(col+1==9){
//            nextRow=row+1;
//            nextCol=0;
//        }
//
//        if (sudoku[row][col]!=0){
//            sudoku_solver(sudoku,nextRow,nextCol);
//        }
//        for (int digit=1;digit<=9;digit++){
//            if(isSafe2(sudoku,row,col,digit)){
//                sudoku[row][col]=digit;
//               if (sudoku_solver(sudoku,nextRow,nextCol)){
//                   return true;
//               }
//               sudoku[row][col]=0;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
int arr[]=new int[5];
        change_arr(arr,0,1);
        printArr(arr);


        String str="abcde";
        findSubset(str,"",0);
findPermutation(str,"");


int n=4;
char board[][]=new char [n][n];
for (int i=0;i<n;i++){
    for (int j=0;j<n;j++){
        board[i][j]='x';
    }
}
nQueens(board,0);


int a=3,b=3;
        System.out.println(gridWays(0,0,a,b));
    }
}
