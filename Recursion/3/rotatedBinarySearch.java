public class rotatedBinarySearch {

    public static void main(String[] args) {
         int arr[]={5,6,7,8,9,1,2,3};
         int target=7;



         System.out.println(rotSearch(arr,target,0,arr.length-1));;
    }

    public static int rotSearch(int[] arr, int target,int s,int e){
        if(s>e){
            return -1;
        }
    
    
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(target>=arr[s] && target <= arr[mid]){
          return  rotSearch(arr, target, s, mid-1);
            }else{
         return   rotSearch(arr, target, mid+1,e);
            }
        }
    
        if(target>=arr[mid] && target<=arr[e]){
            return rotSearch(arr, target, mid+1, e);
        }
    
    
        return rotSearch(arr, target, s, mid-1);
    
    }
    



    
}
