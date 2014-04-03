package es02;

public class Bike {
	//definiamo delle costanti (attributi di classe)
	private static final int MAX_GEAR = 18;
	private static final int MIN_GEAR = 1;
	
	//attributi della classe
	private int gear = 1;
	private int cadence; //non inizializzato-> default 0
	private int speed;
	//es 2.2
	private int id;
	private static int idCounter;
	
	//metodo costruttore
	public Bike(int cadence,int gear){
		this(); //incapsulamento -> eredita anche le funzionalità del costruttore Bike();
		this.gear = gear;
		this.cadence = cadence;
		updateSpeed();
	}
	
	public Bike(){
		id = idCounter++;
	}
	
	//metodi osservatori
	public int getGear(){
		return gear;
	}
	
	public int getCadence(){
		return cadence;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	//metodi accessori
	public void changeCadence(int cadence){
		this.cadence = cadence;
		updateSpeed();
	}
	
	public void incrementGear(){
		if(gear<MAX_GEAR){
			gear++;
			updateSpeed();
		}
	}
	
	public void decrementGear(){
		if(gear>MIN_GEAR){
			gear--;
			updateSpeed();
		}
	}
	
	private void updateSpeed(){
		speed = gear * cadence;
	}
	
	public void brake(){
		speed = 0;
	}
	
	@Override //giusto perchè equals accetta argomenti di tipo Object
	public boolean equals(Object o){
		Bike other = (Bike) o; //casting;
		return this.id == other.id;
	}
}
