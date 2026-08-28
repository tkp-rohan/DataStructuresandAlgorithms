package unit14_trees;

import java.util.LinkedList;
import java.util.Queue;


// T.C = O(n)
// A.S. = O(w), w = width of binary tree

class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
}

public class u14p8_levelordertraversal {
    
    public static void printNodeAtLevel(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<Node>();

        q.add(root);

        while(q.isEmpty()==false){
            Node curr = q.poll();
            System.out.print(curr.key+ " ");

            if(curr.left != null){
                q.add(curr.left);
            }

            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }

}
