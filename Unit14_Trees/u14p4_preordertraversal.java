package Unit14_Trees;


// T.C. = O(n)
// A.S. = O(h)

class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
}

public class u14p4_preordertraversal {
    
    public static void preorderTraversal(Node root){
        if(root!=null){
            System.out.print(root.key+" ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        preorderTraversal(root);
    }
}
