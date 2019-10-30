public class Main6 {

    public static void main(String args[]){

        //creating the objects of employee class
        Employee a1=new Employee("arpit","rathi",001);
        Employee a2=new Employee("shubham","nagori",002);
        Employee a3=new Employee("sanyam","srivastava",003);
        Employee a4=new Employee("kushagra","garg",004);
        Employee a5=new Employee("kartik","rathi",005);


        //creating an object of hashtable
        SimpleHashTable hashtable=new SimpleHashTable();

        //checking empty or not
        System.out.println(hashtable.isEmpty());

        //adding the elements
        hashtable.put("rathi",a1);
        hashtable.put("nagori",a2);
        hashtable.put("srivastava",a3);
        hashtable.put("garg",a4);
        hashtable.put("rathi",a5);

        //checking empty or not
        System.out.println("-----------------------");
        System.out.println(hashtable.isEmpty());


        //printing the hastable
        System.out.println("-----------------------");
        hashtable.printtable();


        //get an elemet by giving key
        System.out.println("-----------------------");
        System.out.println(hashtable.get("nagori"));

        //printing the size of hastable
        System.out.println("-----------------------");
        System.out.println(hashtable.size());

        //deleting the element of particular key
        System.out.println("-----------------------");
        System.out.println(hashtable.delete("rathi"));

        //printing the hastable
        System.out.println("-----------------------");
        hashtable.printtable();


        //adding the element
        System.out.println("-----------------------");
        hashtable.put("rathi",a5);

        //printing the hastable
        System.out.println("-----------------------");
        hashtable.printtable();
    }
}
