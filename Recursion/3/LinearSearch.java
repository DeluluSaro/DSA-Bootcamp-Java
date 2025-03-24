import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args){

        int arr[]={1,3,4,2,8,2};
        int target=2;
        System.out.println(find(arr,target,0));
        multipleOcurrences(arr,target,0);
        System.out.println(ar);
ArrayList<Integer> ar=new ArrayList<>();
        System.out.println(Targets(arr, target, ar, 0));
    }







    // ArrayList to add multiple occurrences

    static ArrayList<Integer> ar=new ArrayList<>();


    public static int multipleOcurrences(int arr[],int target,int point){

        if(point==arr.length){
            return 0;
        }


        if(target==arr[point]){
            ar.add(point);
        }

        return multipleOcurrences(arr, target, point+1);

    }


// Multiple occurences by returning an array list

// 1. Passing Answer List as Argument

public static ArrayList<Integer> Targets(int arr[], int target, ArrayList<Integer> ar,int point){


    if(point == arr.length){
        return ar;
    }

    if(arr[point]==target){
        ar.add(point);
    }

    return Targets(arr,target,ar,point+1);

}



// return list but declare it inside the function


    public static boolean find(int[] arr,int target,int point){


        if(point==arr.length){
            return false;
        }


        if(arr[point]==target){
            return true;
        }


        return find(arr, target, point+1);

    }
}
