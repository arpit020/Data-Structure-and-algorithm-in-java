public class SimpleHashTable {

    Employee employee[];
    int size;

    SimpleHashTable(){
        employee=new Employee[10];
    }

    public void put(String key,Employee e){
        int a=hashkey(key);

        if(employee[a]!=null){
            System.out.println("already an employee at position :"+a);
        }else {
            employee[a] = e;
            size++;
        }
    }

    public Employee get(String key){
        return employee[hashkey(key)];
    }

    public int hashkey(String key){
        return key.length()%employee.length;
    }

    public void printtable(){

        for(int i=0;i<employee.length;i++){
            System.out.println(employee[i]);
        }
    }

    public boolean isEmpty(){
        return size==0;
    }

    public  int size(){
        return size;
    }

    public Employee delete(String key){
        Employee aa=employee[hashkey(key)];
        employee[hashkey(key)]=null;
        size--;
        return aa;

    }
}
