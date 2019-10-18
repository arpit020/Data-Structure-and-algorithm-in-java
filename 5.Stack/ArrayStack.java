import java.util.EmptyStackException;

public class ArrayStack {

    Employee[] arr;
    int top;

    ArrayStack(int Capacity){
        arr=new Employee[Capacity];
    }

    public void push(Employee e){
        if(top==arr.length){
            Employee[] ab=new Employee[2*arr.length];
            System.arraycopy(arr,0,ab,0,arr.length);
            arr=ab;
        }else{
            arr[top++]=e;
        }
    }

    public Employee pop(){
        if(top==0){
            throw new EmptyStackException();
        }

            Employee x= arr[--top];
            arr[top]=null;
            return  x;
        }

        public boolean isEmpty(){
               return top==0;
        }

        public Employee peek(){
            if(top==0){
                throw new EmptyStackException();
            }
            return arr[top-1];
        }

        public int size(){
        return top;
        }

        public void print(){

        for(int i=top-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        }


    }


