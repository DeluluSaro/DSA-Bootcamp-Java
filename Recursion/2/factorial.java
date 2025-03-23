public class factorial {


    public static void main(String[] args) {
     System.out.println(fact(12));
    }

    public static int  fact(int num){
        
         
        if(num<2){
            return 1;
        }

        


        return num * fact(num-1);


    }
    
}
