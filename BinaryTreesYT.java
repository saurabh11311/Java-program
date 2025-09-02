/* public class BinaryTreesYT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class  BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void main (String[] args){
        int node[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println(root.data);
    }
}
 */
// Binary Tree using Preorder Traversal
// Time Complexity : O(n) where n is the number of nodes in the binary tree
// Space Complexity : O(h) where h is the height of the binary tree

/* public class BinaryTreesYT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class  BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preorder(Node root){
        if(root == null){                               // Base Case
             
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main (String[] args){
        int node[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        preorder(root);
       
    }
} */

// Binary Tree using Inorder Traversal
// Time Complexity : O(n) where n is the number of nodes in the binary tree
// Space Complexity : O(h) where h is the height of the binary tree

/* public class BinaryTreesYT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class  BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void inorder(Node root){
        if(root == null){                               // Base Case
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main (String[] args){
        int node[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        inorder(root);
       
    }
} */


// Binary Tree using Postorder Traversal
// Time Complexity : O(n) where n is the number of nodes in the binary tree 
// Space Complexity : O(h) where h is the height of the binary tree
/* public class BinaryTreesYT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class  BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void postorder(Node root){
        if(root == null){                               // Base Case
            return;
        }
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main (String[] args){
        int node[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        postorder(root);
       
    }
} */

// Level Order Traversal of Binary Tree
// Time Complexity : O(n) where n is the number of nodes in the binary tree 
// Space Complexity : O(w) where w is the maximum width of the binary tree
import java.util.*;
public class BinaryTreesYT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class  BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    //Q. Count of Nodes in a Binary Tree
    //Time Complexity : O(n) where n is the number of nodes in the binary tree
    //Space Complexity : O(h) where h is the height of the binary tree
    public static int countofNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = countofNodes(root.left);
        int rightCount = countofNodes(root.right);

        return leftCount + rightCount + 1;
    }

    // Q. Sum of all Nodes in a Binary Tree
    //Time Complexity : O(n) where n is the number of nodes in the binary tree  
    //Space Complexity : O(h) where h is the height of the binary tree

    public static int sumofNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sumofNodes(root.left);
        int rightsum = sumofNodes(root.right);
        return leftsum + rightsum + root.data;
    }

    // Q. Height of a Binary Tree
    //Time Complexity : O(n) where n is the number of nodes in the binary tree  
    //Space Complexity : O(h) where h is the height of the binary tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
       int myHeight = Math.max(leftHeight, rightHeight) + 1;
       return myHeight;
    }

    // Q. Diameter of a Binary Tree
    //Time Complexity : O(n^2) where n is the number of nodes in the
    //Space Complexity : O(h) where h is the height of the binary tree

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;
        return Math.max(diam3, Math.max(diam1, diam2));
       
    }

    //Approach 2 for Diameter of a Binary Tree
    
static class TreeInfo{
        int diam;
        int ht;

        TreeInfo(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(diam3, Math.max(diam1, diam2));
        TreeInfo myInfo = new TreeInfo(myDiam, myHeight);
        return myInfo;
    }
    public static void main (String[] args){
        int node[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        
        System.out.println(diameter2(root).diam);
       
    }
}

