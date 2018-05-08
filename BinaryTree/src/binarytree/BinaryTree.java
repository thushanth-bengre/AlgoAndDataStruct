/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Bengre
 */
public class BinaryTree {
    static Node head;
    
    public Node insert(Node node, int d){
        if(node == null)
            return (new Node(d));
        else{
            if(d <= node.d)
                node.left = insert(node.left,d);
            else
                node.right = insert(node.right,d);
            
            return node;
        }
    }
    
    public int minValue(Node node){
        Node current = node;
        
        while(current.left != null){
            current = current.left;
        }
        return current.d;
    }
}
