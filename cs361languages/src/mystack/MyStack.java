/**
 * 
 */
package mystack;

/**
 * @author ADD YOUR NAME 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
	if(theStack==null){
		return null;
	}else{
		MyNode<T> curser = theStack;
		while(curser.next != null){
			curser = curser.next;
		}
		return curser.val

	}

	public void push(T v) {
		MyNode<T> node = new MyNode<>(v, null);
		if (theStack == null){
			theStack = node;
		}else{
			MyNode<T> curser = theStack;
			while(cursor.next != null){
				cursor = curser.next;
			}
			curser.next = newNode;

		}

	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> integerStack = new MyStack<Integer>();
		integerStack.push(1);
		integerStack.push(2);
		integerStack.pop();
		integerStack.push(5);

		Person p1 = new Person();
		Person P2 = new Person();
		p1.setFname("Kyle");
		p1.setLname("Kyle");
		p2.setFname("Christelle");
		p2.setLname("Scharff");
		MyStack<Person> personStack = new MyStack<Person>();
		personStack.push(p1);
		personStack.push(p2);
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
	}

}
