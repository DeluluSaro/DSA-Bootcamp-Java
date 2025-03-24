class checkSorted{
    public static void main(String[] args){
        int arr[]={1,2,3,4,1,7};
        System.out.println(sorted(arr,0));
    }

    public static boolean sorted(int[] arr,int num){
        if(num==arr.length-1){
            return true;
        }


        return arr[num]<arr[num+1] && sorted(arr, num+1);
    }
}