package pgdp.pingulib.datastructures.trees;

import java.util.LinkedList;
import java.util.List;

public class BST<T extends Comparable<T>> {

	// TODO note to self: always consider null and empty objects

     private BSTNode<T> root;

     public BST(BSTNode<T> root){
         this.root = root;
    }
    public BST(){
         this.root = null;
    }

    public boolean isEmpty(){
         return root == null;
    }

    public void insert(T value){
         if(value == null){
             return;
         }
         if(isEmpty()){
             root = new BSTNode<T>(value);
             return;
         }
         root.insert(value);
    }
    public int size(){
        if(root == null){
            return 0;
        }
         return root.size();
    }
    public boolean contains(T value){
        if(isEmpty()){
            return false;
        }
         return root.contains(value);
    }
    public List<T> toList(){
        if(isEmpty()){
            return new LinkedList<T>();
        }
         return root.toList(Order.IN);
     }

     public String toString(){
         if(isEmpty()){
             return "[]";
         }
         return root.toString();
     }


    public BSTNode<T> getRoot() {
        return root;
    }
}
