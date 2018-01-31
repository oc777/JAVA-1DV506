/**
 * 
 */
package oc222ba_assign4.stack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * @author olgachristensen
 *
 */
public class ArrayStack implements Stack{
	private int top = -1;
	private Object [] data;
	
	public ArrayStack(int size) {
		data = new Object[size];
	}
	
	
	public int size() {
		return top+1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public void push(Object element) {
		if (top == data.length-1) {
			resize();
		}
		
		top++;
		data[top] = element;
		System.out.println("Added to stack: " + element);	//test
	}
	
	public Object pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		else
			return data[top--];
	}
	
	public Object peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		else
			return data[top];
	}
	
	public Iterator<Object> iterator() {
		return new DataIterator();
	};
	
	public class DataIterator implements Iterator<Object> {
		int i = top;
		
		public boolean hasNext() {
			return (i > -1);
		}
		
		public Object next() {
			return data[i--];
		}
	}
	
	private void resize() {
		int size = data.length*2;
		data = Arrays.copyOf(data, size);
		System.out.println("New stack capacity: " + size);	//test
	}
	
}
