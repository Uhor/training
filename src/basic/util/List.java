package basic.util;

public interface List<E> {
	public void add(E e);
	public E remove(int index);
	public void remove(E e);
	public int size();
	public boolean isEmpty();
	public int getIndexOf(E e);
}
