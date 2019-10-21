public class Main5 {

    public static void main(String args[]){

        //creating the objects of employee class
        Employee a1=new Employee("arpit","rathi",001);
        Employee a2=new Employee("shubham","nagori",002);
        Employee a3=new Employee("sanyam","srivastava",003);
        Employee a4=new Employee("kushagra","garg",004);
        Employee a5=new Employee("kartik","rathi",005);


        //creating an object of queue
        ArrayCircularQueue queue=new ArrayCircularQueue(5);

        //checking queue is empty or not
        System.out.print("queue is Empty : ");
        System.out.println(queue.isEmpty());

        //adding the elements to the queue
        queue.add(a1);
        queue.add(a2);
        queue.add(a3);
        queue.add(a4);
        queue.add(a5);

        //checking queue is empty or not
        System.out.println("After adding the elements...queue is empty : ");
        System.out.println(queue.isEmpty());

        //printing the queue
        System.out.println("Now queue is");
        queue.print();

        //printing the peek element of queue
        System.out.println("first element of queue : ");
        System.out.println(queue.peek());

        //removing the element from queue
        System.out.println("first element of queue which is removed : ");
        System.out.println(queue.remove());


        //printing the queue
        System.out.println("now the queue is : ");
        queue.print();


        //printing the queue
        System.out.println("size of queue is : ");
        System.out.println(queue.size());


        //some add and remove operations
        queue.remove();
        queue.remove();
        queue.remove();

        //print the queue
        System.out.println("now the queue is : ");
        queue.print();


        queue.add(a1);
        queue.add(a2);
        queue.add(a3);

        //print the queue
        System.out.println("now the queue is : ");
        queue.print();



    }
}



