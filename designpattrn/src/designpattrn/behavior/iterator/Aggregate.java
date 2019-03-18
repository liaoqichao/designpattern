package designpattrn.behavior.iterator;

public abstract class Aggregate<E> {

	abstract Iterator<E> createIerator();
}
