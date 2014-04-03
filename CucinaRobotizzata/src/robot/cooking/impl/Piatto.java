package robot.cooking.impl;

import java.util.Collection;

public class Piatto {
	private Collection<Ingrediente> ingredienti;
	private boolean cooked;
	
	public Piatto(Collection<Ingrediente> ricetta){
		ingredienti = ricetta;
	}
	
	public boolean isCooked(){
		return cooked;
	}
	
	public void setCooked(){
		cooked = true;
	}
	
	public Collection<Ingrediente> getIngredienti(){
		return ingredienti;
	}
}
