import java.util.NoSuchElementException;

public class ArrayQueue {

    Employee queue[];
    int front;
    int back;
    ArrayQueue(int capacity){
        queue=new Employee[capacity];
    }

    public void add(Employee e){
        if(back==queue.length){
            Employee newArray[]=new Employee[2*queue.length];
            System.arraycopy(queue,0,newArray,0,queue.length);
            queue=newArray;
        }
        queue[back++]=e;
    }

    public Employee remove(){
        if(size()==0){
            throw new NoSuchElementException("Queue is empty");
        }
        Employee aa=queue[front];
        queue[front]=null;
        front++;
        if(size()==0){
            front=0;
            back=0;
        }

        return aa;

    }

    public int size(){
        return back-front;
    }

    public Employee peek(){
        if(size()==0){
            throw new NoSuchElementException("Queue is empty");
        }

        return queue[front];
    }

    public void print(){
        for(int i=front;i<back;i++){
            System.out.println(queue[i]);
        }
    }


    public boolean isEmpty(){
        return ((back-front)==0);
    }
}
