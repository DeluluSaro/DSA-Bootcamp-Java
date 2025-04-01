import java.util.*;
class MakeSubsetDuplicates{
    public static void main(String[] args) {
       int[] arr={1,2,2};
        System.out.println(DuplicateSubset(arr));
    }


    public static List<List<Integer>> DuplicateSubset(int[] arr){

        // Since i dont know the particular element is repeated  we need to sort the array and find whether the current element == next element
        Arrays.sort(arr);

        List<List<Integer>> outer=new ArrayList<>();


        outer.add(new ArrayList<>());

        int start=0;
        int end=0;



    for(int i=0;i<arr.length;i++){
        start=0;
        if(i>0 && arr[i]==arr[i-1]){
            start=end+1;
        }
        end=outer.size()-1;
        int n=outer.size();

        for(int j=start;j<n;j++){
            List<Integer> number=new ArrayList<>(outer.get(j));
            number.add(arr[i]);
            outer.add(number);


        }
    }

        return outer;

    }
}