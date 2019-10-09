public class Main {

    public static void main(String args[]){


        //creating the object of employee class
        Employee a1=new Employee("arpit","rathi",001);
        Employee a2=new Employee("shubham","rathi",002);
        Employee a3=new Employee("sanyam","rathi",003);
        Employee a4=new Employee("kushagra","rathi",004);
        Employee a5=new Employee("kush","rathi",004);


        //Creating an object of LinkedList
        EmployeeLinkedList aa=new EmployeeLinkedList();


        //adding the employee to the class
        aa.add(a1);
        aa.add(a2);
        aa.add(a3);
        aa.add(a4);


        //printing the LinkedList
        aa.print();

        //adding the employee to the front
        aa.addtoFront(a2);

        //printing the LinkedList
        aa.print();

        //adding the element at given position..here position equals to the index
        aa.addatPosition(2,a4);

        //printing the LinkedList
        aa.print();

        //deleting the element at given position...here position equals to the index
        aa.deleteAtPosition(0);

        //printing the LinkedList
        aa.print();

        //printing the size of LinkedList
        aa.size();

        //checking whether the LinkedList is empty or not
        aa.isEmpty();

        //getting the index of particular employee...if employee comes more than one time than it will print all the indexes
        //if not present in the LinkedList....output will be -1
        aa.indexOf(a5);
    }
}
