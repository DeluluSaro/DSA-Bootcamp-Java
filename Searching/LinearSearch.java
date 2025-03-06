package Searching;
public class LinearSearch {

    public static void main(String[] args) {
        
        int[] arr={7,43,2,1,456,5};
        int target=1;


        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i);
            }
        }
    }
    
}
