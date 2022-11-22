/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bst;

/**
 *
 * @author tiegancozzie
 */
public class BST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinarySearchTree<String,Integer> bst=new BinarySearchTree();
        
     
        String input[]={"V","E","R","Y","E","A","S","Y","Q","U","E","S","T","I","O","N"};
        for (int i=0;i<input.length;i++) { // Making the value of each node
            bst.insert(input[i], (i+1)*5);
        }
        System.out.println("In Order");
        bst.inorder(); // printing in order
        System.out.println("---------------------");
        System.out.println("Level Order");
        bst.printLevelOrder(); // printing in level order
    }
    
}
