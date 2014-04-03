package robot.cooking.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

import robot.cooking.exception.*;

public class RobotCuoco extends Robot {
	private  static final String MODELLO = "Cuoco";
	
	public Piatto cucina (Collection<Ingrediente> ricetta, Collection<Ingrediente> dispensa) throws IngredienteMancanteException, Quantit‡MancanteException{
		for (Ingrediente ingr : ricetta){
			if(!dispensa.contains(ingr)){ //Ingrediente mancante
				throw new IngredienteMancanteException(ingr);
			}
			else{ //Ingrediente presente in quantit‡ minore
				Iterator<Ingrediente> i = dispensa.iterator();
				while(i.hasNext()){
					Ingrediente in = i.next();
					if(in.equals(ingr)){
						if(!(in.getQuantit‡() == ingr.getQuantit‡()))
							throw new Quantit‡MancanteException(ingr);
						break;
					}
				}
			}
		}
		Piatto piatto = new Piatto(ricetta);
		
		while(!piatto.isCooked()){
			try {
				cuoci(piatto);
				aggiornaDispensa(dispensa,ricetta);
			} catch (CotturaException e) {
				riparaForno(e.getPiatto());
			}
		}
		
		return piatto;
	}
	
	private void cuoci(Piatto p) throws CotturaException{
		Random rnd = new Random();
		int cookingResult = rnd.nextInt(3);
		if (cookingResult == 1){
			throw new CotturaException(p);
		}
		else {
			p.setCooked();
		}
	}
	
	private void aggiornaDispensa(Collection<Ingrediente> dispensa, Collection<Ingrediente> ricetta) {
		Iterator<Ingrediente> i = ricetta.iterator();
		while(i.hasNext()){
			Ingrediente in = i.next();
			Iterator<Ingrediente> j = dispensa.iterator();
			while(j.hasNext()){
				Ingrediente inDisp = j.next();
				if(in.equals(inDisp))
					inDisp.setQuantit‡(inDisp.getQuantit‡()-in.getQuantit‡());
			}
		}
		
	}
	
	private void riparaForno(Piatto p) {
		p.setCooked();
		System.out.println(MODELLO+": Riparo forno");
	}

	@Override
	public String getModello() {
		return MODELLO;
	}
}
