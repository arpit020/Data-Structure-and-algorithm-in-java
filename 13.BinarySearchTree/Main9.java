public class Main9 {

    public static void main(String args[]){

        Tree tree=new Tree();

        tree.insert(25);

        tree.insert(20);
        tree.insert(27);
        tree.insert(15);
        tree.insert(22);
        tree.insert(26);
        tree.insert(30);
        tree.insert(29);
        tree.insert(32);
        //tree.insert(17);



        System.out.println(tree.search(31));
        tree.traversePostOrder();
        System.out.println();
        tree.traversePreOrder();
        System.out.println();
        tree.traverseInorder();
        System.out.println();
        System.out.println(tree.min());

       tree.delete(15);
        tree.traversePostOrder();

        System.out.println("------------");


        tree.levelOrder();


    }
}
