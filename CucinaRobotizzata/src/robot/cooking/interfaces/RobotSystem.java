package robot.cooking.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import robot.cooking.exception.IngredienteMancanteException;
import robot.cooking.exception.Quantit‡MancanteException;
import robot.cooking.impl.*;


public class RobotSystem {
	public static void main(String[] args){
		RobotCuoco rCuoco = new RobotCuoco();
		RobotSpesa rSpesa = new RobotSpesa();
		RobotAssaggiatore rAssaggiatore = new RobotAssaggiatore();
		
		List<Ingrediente> dispensa = new ArrayList<Ingrediente>();
		dispensa.add(new Ingrediente("Sugo", 2));
		dispensa.add(new Ingrediente("Basilico", 1));
		dispensa.add(new Ingrediente("Sale", 0));
		
		List<Ingrediente> ricetta = new ArrayList<Ingrediente>();
		ricetta.add(new Ingrediente("Sugo", 2));
		ricetta.add(new Ingrediente("Basilico", 1));
		ricetta.add(new Ingrediente("Sale", 1));
		
		stampaIngredienti(dispensa);
		stampaIngredienti(ricetta);
		
		boolean piattoPronto = false;
		while (!piattoPronto){
			Piatto piatto = null;
			try{
				System.out.println(rCuoco.getModello()+": Cucino");
				piatto = rCuoco.cucina(ricetta, dispensa);
			}
			catch (IngredienteMancanteException e){
				rSpesa.spesa(dispensa, e.getIngrediente(),e.NO_INGR);
				System.out.println(rSpesa.getModello()+": Compro "+e.getIngrediente().getNome());
				stampaIngredienti(dispensa);
			}
			catch (Quantit‡MancanteException e){
				rSpesa.spesa(dispensa, e.getIngrediente(),e.QUANTITA_ERROR);
				System.out.println(rSpesa.getModello()+": Compro "+e.getIngrediente().getNome());
				stampaIngredienti(dispensa);
			}
/*			finally{
				System.out.println(rSpesa.getModello()+": Comunque il latte serve sempre");
				rSpesa.spesa(dispensa, new Ingrediente("latte", 1),0);
			}
*/
			piattoPronto = rAssaggiatore.assaggia(piatto);
		}
		System.out.println("Cotto e mangiato");
		stampaIngredienti(dispensa);
	}

	private static void stampaIngredienti(List<Ingrediente> lista) {
		Iterator<Ingrediente> i = lista.iterator();
		while(i.hasNext()){
			Ingrediente in=i.next();
			System.out.println(in.getNome()+in.getQuantit‡()+" ");
		}
	}

}
