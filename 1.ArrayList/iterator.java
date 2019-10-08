import java.util.NoSuchElementException;

public class iterator {

    ArrayList list;
    int nextIndex;

    iterator(ArrayList list1){
        list=list1;
        nextIndex=0;
    }

    public boolean hasNext(){
        return (list.size>nextIndex);
    }

    public int next(){
        if(nextIndex<list.size){
            return list.get(nextIndex++);
        }else{
            throw new NoSuchElementException("No next Element");
        }
    }

}
