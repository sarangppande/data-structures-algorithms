package me.saranpande.dsa.datastructure;

import java.util.ArrayList;

import me.saranpande.dsa.exceptions.StackUnderflowException;

public class Stack<E> {

	private ArrayList<E> stack = new ArrayList<E>();
	private int top = -1;

	public void push(E element) {
		top++;
		stack.add(top, element);
	}

	public E pop() throws StackUnderflowException {
		if (this.isEmpty()) {
			throw new StackUnderflowException();
		}
		top--;
		return stack.get(top + 1);
	}

	public boolean isEmpty() {
		return top < 0 ? true : false;
	}
}
