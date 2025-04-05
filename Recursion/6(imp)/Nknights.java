public class Nknights {
    public static void main(String[] args) {
        int n=4;
        boolean board[][]=new boolean[n][n];


        knights(board,0,0,n);
    }


    public static void knights(boolean[][] board,int Startrow,int Startcol,int noOfKnights){


        if(noOfKnights==0){
            display(board);
            System.out.println();
            return;
        }

    // Stop if it reaches the end  of the row
        if(Startrow==board.length){
                return ;
        }
// if it reached the end of the column then go to next line
        if(Startcol==board.length){
            knights(board, Startrow+1, 0, noOfKnights);
        }



        if(isSafe(board,Startrow,Startcol)){
              board[Startrow][Startcol]=true;
              knights(board, Startrow, Startcol+1, noOfKnights-1);
              board[Startrow][Startcol]=false;
              
        }





    }


    public static boolean isSafe(boolean[][] board,int row,int col){


        if(isValid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        
        if(isValid(board, row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        
        if(isValid(board, row-1, col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        
        if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }


        return true;

    }


    public static boolean isValid(boolean[][] board,int row,int col){


        if(row>=0 && row<board.length && col>=0 && col<board[0].length){
            return true;
        }



        return false;
    }






    public static void display(boolean[][] board){


        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]){
                    System.out.print("K" + " ");
                }else{
                    System.out.print("X" + " ");
                }
            }

            System.out.println();
        }
    }
}
