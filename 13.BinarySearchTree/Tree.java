import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tree {

    private TreeNode root;

    public void insert(int data){
        if(root==null){
            root=new TreeNode(data);
        }else{
            root.insert(data);
        }
    }

    public int search(int data){
        if(root==null){
            return -1;
        }
           return root.get1(data);
    }

    public void traverseInorder(){
           if(root!=null){
               root.traverseInorder();
           }
    }
    public void traversePostOrder(){
        if(root!=null){
            root.traversalPostOrder();
        }
    }

    public void traversePreOrder(){
        if(root!=null){
            root.traversalPreOrder();
        }
    }

    public void levelOrder(){
        TreeNode aa=root;
        LinkedList<TreeNode> a=new LinkedList<>();
        a.add(root);
        while (!a.isEmpty()){
               aa=a.pollFirst();
               System.out.print(aa.getData()+" ,");
               if(aa.getLeftChild()!=null){
                   a.add(aa.getLeftChild());
               }
               if(aa.getRightChild()!=null){
                   a.add(aa.getRightChild());
               }
        }
    }


    public int min(){
        if(root!=null){
            return root.min();
        }
        return -1;
    }

    public int max(){
        if(root!=null){
            return root.max();
        }
        return Integer.MIN_VALUE;
    }

    public  void delete(int value){
        root=delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot,int value){
        if(subtreeRoot==null){
            return null;
        }

        if(value<subtreeRoot.getData()){
             subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(),value));

        }
        else if(value>subtreeRoot.getData()){
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(),value));
        }else{

            //case 0 and 1 when node has zero or one child
            if(subtreeRoot.getLeftChild()==null){
                return subtreeRoot.getRightChild();
            }else if(subtreeRoot.getRightChild()==null){
                return subtreeRoot.getLeftChild();
            }

                //case 3 node has 2childern
                //first getting the min value from right subtree and putting in current node data
                subtreeRoot.setData(subtreeRoot.getRightChild().min());
                //deleting the node has smallest value in right subtree
                subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(),subtreeRoot.getData()));
            }

        return subtreeRoot;
    }

}
