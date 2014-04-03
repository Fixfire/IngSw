package robot.cooking.impl;

import java.util.Collection;
import java.util.Iterator;

public class RobotSpesa extends Robot{
	private  static final String MODELLO = "Spesa";
	
	public void spesa(Collection<Ingrediente> dispensa, Ingrediente ingrMancante,int azione){
		switch(azione){
			case 0: {
				dispensa.add(ingrMancante);
				break;
			}
			case 1: {
				Iterator<Ingrediente> i = dispensa.iterator();
				while(i.hasNext()){
					Ingrediente in = i.next();
					if(in.equals(ingrMancante)){
						in.setQuantità(in.getQuantità()+1);
					}
				}
				break;
			}
		}
		
	}

	@Override
	public String getModello() {
		return MODELLO;
	}
}
