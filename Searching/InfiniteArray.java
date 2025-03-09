public class InfiniteArray {

    public static int Bsearch(int arr[],int start,int end,int target){
        int ans=-1;
    while(start<=end){
        int mid=start+(end-start)/2;

        if(target>arr[mid]){
           start=mid+1;
        }else if(target<arr[mid]){
            end=mid-1;
        }else{
            ans=mid;

            break;

        }
    }

        return ans;
    }
    public static void main(String[] args) {


        int start=0;
        int end=1;
        int target=9;
        int arr[]={1,2,3,4,5,6,7,8,9,10};



        //Finding Range


       while(target>arr[end]){
        int temp=end+1;
        end =end+(end-start)*2;
        start=temp;

        


       }

       System.out.println(Bsearch(arr,start,end,target));
        
    }
}
