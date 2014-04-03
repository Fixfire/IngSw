package cooking.robots.impl;

public class IngredienteMancanteException extends Exception {
	private Ingrediente ingredienteMancante;
	
	public IngredienteMancanteException(Ingrediente ingr){
		this.ingredienteMancante = ingr;
	}
	
	public Ingrediente getIngredienteMancante(){
		return ingredienteMancante;
	}
}
