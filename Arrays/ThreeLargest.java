import java.util.*;
class ThreeLargest{
    public static void main(String[] args) {
        int arr[]={14,5,6,7,2,3};

        Arrays.sort(arr);

       

        int first,second,third;
int n=arr.length-1;
        first=arr[n];
        second=arr[n-1];
        third=arr[n-2];
        System.out.println(first);
        System.out.println(second);

        System.out.println(third);

    }
}