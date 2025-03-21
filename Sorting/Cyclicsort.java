public class Cyclicsort {

    public static void main(String[] args) {
        int arr[]={1,5,4,2,3};


       int i=0;

       while(i<arr.length){

    // when the array start at [1,2,3,4,5] 
    // if the array starts from [0,1,2,3,4] then int correct = arr[i];  arr[i<]

        int correct=arr[i]-1;

    if(arr[correct] != arr[i]){
        int temp=arr[correct];
        arr[correct]=arr[i];
        arr[i]=temp;
    }else{
        i++;
    }
       }




       for(int nu:arr){
        System.out.println(nu);
       }
    }
    
}
