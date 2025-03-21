class Bubblesort{
    public static void main(String[] args) {
        

        int[] arr={5,4,2,1,3};



        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }


        for(int ni:arr){
            System.out.println(ni);
        }
    }
}