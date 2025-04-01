import java.util.*;

class Permutation{
    public static void main(String[] args) {
        

        Permun("","abc");
        ArrayList<String> hello=permuntation("","abc");
        System.out.println(hello);
        
    }



    public static void Permun(String processed,String unProcessed){

        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return ;
        }

        char ch=unProcessed.charAt(0);

        for(int i=0;i<=processed.length();i++){
            String strt=processed.substring(0,i);
            String end=processed.substring(i, processed.length());


            Permun(strt+ch+end, unProcessed.substring(1));

        }

    }



    // same use to return Array List

    public static ArrayList<String> permuntation(String processed,String unProcessed){
    if(unProcessed.isEmpty()){
        ArrayList<String> fin=new ArrayList<>();
        fin.add(processed);
        return fin;
    }


    ArrayList<String> ans=new ArrayList<>();

    char ch=unProcessed.charAt(0);

    for(int i=0;i<=processed.length();i++){
        String first=processed.substring(0, i);
        String last=processed.substring(i,processed.length());
        ans.addAll(permuntation(first+ch+last,unProcessed.substring(1)));


    }

    return ans;

    }
    

       


        
}
