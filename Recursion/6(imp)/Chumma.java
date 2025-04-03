public class Chumma {
    public static void main(String[] args) {

        int startrow=0;
        int startcol=0;
        boolean[][] maze={{true,true,true},{true,true,true},{true,true,true}};
        PrintPaths("",maze,startrow,startcol);
    }



    public static void PrintPaths(String processed,boolean[][] maze,int row,int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(processed);
            return;
        }
        

        if(!maze[row][col]){
            return;
        }

        maze[row][col]=false;

        if(row<maze.length-1){

            PrintPaths(processed + "D", maze, row+1, col);

        }


        if(col<maze[0].length-1){
            PrintPaths(processed + "R", maze, row, col+1);
        }

        if(row >0){
            PrintPaths(processed + "U", maze, row-1, col);
        }
        if(col>0){
            PrintPaths(processed + "L", maze, row, col-1);
        }


        maze[row][col]=true;
    }
}
