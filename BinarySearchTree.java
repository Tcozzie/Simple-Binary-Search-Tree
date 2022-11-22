/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bst;

//code was taken from 
//https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/

class BinarySearchTree<Key extends Comparable<Key>,Value> {
 


    class Node {
        Key key;
        Value val;
        Node left, right;
 
        public Node(Key item, Value value)
        {
            key = item;
            val=value;
            left = right = null; // initializing left and right legs
        }
    }
 
    Node root; // consructor for the root of the BST
 
    BinarySearchTree() { root = null; } // constuctor for BinarySearchTree
 
    BinarySearchTree(Key key, Value value) { root = new Node(key,value); } // making the root node for the BST
 
    void insert(Key key,Value value) { root = insertRec(root, key, value); }     // This method calls insertRec()

    
    Node insertRec(Node root, Key key, Value value) //recursive methos to insert a new key into te BST
    {

        if (root == null) {
            root = new Node(key,value); // if the tree is fully empty, this will make the first node
            return root;
        }else if(key.compareTo(root.key)==0){ // if the key's equal eachother, this will update with the new value
            root.val=value; // updates value
        }else if (key.compareTo(root.key)<0) // if the key is less then the root key, will go down the left side of the subtree
            root.left = insertRec(root.left, key, value); // recall insertRec
        else if (key.compareTo(root.key)>0) // if the key is greater then the root key, will go down the right side of the subtree
            root.right = insertRec(root.right, key, value); //recall insertRec
 
        return root; //returns the node pointer
    }
    
 
    void inorder() { inorderRec(root); } // This method calls InorderRec()

    void inorderRec(Node root){ // print out the BST in order traversal
        if (root != null) {  // making sure there is a node in current position
            inorderRec(root.left); // going down the left side of the BST
            System.out.println(root.key+"="+root.val); // printing the farthest left node 
            inorderRec(root.right); // goes down the right side of the BST if the left side is gone
        }
    }
    

    int height(Node root) // finds the height of the BST 
    {
        if (root == null) // checking to see if there is a node within the BST
            return 0;
        else {
            int lheight = height(root.left); // finding the height of the left subtree's
            int rheight = height(root.right); // finding the height of the right subtree's
 
            if (lheight > rheight) // sees which subtree is longer
                return (lheight + 1); // adding one for the root node
            else
                return (rheight + 1); // adding one for the root node
        }
    }
 

    void printGivenLevel(Node root, int level) // prints nodes at a given level
    {
        if (root == null) // checks to see if there are nodes in the current position
            return;
        if (level == 1) { // prints nodes at the first level
            System.out.print(root.key + " ");
        }
        else if (level > 1) { // any level bigger then 1
            printGivenLevel(root.left, level - 1); // calls itself to go down the left subtree
            printGivenLevel(root.right, level - 1); // then calls itself to go down the right subtree
        }
    }
 
    void printLevelOrder() // prints level order of BST
    {
        int h = height(root); // finds the height of BST
        int i;
        for (i = 1; i <= h; i++) { // iterating through the tree
            printGivenLevel(root, i); // prints all nodes within each level
            System.out.print(System.lineSeparator()); // printing format
        }
    }
    
}
