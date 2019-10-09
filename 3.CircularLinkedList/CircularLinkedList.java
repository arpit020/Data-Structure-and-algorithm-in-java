public class CircularLinkedList {
    public EmployeeNode head;
    int count;

    public void add(Employee employee) {
        EmployeeNode ab = new EmployeeNode(employee);
        if (count == 0) {
            head=ab;
            ab.setNext(head);
        } else {
            EmployeeNode aa = head;
            while (aa.getNext()!=head){
                aa=aa.getNext();
            }
           /* for(int i=0;i<count-1;i++){
                aa = aa.getNext();
            }*/
            aa.setNext(ab);
            ab.setNext(head);
        }
        count++;
    }
    public void print(){
        EmployeeNode aa = head;
        System.out.println(aa);
        aa=aa.getNext();
        while (aa!= head) {
            System.out.println(aa.toString());
            aa = aa.getNext();
        }
    }

    public void addtoFront(Employee  e){
        EmployeeNode aa=new EmployeeNode(e);
        aa.setNext(head);
        //head=aa;
        EmployeeNode ab=head;
        while(ab.getNext()!=head){
            ab=ab.getNext();
        }
        ab.setNext(aa);
        head=aa;
        count++;
    }

    public void addatPosition(int Position, Employee e){
        EmployeeNode aa=new EmployeeNode(e);
        if(Position<0 || Position>count){
            throw new NullPointerException("Index "+Position+" Size "+count);
        }
        else if(Position==0){
            addtoFront(e);
        }
        else if(Position==count){
            add(e);
        }else {
            EmployeeNode ab = head;
            for (int i = 0; i < Position - 1; i++) {
                ab = ab.getNext();
            }
            EmployeeNode a1 = ab.getNext();
            ab.setNext(aa);
            aa.setNext(a1);
            count++;
        }
    }
    public void size(){
        System.out.println(count);
    }

    public  void isEmpty(){
        if(count==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    public void indexOf(Employee e){
        EmployeeNode aa=head;
        int ff=0;
        for(int i=0;i<count;i++){
            if(aa.getEe().equals(e)){
                ff++;
                System.out.println(i);
            }
            aa=aa.getNext();
        }

        if(ff==0){
            System.out.println(-1);
        }
    }

    public void deleteAtPosition(int Position) {
        if (Position < 0 || Position >= count) {
            throw new NullPointerException("index" + Position + "size" + count);
        }
        EmployeeNode aa = head;

        if (Position == 0) {
            EmployeeNode x=aa.getNext();
            while(aa.getNext()!=head){
                aa=aa.getNext();
            }
            aa.setNext(x);
            head=x;

        } else {
            for (int i = 0; i < Position - 1; i++) {
                aa = aa.getNext();
            }
            EmployeeNode ab = aa.getNext();
            EmployeeNode x = ab;
            x = null;
            ab = ab.getNext();
            aa.setNext(ab);

        }
        count--;
    }

}
