class binarySearch{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,50};
        int target=0;


       System.out.println( bsearch(arr,target,0,arr.length-1));;
    }

    public static int bsearch(int[] arr,int target,int start,int end){

// Target not found then this condition will take on the view
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;


        if(arr[mid]==target){
            return mid;
        }


        if(arr[mid]>target){
            return bsearch( arr, target,start,mid-1);
        }


        
            return bsearch(arr, target, mid+1, end);
        

    }
}