public class Main1 {
    public static void main(String args[]){
        //creating the object of employee class
        Employee a1=new Employee("arpit","rathi",001);
        Employee a2=new Employee("shubham","rathi",002);
        Employee a3=new Employee("sanyam","rathi",003);
        Employee a4=new Employee("kushagra","rathi",004);
        Employee a5=new Employee("kush","rathi",004);


        //Creating an object of CircularLinkedList
        CircularLinkedList aa=new CircularLinkedList();


        //adding the employee to the class
        aa.add(a1);
        aa.add(a2);
        aa.add(a3);
        aa.add(a4);


        //printing the List
        aa.print();


        //add in front of CircularLinkedList
        aa.addtoFront(a4);

        System.out.println();
        System.out.println("------------------");
        System.out.println();


        //printing the List
        aa.print();

        //add at position ..here position is index
        aa.addatPosition(0,a1);


        System.out.println();
        System.out.println("------------------");
        System.out.println();


        //printing the List
        aa.print();

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        //print size of circular-Linked-List
        aa.size();

        System.out.println();
        System.out.println("------------------");
        System.out.println();


        //print index of particular index
        aa.indexOf(a1);

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        //delete at given position...position is index
        aa.deleteAtPosition(5);

        //printing
        aa.print();

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        //checking the list is empty or not
        aa.isEmpty();








    }
}
