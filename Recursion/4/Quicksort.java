public class Quicksort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        for(int in:arr){
            System.out.print(in + " ");
        }
        System.out.println();

        quicksort(arr,0,arr.length-1);


        for(int in:arr){
            System.out.print(in + " ");
        }



    }


    public static  void quicksort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
          int s=low;
          int e=high;

          int mid=s+(e-s)/2;

          int pivot=arr[mid];


          while(s<=e){

            while(arr[s]<pivot){
                s++;
            }


            while(arr[e]>pivot){
                e--;
            }


            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }



          }



        //   Recursion Call- now we have a array such that it look like [(low)1,3,2(e),4,(s)5(high)] hence we neesd to sort again

        quicksort(arr, low, e);
        quicksort(arr, s, high);






        
    }
}
