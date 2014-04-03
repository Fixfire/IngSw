package robot.cooking.exception;

import robot.cooking.impl.Ingrediente;

public class IngredienteMancanteException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6503171383145946786L;
	private Ingrediente ingrediente;
	public final int NO_INGR = 0;
	
	public IngredienteMancanteException(Ingrediente ingrediente){
		this.ingrediente = new Ingrediente(ingrediente.getNome(), ingrediente.getQuantità());
	}
	
	public Ingrediente getIngrediente(){
		return ingrediente;
	}
}
