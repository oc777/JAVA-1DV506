/**
 * 
 */
package oc222ba_assign4.stack;

import java.util.Iterator;

/**
 * @author olgachristensen
 *
 */
public interface Stack {
	// Current stack size
	int size(); 					
	// true if stack is empty
	boolean isEmpty(); 				
	// Add element at top of stack
	void push(Object element); 		
	// Return and remove top element, exception if stack is empty
	Object pop(); 					
	// Return (without removing) top element, exception if stack is empty.
	Object peek(); 					
	// Element iterator
	Iterator<Object> iterator(); 	

}
