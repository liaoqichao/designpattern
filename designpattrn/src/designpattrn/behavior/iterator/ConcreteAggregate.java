package designpattrn.behavior.iterator;

public class ConcreteAggregate<E> extends Aggregate<E> {

	private E[] arr;
	
	public ConcreteAggregate(E[] arr) {
		super();
		this.arr = arr;
	}

	@Override
	Iterator<E> createIerator() {
		return new ConcreteExtrinsicIterator<E>(this);
	}

	public E getElement(int index){ 
		return arr[index];
	}
	
	public int size(){ 
		return arr.length;
	}
}
