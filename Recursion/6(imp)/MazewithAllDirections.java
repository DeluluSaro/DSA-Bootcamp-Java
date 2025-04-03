

public class MazewithAllDirections {
    public static void main(String[] args) {
        boolean[][] maze = { { true, true, true }, { true, false, true }, { true, true, true } };
        allDirectionsPath("", maze, 0, 0);
    }

    public static  void allDirectionsPath(String processed,boolean[][] maze,int row,int col){


        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(processed);
            return ;

        }



        if(!maze[row][col]){
            return ;

        }

        if(col<maze[0].length-1){
            allDirectionsPath(processed + 'R', maze, row, col+1);
        }

        if(row>0){
            allDirectionsPath(processed + 'L', maze, row-1, col);
        }

        if(col>0){
            allDirectionsPath(processed + 'T', maze, row, col-1);
        }

        if(col<maze.length-1){
            allDirectionsPath(processed + 'D', maze, row, col+1);
        }



    }
}

// This code will give error as the recusrsion is stuck in loop in func(0,0) the same ques in solved in MazewithalldirectionsBacktracking
// Recursion overflow  error