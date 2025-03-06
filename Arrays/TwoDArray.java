public class TwoDArray {
    public static void main(String[] args){
        int[][] arr={{1,2,4},{5,3,6},{7,8,9}};
int target=3;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                if(arr[i][j]==target){
                    System.out.println(i +" "+ j);
                }

            }
        }
    }
    
}
