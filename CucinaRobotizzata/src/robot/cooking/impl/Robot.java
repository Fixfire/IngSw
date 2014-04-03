package robot.cooking.impl;

public abstract class Robot {
	private String marca;
	private int numSerie;
	
	public String getMarca(){
		return marca;
	}
	
	public abstract String getModello();
	
	public int getNumSerie(){
		return numSerie;
	}

}
