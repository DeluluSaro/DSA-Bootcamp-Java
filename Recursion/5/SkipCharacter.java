public class SkipCharacter {
    public static void main(String[] args) {
        String c="kjaannsssniiggaaa";
        String p="";
        skip(c,p);


        String type2="abscbaabc";

       System.out.println(secondType(type2));


        
    }
    public static String secondType(String type2){

        if(type2.isEmpty()){
            return "";
        }

        if(type2.charAt(0)=='a'){
            return secondType(type2.substring(1));
        }else{
            return type2.charAt(0)+secondType(type2.substring(1));
        }

    }

    public static void skip(String c,String p){

        if(c.isEmpty()){
            System.out.println(p);
            return;


        }
        char ch=c.charAt(0);


        if(ch=='a'){
         skip(c.substring(1),p);
        }else{
            skip(c.substring(1), p+ch);
        }
         
        
    }   
}
