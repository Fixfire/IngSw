package robot.cooking.exception;

import robot.cooking.impl.Piatto;

public class CotturaException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2031701677459149856L;
	private Piatto piatto;
	
	public CotturaException(Piatto piatto){
		this.piatto = piatto;
	}
	
	public Piatto getPiatto(){
		return piatto;
	}
}
