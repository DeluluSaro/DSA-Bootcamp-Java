package Basics;

public class Amstrong {

    public static void main(String[] args) {
        int n = 13;

        int target=n;

        int ams = 0;
        while (target > 0) {
            int remainder = target % 10;
            ams += Math.pow(remainder, 3);
            target = target / 10;

        }

        if(ams==n){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }

    }

}
