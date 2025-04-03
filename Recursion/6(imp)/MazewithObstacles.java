public class MazewithObstacles {
    // maze with obstacles like a snake game we have stones in between a particular
    // place so that we cant go there (false condition in boolean)
    // for the same we take first example like we can go "Down -D" and 'R -right';

    // have 2 recursion calls and if stone is found --->stop recursion for that call
    // and return;
    // we are using 2d boolean matrix for this

    public static void main(String[] args) {

        boolean[][] maze = { { true, true, true }, { true, false, true }, { true, true, true } };

        // specify at which point you are going to start in row and column

        pathFindingWithObstacles("", maze, 0, 0);

    }

    public static void pathFindingWithObstacles(String processed, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(processed);
            return;
        }

        // HEre we have said program to particular row and col is false then dont pursue
        // that way we can write !maz[row][col] instead maze==false
        if (maze[row][col] == false) {
            return;
        }
        if (row < maze.length - 1) {
            pathFindingWithObstacles(processed + "R", maze, row + 1, col);
        }

        if (col < maze[0].length - 1) {
            pathFindingWithObstacles(processed + "D", maze, row, col + 1);
        }
    }
}
