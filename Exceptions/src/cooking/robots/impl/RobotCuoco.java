package cooking.robots.impl;

import java.util.Collection;
import java.util.Random;

public class RobotCuoco extends Robot{
	/**
	 * 
	 * @param ricetta collection di ingredienti da cucinare
	 * @param dispensa collection di ingredienti disponibili
	 * @return piatto cucinato
	 * @throws IngredienteMancanteException quando la dispensa non contiene un ingrediente della ricetta
	 */
	public Piatto cucina(Collection<Ingrediente> ricetta, Collection<Ingrediente> dispensa)  throws IngredienteMancanteException{
		for(Ingrediente ingr : ricetta){
			if(!dispensa.contains(ingr)){
				//non dipende da me, lascio il compito di gestione a chi mi ha chiamato
				throw new IngredienteMancanteException(ingr);
			}
			else{
				//contiene l'ingrediente
				//TODO verifica della quantità
			}
		}
		Piatto piatto = new Piatto(ricetta);
		
		while(!piatto.isCooked()){
			try {
				cuoci(piatto);
			} catch (CotturaException e) {
//				riparaForno(); TODO
			}
		}
		return piatto;
	}
	
	private void cuoci(Piatto piatto) throws CotturaException{
		Random rnd = new Random();
		int cookingResult = rnd.nextInt(3);
		if (cookingResult == 1){
			throw new CotturaException();
		}
		else{
			piatto.setCooked();
		}
	}
}
