package robot.cooking.exception;

import robot.cooking.impl.Ingrediente;

public class Quantit‡MancanteException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3840844061791524922L;
	private Ingrediente ingrediente;
	public final int QUANTITA_ERROR = 1;
	
	public Quantit‡MancanteException(Ingrediente ingrediente){
		this.ingrediente = new Ingrediente(ingrediente.getNome(), ingrediente.getQuantit‡());
	}
	
	public Ingrediente getIngrediente(){
		return ingrediente;
	}
}
