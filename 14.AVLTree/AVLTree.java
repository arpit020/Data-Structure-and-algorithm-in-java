public class AVLTree {
    public static void main(String args[]){
        Tree tree=new Tree();
        /* Constructing tree given in the above figure */
        tree.root = tree.insert(tree.root, 9);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 0);
        tree.root = tree.insert(tree.root, 6);
        tree.root = tree.insert(tree.root, 11);
        tree.root = tree.insert(tree.root, -1);
        tree.root = tree.insert(tree.root, 1);
        tree.root = tree.insert(tree.root, 2);
        System.out.println("Preorder traversal" +
                " of constructed tree is : ");
        tree.preOrder(tree.root);

        tree.root = tree.delete(tree.root, 10);
        System.out.println("");
        System.out.println("Preorder traversal after "+
                "deletion of 10 :");
        tree.preOrder(tree.root);
    }
}
class Tree {
    TreeNode root;
    int height(TreeNode N) {
        if (N == null) {
            return 0;
        }
        return N.height;
    }
    int max(int a, int b) {
        return a > b ? a : b;
    }
    int getBalance(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }
    TreeNode rightrotate(TreeNode node) {
        TreeNode rr = node.left;
        TreeNode zz=rr.right;
        rr.right = node;
        node.left=zz;
        node.height = max(height(node.left), height(node.right)) + 1;
        rr.height = max(height(rr.left), height(rr.right)) + 1;
        return rr;
    }
    TreeNode leftrotate(TreeNode node) {
        TreeNode rr = node.right;
        TreeNode zz=rr.left;
        rr.left = node;
        node.right = zz;
        node.height = max(height(node.left), height(node.right)) + 1;
        rr.height = max(height(rr.left), height(rr.right)) + 1;
        return rr;
    }
    TreeNode insert(TreeNode node, int data) {
        //System.out.println(node.data);
        if (node == null) {
            return new TreeNode(data);
        }
        if (node.data > data) {
            node.left = insert(node.left, data);
        } else if (node.data < data) {
            node.right = insert(node.right, data);
        } else {
            return node;
        }
        node.height = 1 + max(height(node.left),
                height(node.right));

        /* 3. Get the balance factor of this ancestor
              node to check whether this node became
              unbalanced */
        int balance = getBalance(node);
        // If this node becomes unbalanced, then there
        // are 4 cases Left Left Case
        if (balance > 1 && data < node.left.data)
            return rightrotate(node);
        // Right Right Case
        if (balance < -1 && data > node.right.data)
            return leftrotate(node);
        // Left Right Case
        if (balance > 1 && data > node.left.data) {
            node.left = leftrotate(node.left);
            return rightrotate(node);
        }
        // Right Left Case
        if (balance < -1 && data < node.right.data) {
            node.right = rightrotate(node.right);
            return leftrotate(node);
        }

        /* return the (unchanged) node pointer */
        return node;

    }
    void preOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    TreeNode minValueNode(TreeNode node)
    {
        TreeNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }
    TreeNode delete(TreeNode node,int num){
        if(node==null){
            return node;
        }
        if(num<node.data){
            node.left=delete(node.left,num);
        }else if(num>node.data){
            node.right=delete(node.right,num);
        }else{
            if(node.left==null){
                return node.right;
            }else if(node.right==null){
                return node.left;
            }else{
                TreeNode x=minValueNode(node.right);
                node.data=x.data;
                node.right=delete(node.right,x.data);
            }
        }
        // If the tree had only one node then return
        if (root == null)
            return root;

        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE
        root.height = max(height(root.left), height(root.right)) + 1;

        // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether
        // this node became unbalanced)
        int balance = getBalance(root);

        // If this node becomes unbalanced, then there are 4 cases
        // Left Left Case
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightrotate(root);

        // Left Right Case
        if (balance > 1 && getBalance(root.left) < 0)
        {
            root.left = leftrotate(root.left);
            return rightrotate(root);
        }

        // Right Right Case
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftrotate(root);

        // Right Left Case
        if (balance < -1 && getBalance(root.right) > 0)
        {
            root.right = rightrotate(root.right);
            return leftrotate(root);
        }
        return root;
    }
}
class TreeNode{
    int data,height;
    TreeNode left;
    TreeNode right;

    TreeNode(int a){
        data=a;
        height=1;
    }
}
