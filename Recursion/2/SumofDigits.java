class SumofDigits{
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }

    public static int sum(int num){

        if(num<=0){
            return 0;
        }

        return sum(num/10)+num%10;
        
    }
}