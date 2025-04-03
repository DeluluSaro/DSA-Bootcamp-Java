import java.util.ArrayList;

public class CountingPaths {
    // count the no of paths to reach goal specified in a maze using a 2d arrays and
    // backtracking

    // tbh no backtracking ike just a glimpse

    public static void main(String[] args) {

        int row = 4;
        int column = 4;
        int ans = findWays(row, column);

        System.out.println(ans);

        ArrayList<String> arr = printWays("", row, column);
        System.out.println(arr);
    }

    public static int findWays(int row, int column) {
        // base condition to terminate the recursion like it will return 1 which goes to
        // the end of the tree and return 1 we consider 1,1 as end of the tree
        if (row == 1 || column == 1) {
            return 1;
        }
        int left = findWays(row, column - 1);
        int right = findWays(row - 1, column);

        int count = left + right;
        return count;
    }

    // print the actual paths (Permuntation) like processed and unprocessed
    public static ArrayList<String> printWays(String processed, int r, int c) {

        if (r == 1 && c == 1) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(processed);
            return arr;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(printWays(processed + "D", r - 1, c));
        }

        if (c > 1) {
            list.addAll(printWays(processed + "R", r, c - 1));
        }

        return list;

    }

}
