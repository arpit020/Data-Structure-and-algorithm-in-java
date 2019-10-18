public class Main3 {
    public static void main(String args[]){


        //creating the objects of employee class
        Employee a1=new Employee("arpit","rathi",001);
        Employee a2=new Employee("shubham","rathi",002);
        Employee a3=new Employee("sanyam","rathi",003);
        Employee a4=new Employee("kushagra","rathi",004);
        Employee a5=new Employee("kush","rathi",004);


       //creating an object of stack
        ArrayStack aa=new ArrayStack(10);


        //checking stack is empty or not
        System.out.println(aa.isEmpty());

        //pushing the elements to stack
        aa.push(a1);
        aa.push(a2);
        aa.push(a3);
        aa.push(a4);
        aa.push(a5);

        //printing the stack
        //print function will print the stak from last to front
        //you can make changes in print function to print from front to last
        System.out.println("---------------");
        aa.print();

        //pop the last element
        System.out.println("---------------");
        System.out.println(aa.pop());

        //peek the last element
        System.out.println("---------------");
        System.out.println(aa.peek());

        //printing the stack
        System.out.println("---------------");
        aa.print();

        //printing the size of stack
        System.out.println("---------------");
        System.out.println(aa.size());





    }
}
