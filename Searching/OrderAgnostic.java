class Main{

    public static void BinarySearch(int[] arr,int target){
     int start=0;
     int end=arr.length-1;



     while(start<=end){
        int mid=start+(end-start)/2;

       if(arr[end]>arr[start]){
        if(arr[mid]<target){
            start=mid+1;
        }else{
            end=mid-1;
        }
       }else{
        if(arr[mid]>target){
            start=mid+1;
        }else{
            end=mid-1;
        }
       }



       if(arr[mid]==target){
        System.out.println(mid);
       }
     }
    }
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        int target=1;


        BinarySearch(arr,target);
    }
}