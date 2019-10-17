public class Main2 {
    public static void main(String args[]){

        //creating the object of employee class
        Employee a1=new Employee("arpit","rathi",001);
        Employee a2=new Employee("shubham","rathi",002);
        Employee a3=new Employee("sanyam","rathi",003);
        Employee a4=new Employee("kushagra","rathi",004);
        Employee a5=new Employee("kush","rathi",004);


        //Creating an object of CircularLinkedList
        DoubleLinkedList aa=new DoubleLinkedList();

        //checking list is empty or not
        System.out.println(aa.isEmpty());


        //adding the employee to the class
        aa.add(a1);
        aa.add(a2);
        aa.add(a3);
        aa.add(a4);


        //printing the List
        System.out.println("-----------");
        aa.print();

        //add the element to the  front
        aa.addtoFront(a5);

        //printing the List
        System.out.println("-----------");
        aa.print();


         //adding the element at given postion....here position is index
        aa.addAtPosition(3,a5);
        //aa.addAtPosition(0,a3);
        //aa.addAtPosition(5,a2);

        //printing the List
        System.out.println("-----------");
        aa.print();

        //printing the size of list
        System.out.println("-----------");
        System.out.println(aa.size());


        //checking the list is empty or not
        System.out.println("-----------");
        System.out.println(aa.isEmpty());



        //getting the index of particular element in list...if it is present more than 1 position then it will print all the elements
        //if not present..then it will print -1
        System.out.println("-----------");
        aa.indexOf(a3);


        //deleting the element from front
        aa.deletefront();


        //printing the list
        System.out.println("-----------");
        aa.print();


        //deleting from the end
        aa.deletelast();

        //printing the list
        System.out.println("-----------");
        aa.print();



        //printing the elemnt from particular position.........here position is index
        aa.deleteAtPosition(2);

        //printing the list
        System.out.println("-----------");
        aa.print();



    }
}
