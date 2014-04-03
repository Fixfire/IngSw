package es06;

import java.util.Collection;

public interface MyStack <E> { //elemento generico
	public E pop(); //Rimuove l'elemento di tipo E dalla pila
	
	public void push(E elem); //Inserisce un elemento E in testa alla pila
	
	public boolean isEmpty();
	
	public int size();
	
	public boolean contains(E el);
	
	public boolean containsAll(Collection<? extends E> collection); //Data una collection o un suo sottotipo(? extends..) dire se contiene tutti questi elementi
	
	//Factory methods -> metodi statici non ci possono essere nelle interfacce (Java7)

}
