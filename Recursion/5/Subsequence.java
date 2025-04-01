import java.util.*;

public class Subsequence {
    public static void main(String[] args) {
        String str="abcd";

        subsequence(str,"");
        
        System.out.println(st);



    }
    // Same Program to return array list of items

public static ArrayList<String> st=new ArrayList<>();

public static void subsequence(String str,String ans){
    if(str.isEmpty()){
        st.add(ans);
        System.out.println(ans);
        
        return;
    }

    subsequence(str.substring(1),ans+str.charAt(0));//This sequence if all the vlaues are considered
    subsequence(str.substring(1),ans);//this sequence with all value are not considered 
    
}






}
