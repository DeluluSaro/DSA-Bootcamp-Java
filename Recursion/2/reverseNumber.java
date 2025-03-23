public class reverseNumber {
    public static void main(String[] args){

        reverseNum(3451);
System.out.println(sum);
    }
    static int sum=0; //Can be used by all methouds maina abd reverseNUm can use this





    public static void  reverseNum(int num){

        if(num==0){
            return;
        }
        int rem=num%10;


        System.out.println(rem);  //After a certain amount of time it reaches zero and stop recursion due to stack overflow that zero is visualized here ,run it wothout  the above if condition to get your doubt clear
        

        sum=sum*10+rem;

        reverseNum(num/10);

    }
}
