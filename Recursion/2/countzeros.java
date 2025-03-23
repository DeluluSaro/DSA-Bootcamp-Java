class countzeros{
    public static void main(String[] args) {
        totZeros(2030400084);

        System.out.println(count);
    }
    static int count=0;

    public static void totZeros(int num){
    if(num==0){
        return;
    }
      int rem=num%10;

      if(rem==0){
        count++;
      }

      totZeros(num/10);


    }
}