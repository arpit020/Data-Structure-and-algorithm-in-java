public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;


    TreeNode(int data){
        this.data=data;
    }

     public int min(){
        /*
        while (leftChild.getLeftChild()!=null){
            leftChild=leftChild.getLeftChild();
        }
        return leftChild.data;

         */

        if(leftChild.leftChild==null){
            return leftChild.data;
        }else{
            return  leftChild.min();
        }
     }


     public int max(){
        while (rightChild.getRightChild()!=null){
            rightChild=rightChild.getRightChild();
        }

        return rightChild.data;
     }
    public int get1(int value){
        if(value==data){
            return data;
        }

        if(value<data){
            if(leftChild!=null){
                return leftChild.get1(value);
            }
        }else{
            if(rightChild!=null){
                return rightChild.get1(value);
            }
        }

        return -1;
    }

    public void insert(int value){
        if(value==data){
            return;
        }

        if(value<data){
            if(leftChild==null){
                leftChild=new TreeNode(value);
            }else {
                leftChild.insert(value);
            }
        }else{
            if(rightChild==null){
                rightChild=new TreeNode(value);
            }else{
                rightChild.insert(value);
            }
        }
    }

    public void traverseInorder(){
        if(leftChild!=null){
            leftChild.traverseInorder();
        }

        System.out.print(data+" , ");

        if(rightChild!=null){
            rightChild.traverseInorder();
        }
    }

    public void traversalPreOrder(){
        System.out.print(data+" ,");
        if(leftChild!=null){
            leftChild.traversalPreOrder();
        }

        if(rightChild!=null){
            rightChild.traversalPreOrder();
        }
    }
    public void traversalPostOrder(){

        if(leftChild!=null){
            leftChild.traversalPostOrder();
        }

        if(rightChild!=null){
            rightChild.traversalPostOrder();
        }
        System.out.print(data+" ,");
    }

    public void levelOrder(){
        System.out.println(data);


    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    /*public void delete(int value){
        if(data==value){

        }else if(data<value){

        }
     */
    }

