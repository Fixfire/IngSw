package robot.cooking.impl;

import java.util.Random;

public class RobotAssaggiatore extends Robot {
	private  static final String MODELLO = "Assaggiatore";

	public boolean assaggia(Piatto p){
		if(p != null){
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex){
				return false;
			}
			return tiPiace(p);
		}
		else {
			return false;
		}
	}
	
	public boolean tiPiace(Piatto p){
		return new Random().nextBoolean();
	}
	
	@Override
	public String getModello() {
		return MODELLO;
	}
}
