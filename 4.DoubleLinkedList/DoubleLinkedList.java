public class DoubleLinkedList {
    EmployeeNode head;
    EmployeeNode tail;
    int size;

    public void add(Employee e){
        EmployeeNode aa=new EmployeeNode(e);
        if(size==0){
            head=aa;
            tail=aa;
        }else{
            EmployeeNode ab=tail;
            tail.setNext(aa);
            aa.setPrevious(ab);
            tail=aa;
        }
        size++;
    }

    public void print(){
        EmployeeNode aa=head;
        while (aa!=null){
            System.out.println(aa);
            aa=aa.getNext();
        }
    }

    public void addtoFront(Employee e){
        EmployeeNode aa=new EmployeeNode(e);
        aa.setNext(head);
        head.setPrevious(aa);
        head=aa;
        size++;
    }

    public void addAtPosition(int Position,Employee e){
        if(Position<0 || Position>size){
            throw new NullPointerException("Index :"+Position+" size :"+size);
        }
        if(Position==0){
            addtoFront(e);
        }else if(Position==size){
            add(e);
        }else{
            EmployeeNode aa=new EmployeeNode(e);
            EmployeeNode ab=head;
            for(int i=0;i<Position-1;i++){
                ab=ab.getNext();
            }
            aa.setNext(ab.getNext());
            ab.getNext().setPrevious(aa);
            ab.setNext(aa);
            aa.setPrevious(ab);
            size++;
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size<=0);
    }

    public void indexOf(Employee e){
        EmployeeNode aa=new EmployeeNode(e);
        EmployeeNode ab=head;
        int count=0;
        for(int i=0;i<size;i++){
            if(ab.getEe().equals(e)){
                System.out.println(i);
                count++;
            }
            ab=ab.getNext();
        }
        if(count==0){
            System.out.println(-1);
        }

    }

    public void deletefront(){
        EmployeeNode ab=head.getNext();
        head=ab;
        ab.setPrevious(null);
        size--;
    }

    public void deletelast(){
        EmployeeNode x=tail.getPrevious();
        tail.setPrevious(null);
        x.setNext(null);
        tail=x;
        size--;
    }

    public void deleteAtPosition(int Position){
        if(Position<0 || Position>=size){
            throw new NullPointerException("Index :"+ Position + "Size :"+size);
        }

        if(Position==0){
            deletefront();
        }
        else if(Position==size-1){
            deletelast();
        }else{

            EmployeeNode aa=head;
            for(int i=0;i<Position-1;i++){
                aa=aa.getNext();
            }
            aa.getPrevious().setNext(aa.getNext());
            aa.getNext().setPrevious(aa.getPrevious());
            aa.setPrevious(null);
            aa.setNext(null);
            size--;
        }
    }


}
