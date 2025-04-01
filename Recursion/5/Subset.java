import java.util.*;
// Subset using Iteration
public class Subset {
    public static void main(String[] args) {

        int arr[]={1,2,3};
System.out.println(subset(arr));
    }


    public static List<List<Integer>>  subset(int[] arr){

        List<List<Integer>> outer=new ArrayList<>();

        // For Adding an empty list in a subset we have a empty set in it hence to make it we should use this
        outer.add(new ArrayList<>());


        for(int num=0;num<arr.length;num++){
            // Take size make a copy of it and use it to add new number;
            int n=outer.size();

            for(int i=0;i<n;i++){
                // outer.get(i) to get the copied eleemt and add new number like its a special constructor
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(arr[num]);
                outer.add(internal);
            }
        }
       


        return outer;



    }
}
