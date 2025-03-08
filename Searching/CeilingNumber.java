public class CeilingNumber {
    public static int CeilingNumber(int[] arr,int target){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(target>arr[mid]){
             left=mid+1;
            }else if(target==arr[mid]){
                return arr[mid];
            }else{
                right=mid-1;
            }
        }
        return arr[right];
    }
    public static void main(String[] args) {
     int[] arr={1,2,8,10};   
int target=9;

     System.out.println(CeilingNumber(arr,target));
    }
}
