package es06;

import java.util.Collection;

public class LinkedListStack<E> implements MyStack<E> {
	private int N; //Numero di elementi nella lista
	private Node<E> head; //Riferimento alla testa della lista
	
	public LinkedListStack(){
		head = null;
		N = 0;
	}
	
	@Override
	public E pop() {
		if(isEmpty())
			return null;
		Node<E> node = head;
		E element = node.element;
		head = head.next;
		N--;
		return element;
	}

	@Override
	public void push(E elem) {
		Node<E> oldHead = head;
		head = new Node<E>();
		head.element = elem;
		head.next = oldHead;
		N++;
	}

	@Override
	public boolean isEmpty() {
		return N == 0;
	}

	@Override
	public int size() {
		return N;
	}

	@Override
	public boolean contains(E elem) {
		Node<E> tmp = head;
		while(tmp != null){
			if (tmp.element.equals(elem))
				return true;
			tmp = tmp.next;
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<? extends E> collection) {
		for (E el : collection){
			if (!contains(el))
				return false;
		}
		return true;
	}
	
	//Static factory methods
	
	public static <E> MyStack<E> createStackFromArray(E[] arr){ //Program to interface
		MyStack<E> stack = new LinkedListStack<>();
		for(E el : arr)
			stack.push(el);
		return stack;
	}
	
}
