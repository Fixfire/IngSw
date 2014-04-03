package es02;

public class BikeClient {
	public static void main(String[] args){
		//creiamo una bicicletta
		Bike b1 = new Bike(15,2);
		Bike b2 = new Bike();
		//modifichiamo lo stato di b1
		b1.incrementGear();
		System.out.println("La velocità di b1 è "+b1.getSpeed());
		b1.changeCadence(10);
		System.out.println("La velocità di b1 è "+b1.getSpeed());
		b1.incrementGear();
		System.out.println("La velocità di b1 è "+b1.getSpeed());
		b1.brake();
		System.out.println("La velocità di b1 è "+b1.getSpeed());
		
		b2.incrementGear();
		b2.changeCadence(5);
		System.out.println("La velocità di b2 è "+b2.getSpeed());
		
		System.out.println("b1 e b2 sono uguali? "+b1.equals(b2));
	}
}
