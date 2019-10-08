public class Mainfile {
    public static void main(String args[]) {
        //making an array list of size 5
        ArrayList a1 = new ArrayList(5);

        //checking whether array-list is empty or not
        System.out.println(a1.isEmpty());

        //adding elements to array-list
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        a1.add(60);
        a1.add(70);
        a1.add(80);


        //printing array list using iterator-function(provide in 3rd file)
        iterator aa = new iterator(a1);
        while (aa.hasNext()) {
            System.out.println(aa.next());
        }

        //printing th array size
        System.out.println(a1.size());

        //getting an element at index 7
        System.out.println(a1.get(7));

        //printing the array using print-function
        a1.print();

        //remove the element at index 5
        System.out.println(a1.remove(5));

        //again printing the array
        a1.print();

        //finding the index of element m
        int m = 60;
        System.out.println("index of " + m + " : " + a1.indexOf(m));

        //inserting the element at index 0
        a1.insertAt(0, 100);

        //again printing the array
        a1.print();

    }
}


