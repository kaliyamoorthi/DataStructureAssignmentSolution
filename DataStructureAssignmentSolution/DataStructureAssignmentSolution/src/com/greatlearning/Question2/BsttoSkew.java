package com.greatlearning.Question2;

public class BsttoSkew {		
    Node root;
    static Node newroot;
    static Node curr;
    public static class Node {
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
   
    
    public void BsttoSkew( Node root) {
        if(root==null){
            return ;
        }
        BsttoSkew(root.left);
        if(curr==null){
            curr =root;
            newroot = root;
        }
        else{
            curr.right=root;
            curr.left=null;
            curr=curr.right;
        }
        BsttoSkew(root.right);
    }
    public static void main(String[] args) {
    	
        //The input tree is assumed to be a valid binary search tree
    	BsttoSkew tree = new BsttoSkew ();
        tree.root =new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(10);
        tree.root.right.left = new Node(55);
       
        /*System.out.println("Inorder traversal for given tree:");
        tree.inorderTraversal(tree.root);*/
        
        curr=null;
        tree.BsttoSkew(tree.root);
        tree.root = newroot;
       System.out.println("Skewed Tree:");
        while(newroot!=null){
            System.out.print(newroot.data+" ");
            newroot=newroot.right;
        }
    }
}





