package designpattrn.behavior.iterator;

public class ConcreteExtrinsicIterator<E> implements Iterator<E> {

	private ConcreteAggregate<E> agg;
	
	private int size;
	
	private int index;
	
	public ConcreteExtrinsicIterator(ConcreteAggregate<E> agg) {
		super();
		this.agg = agg;
		this.size = agg.size();
	}

	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if(index < size)
			index++;
	}

	@Override
	public boolean isDone() {
		return index >= size;
	}

	@Override
	public E currentItem() {
		return agg.getElement(index);
	}

}
