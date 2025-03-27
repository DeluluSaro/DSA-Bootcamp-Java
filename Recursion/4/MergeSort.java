import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={4,2,1,3};


    System.out.println(Arrays.toString(MergeSort(arr)));


    }


    public static int[] MergeSort( int[] arr ){
        if(arr.length==1){
            return arr ;
        }

        int mid=arr.length/2;

        int[] left=MergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=MergeSort(Arrays.copyOfRange(arr, mid, arr.length));


        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        System.out.println("**************************************");




        return merge(left,right);

       
    }

    public static int[] merge(int[] left,int[] right){


        int i=0;int j=0;
        int k=0;

        int merged[]=new int[left.length+right.length];


        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                merged[k]=left[i];
                i++;
            }else{
                merged[k]=right[j];
                j++;
            }
            k++;
        }


        while(i<left.length){
            merged[k]=left[i];
            k++;
            i++;
        }
        while(j<left.length){
            merged[k]=right[j];
            k++;
            j++;
        }






        return merged;
    }
}
