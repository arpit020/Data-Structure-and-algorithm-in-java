import java.util.NoSuchElementException;

public class ArrayCircularQueue{

    Employee queue[];
    int front;
    int back;
    ArrayCircularQueue(int capacity){
        queue=new Employee[capacity];
    }

    public void add(Employee e){
        if(size()==queue.length-1){

            int num=size();
            Employee newArray[]=new Employee[2*queue.length];
            System.arraycopy(queue,front,newArray,0,queue.length-front);
            System.arraycopy(queue,0,newArray,queue.length-front,back);
            queue=newArray;

            front=0;
            back=num;
        }
        queue[back]=e;
        if(back<queue.length-1){
            back++;
        }else{
            back=0;
        }
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
        }else if(front==queue.length){
            front=0;
        }


        return aa;

    }

    public int size(){

        if(back>=front)
           return back-front;
        else
            return queue.length-front+back;
    }

    public Employee peek(){
        if(size()==0){
            throw new NoSuchElementException("Queue is empty");
        }

        return queue[front];
    }

    public void print(){
        if(back>=front) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
        else{
            for(int i=front;i<queue.length;i++){
                System.out.println(queue[i]);
            }
            for(int i=0;i<back;i++){
                System.out.println(queue[i]);
            }
            }
     }


    public boolean isEmpty(){
        return ((back-front)==0);
    }
}
