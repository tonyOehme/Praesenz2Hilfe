package pgdp.pingulib.datastructures.trees;

import java.util.LinkedList;
import java.util.List;

public class BinaryNode<T> extends Node<T> {

	public BinaryNode(T value, BinaryNode<T> left, BinaryNode<T> right) {
		super(value, left, right);
	}

	public BinaryNode(T value) {
		super(value, null, null);
	}

	public BinaryNode<T> getLeft() {
		return (BinaryNode<T>) getChild(0);
	}

	public BinaryNode<T> getRight() {
		return (BinaryNode<T>) getChild(1);
	}

	public void setLeft(BinaryNode<T> left) {
		setChild(0, left);
	}

	public void setRight(BinaryNode<T> right) {
		setChild(1, right);
	}

	public List<T> toList(Order order) {
		List<T> list = new LinkedList<>();
		List<T> left = new LinkedList<>();
		List<T> right = new LinkedList<>();
		if (getLeft() != null) {
			left = getLeft().toList(order);
		}
		if (getRight() != null) {
			right = getRight().toList(order);
		}
		switch (order) {
			case IN:
				list.addAll(left);
				list.add(getValue());
				list.addAll(right);
				break;
			case POST:
				list.addAll(left);
				list.addAll(right);
				list.add(getValue());
				break;
			case PRE:
				list.add(getValue());
				list.addAll(left);
				list.addAll(right);
				break;
			default:
				break;
		}
		return list;
	}


	public String toString(Order order){
		if(isLeaf()){
			return "[" + getValue().toString() + "]";
		}
		String left = "-";
		String right = "-";
		if(getLeft() != null){
			left = getLeft().toString(order);
		}
		if(getRight() != null){
			right = getRight().toString(order);
		}

		switch (order){
			case IN -> {return "["+ left + ", " + getValue() + ", " +  right +"]";}
			case PRE -> {return "["+ getValue() + ", "+ left  + ", "+  right +"]";}
			case POST -> {return "["+ left + ", "  +  right + ", " + getValue() + "]";}
			default -> {return "SOMETHING WENT WRONG!";}
		}
	}

	@Override
	public String toString() {
		return toString(Order.IN);
	}
}