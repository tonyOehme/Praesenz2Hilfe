package pgdp.pingulib.datastructures.trees;

public class BSTNode<T extends Comparable<T>> extends BinaryNode<T> {

    public BSTNode(T value, BSTNode<T> left, BSTNode<T> right) {
        super(value, left, right);
    }

    public BSTNode(T value) {
        super(value, null, null);
    }

    public boolean contains(T value) {
        if (getValue().equals(value)) {
            return true;
        } else if (value.compareTo(getValue()) < 0) {
            if (getLeft() == null) {
                return false;
            } else {
                return ((BSTNode<T>) getLeft()).contains(value);
            }
        } else {
            if (getRight() == null) {
                return false;
            } else {
                return ((BSTNode<T>) getRight()).contains(value);
            }
        }
    }

    public void insert(T value) {
        if (getValue().equals(value)) {
            return;
        } else if (value.compareTo(getValue()) < 0) {
            if (getLeft() == null) {
                setLeft(new BSTNode<T>(value));
            } else {
                ((BSTNode<T>) getLeft()).insert(value);
            }
        } else {
            if (getRight() == null) {
                setRight(new BSTNode<T>(value));
            } else {
                ((BSTNode<T>) getRight()).insert(value);
            }
        }
    }

}