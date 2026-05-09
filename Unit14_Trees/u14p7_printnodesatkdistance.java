package unit14_trees;

// Print all nodes that are at a distance k from the root node of the binary tree.
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

public class u14p7_printnodesatkdistance {
    

    public static void printNodesAtKDistance(Node root, int k){
        if(root==null){
            return;
        }

        if(k==0){
            System.out.print(root.key+" ");
        }else{
            printNodesAtKDistance(root.left, k-1);
            printNodesAtKDistance(root.right, k-1);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        
        root.right = new Node(30);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);

        int k = 2;

        printNodesAtKDistance(root, k);
    }
}
