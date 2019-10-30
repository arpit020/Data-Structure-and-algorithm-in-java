import java.util.LinkedList;
import java.util.ListIterator;

public class ChainingHashTable {

    private LinkedList<StoredEmployee>[] hashtable;

    ChainingHashTable(){
        hashtable=new LinkedList[10];
        for(int i=0;i<hashtable.length;i++){
            hashtable[i]=new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key,Employee e){
        int k=hashKey(key);
        hashtable[k].add(new StoredEmployee(key,e));

    }

    public Employee get(String key){
        int i=hashKey(key);
        ListIterator<StoredEmployee> it=hashtable[i].listIterator();
        StoredEmployee aa=null;
        while (it.hasNext()){
            aa=it.next();
            if(aa.key.equals(key)){
                return aa.employee;
            }
        }
        return null;
    }

    private int hashKey(String key){
        return key.length()%hashtable.length;
    }

    public Employee remove(String key){
        int i=hashKey(key);
        ListIterator<StoredEmployee> it=hashtable[i].listIterator();
        StoredEmployee aa=null;
        int index=0;
        while (it.hasNext()){

            aa=it.next();
            if(aa.key.equals(key)){
                break;
            }
            index++;
        }

        if(aa==null || !aa.key.equals(key)){
            return null;
        }else{
            hashtable[i].remove(index);
            return aa.employee;
        }
    }


    public void print(){
        for(int i=0;i<hashtable.length;i++){
            if(hashtable[i].isEmpty()){
                System.out.println("Position "+i+" is empty");
            }else{
                ListIterator<StoredEmployee> il=hashtable[i].listIterator();
                while (il.hasNext()){
                    System.out.println("position "+i+ il.next().employee);
                }
            }
        }
    }

}
