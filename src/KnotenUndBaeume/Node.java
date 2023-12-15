package KnotenUndBaeume;
import java.util.List;

public abstract class Node<T> {

	private T value;
	private Node<T>[] children;

	@SafeVarargs
	public Node(T value, Node<T>... nodes) {
		this.value = value;
		children = nodes;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	// you will need this method for a bonus-exercise in week 10
	//	public Node<T>[] getChildren() {
	//		return children;
	//	}

	public Node<T> getChild(int i) {
		// TODO
		//check out of bounds
		if (i < 0|| i >= children.length){
			return null;
		}

		//return child
		return children[i];
	}

	public void setChild(int i, Node<T> c) {
		// TODO
		//check out of bounds
		if (i < 0|| i >= children.length){
			return;
		}
		//set child to c
		children[i] = c;

	}

	public boolean isLeaf() {
		// TODO

		//check if every child is null
		for(Node<T> child: children){
			if(child != null){
				return false;
			}
		}
		return true;
	}

	public int height() {
		// TODO
		//return greatest depth of children + 1(self) recursively
		if(isLeaf()){
			return 1;
		}

		int depth = 0;
		for(Node<T> child: children){
			depth = child.height();
		}
		return depth + 1 ;
	}

	public int size() {
		// TODO
		//base case isleaf
		if(isLeaf()){
			return 1;
		}
		//not base case -> return sum of size of children + 1(self)

		int size = 0;
		for(Node<T> child: children){
			if(child!=null){
				size += child.size();
			}
		}

		return size + 1;
	}

	public abstract List<T> toList(Order order);
}
