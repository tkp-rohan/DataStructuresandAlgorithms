package unit14_trees;

import java.util.LinkedList;
import java.util.Queue;

// Level Order Traversal Line by Line
// T.C. Analysis: We are going to traverse n nodes, for every node , it's going to enter into the queue once and come out of the queue once which are both O(1) operations so we do constant work for every node, so T.C. is O(n)
// Time Complexity: O(n)


// Space Complexity: O(n) or O(width)

class Node {
    int key;
    Node left;
    Node right;

    public Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

public class u14p9_levelordertraversallinebyline {

    public static void lineByLineLevelOrderTraversal(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                Node curr = queue.poll();

                System.out.print(curr.key + " ");

                if (curr.left != null) {
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.right = new Node(70);
        root.right.right.right = new Node(80);

        // Debug
        System.out.println("Root = " + root.key);
        System.out.println("Left = " + root.left.key);
        System.out.println("Right = " + root.right.key);

        System.out.println();

        lineByLineLevelOrderTraversal(root);
    }
}