import java.util.ArrayList;

public class MazewithDiagnol {

    // here in maze we will give paths in a array List consider in a 2 d  maze  pointer that moves in a diagnol
    // "V"-vertical "H"- horizontal "D"-diagnol
    public static void main(String[] args) {
    int col=3;
    int row=3;

    ArrayList<String> arr=printWaysWithDiagnol("",row, col);

    System.out.println(arr);


    int count=countWays("null", row, col);
    System.out.println(count);
    }

    public static ArrayList<String> printWaysWithDiagnol(String processed,int row,int col){
        if(row==1 && col==1){
            ArrayList<String> arr=new ArrayList<>();
            arr.add(processed);
            return arr;
        
        }


        ArrayList<String> list =new ArrayList<>();

        if(row>1){
            list.addAll(printWaysWithDiagnol(processed + "H", row-1, col));
        }

        if(col>1){
            list.addAll(printWaysWithDiagnol(processed + "V", row, col-1));


        }

        if(row>1 && col>1){
            list.addAll(printWaysWithDiagnol(processed + "D", row-1, col-1));
        }


        return list;
    }

    public static int countWays(String processed,int row,int col){
        if(row==1 || col==1){
            return 1;
        }


        int vertical=countWays(processed + "V", row, col-1);
        int horizontal=countWays(processed + "H", row-1, col);
        int diagnol=countWays(processed + "D", row-1, col-1);

        int count =vertical+horizontal+diagnol;
        return count;
    }
}



