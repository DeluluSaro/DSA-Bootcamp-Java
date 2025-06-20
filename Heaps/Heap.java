package Heaps;
import java.util.*;
public class Heap<T extends Comparable<T>> {
    private ArrayList<T> heap;


    public Heap(){
        heap=new ArrayList<>();
    }
    

    public void swap(int first,int second){
        T temp=heap.get(first);
        heap.set(first,heap.get(second));
        
        heap.set(first,temp);
    }


    public int parent(int index){
        return (index-1)/2;
    }
    
    public int left(int index){
        return (index*2)+1;
    }
    public int right(int index){
        return (index*2)+2;
    }


    public void insert(T val){

        heap.add(val);

        upheap(heap.size()-1);

    }

    public void upheap(int index){
        if(index==0) return;
        int par=parent(index);

        if(heap.get(index).compareTo(heap.get(par))>0){
            swap(index, par);
            upheap(par);
        }



    }


    public T remove() throws Exception{
        if(heap.size()==0) throw new Exception("Heap is empty");
        T val=heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        downheap(0);
        return val;

    }

public void downheap(int index){
        int left=left(index);
        int right=right(index);

        int largest=index;  
    
        if(left<heap.size() && heap.get(left).compareTo(heap.get(largest))>0){
            largest=left;
        }

        


    }
    
    

}
