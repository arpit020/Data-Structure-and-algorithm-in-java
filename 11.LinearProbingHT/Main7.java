public class Main7 {

    public static void main(String args[]){

        //creating the objects of employee class
        Employee a1=new Employee("arpit","rathi",001);
        Employee a2=new Employee("shubham","nagori",002);
        Employee a3=new Employee("sanyam","srivastava",003);
        Employee a4=new Employee("kushagra","garg",004);
        Employee a5=new Employee("kartik","rathi",005);


        //creating an object of hashtable
        LinearProbing hashtable=new LinearProbing();



        //adding the elements
        hashtable.put("rathi",a1);
        hashtable.put("nagori",a2);
        hashtable.put("srivastava",a3);
        hashtable.put("garg",a4);
        hashtable.put("rathy",a5);




        //printing the hastable
        System.out.println("-----------------------");
        hashtable.printtable();



        System.out.println(hashtable.get("rathi"));


        System.out.println(hashtable.remove("nagori"));

        System.out.println(hashtable.get("rathy"));
        hashtable.printtable();
    }
}
