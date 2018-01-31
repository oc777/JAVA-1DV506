/**
 * 
 */
package oc222ba_assign4.stack;

import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * @author olgachristensen
 *
 */
public class ArrayStackMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayStack colors = new ArrayStack(5);
		
		
		System.out.println("Stack size: " + colors.size());
		System.out.println("Stack is empty: " + colors.isEmpty());

		
		colors.push("black");
		System.out.println("Stack is empty: " + colors.isEmpty());
		colors.push("yellow");
		colors.push("white");
		colors.push("green");
		colors.push("pink");
		colors.push("blue");
		
		System.out.println("Stack size: " + colors.size());
		
		System.out.println("Iterator:");
		Iterator print1 = colors.iterator();
		while(print1.hasNext()) {
			String color = (String) print1.next();
			System.out.println(color);
		}
		
		try {
			System.out.println("On top: " + colors.peek());
		}
		catch (EmptyStackException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			colors.pop();
		}
		catch (EmptyStackException e) {
			System.out.println("Error! The stack is empty!");
		}
		
		System.out.println("Stack size: " + colors.size());

		System.out.println("Stack is empty: " + colors.isEmpty());

	}

}
