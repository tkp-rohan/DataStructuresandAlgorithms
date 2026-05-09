package unit14_trees;

// Tree data structure is used to represent hierarchy.
// Tree is a non linear data structure.
// Root Node, Intermediate node, Leaf node, Parent Node, Child node
// Tree is recursive in nature
// Subtrees
// Ancestors: Parents of that node
// Descendants: Children of that node or all the nodes that have root node as the given node are descendants of that given node
// Degree of a node : the number of children a node has is known as its degree
// Internal nodes: non leaf nodes



// Applications of Trees:
// 1.)To represent hierarchical data:
//      i.)Organization Structure
//      ii.)Folder Structure
//      iii.)XML/HTML Content(JSON Objects)
//      iv.)In OOP(Inheritance)

// 2.)Binary Search Trees
// 3.) Binary Heap
// 4.)In B and B+ Trees in DBMS for indexing
// 5.)Spanning Trees. Bridges use spanning trees to forward the packets.
// 6.)Shortest path tree in computer networks. Routers use shortest path tree. Every router considers itself as a root of this tree and finds the shortest path to every other node and builds a shortest path tree.
// 7.)Parse Tree, Expression Tree in Compiler to parse the source code
// 8.)Trie data structure : Used to represent dictionaries. It also supports operations like prefix search.
// 9.)Suffix Tree: Used to do fast searches in a string. Pattern Searches
// 10.)Binary Index Tree: Used for ranged query searches. Faster for a limited set of operations.
// 11.)Segment Tree: Used for ranged query searches.It is more powerful than binary indexed tree.


// Binary Tree: Tree with atmost 2 children. So degree of a node can be 0,1 or 2 i.e. a node can have no child, one child or two children.

// Every node has 3 fields: pointer/reference to the left subtree, key or data, pointer/reference to the right subtree

class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
}

public class u14p1_intrototrees {

    public static void main(String[] args) {


        // To represent Empty tree do it as follows
        // Node root = null; 


        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
    }
    
}
