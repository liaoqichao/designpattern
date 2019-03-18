package designpattrn.behavior.iterator;

public class ConcreteBlackAggregate<E> extends Aggregate<E> {

	private E[] arr;
	
	public ConcreteBlackAggregate(E[] arr) {
		super();
		this.arr = arr;
	}

	@Override
	Iterator<E> createIerator() {
		return new ConcreteIntrinsicInterator();
	}

	// 这里不需要再加泛型ConcreteIntrinsicInterator<E>
	private class ConcreteIntrinsicInterator implements Iterator<E> {

		private int index;
		
		private int size;
		
		public ConcreteIntrinsicInterator() {
			super();
			index = 0;
			size = arr.length;
		}

		@Override
		public void first() {
			index = 0;
		}

		@Override
		public void next() {
			if(index < size){
				index++;
			}
		}

		@Override
		public boolean isDone() {
			return index >= size;
		}

		@Override
		public E currentItem() {
			return arr[index];
		} 
		
	}
}
