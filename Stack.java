/* Author: Liam Erickson
 * File: Stack.java
 * Date: May 28, 2020
 * Class: CS258 - Lab 6 Part 1
 */

public class Stack<T> {

	private Node top = null; // top of stack
	private int n = 0;

	class Node {
		T value;
		Node next;
	}

	public void push(T value) {
		Node temp = new Node();
		temp.value = value;
		temp.next = top;
		top = temp;
		n++;
	}

	public T pop() {
		Node temp = top;
		top = temp.next;
		n--;
		return temp.value;
	}

	public T peek() {
		return top.value;
	}

	public int count() {
		return n;
	}

	public boolean isEmpty() {
		return (top == null);
	}

	// NOT NECCESSARY FOR LAB, ADDED FOR VISUALIZATION
	public String toString() {
		String s = "" + top.value;
		Node current = top.next;
		while (current != null) {
			s += ", " + current.value;
			current = current.next;
		}
		return s;
	}
	//NOT NECCESSARY FOR LAB, ADDED FOR TESTING PURPOSES
	public static void main (String [] args) {
		 Stack nStack = new Stack(); 
		 nStack.push(2);
		 nStack.push(3);
		 System.out.println(nStack.peek());
		 nStack.pop();
		 System.out.println(nStack.toString());
	}
}