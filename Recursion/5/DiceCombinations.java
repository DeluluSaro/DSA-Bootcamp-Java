import java.util.ArrayList;

public class DiceCombinations {
public static void main(String[] args) {
    ArrayList<String> ans=dicecomb("",4);
    System.out.println(ans);
}

public static ArrayList<String> dicecomb(String processed,int target){
if(target==0){
    ArrayList<String> list=new ArrayList<>();
    list.add(processed);
    return list;
}



    ArrayList<String> list=new ArrayList<>();


    for(int i=1;i<=6 && i<=target;i++){

        list.addAll(dicecomb(processed+i,target-i));

    }


    return list;
}


}
