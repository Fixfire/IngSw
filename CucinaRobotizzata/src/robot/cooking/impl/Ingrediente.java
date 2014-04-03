package robot.cooking.impl;

public class Ingrediente {
	private String nome;
	private int quantit�;
	
	public Ingrediente(String nome, int quantit�){
		this.nome = nome;
		this.quantit� = quantit�;
	}
	
	public String getNome(){
		return nome;
	}
	
	public int getQuantit�(){
		return quantit�;
	}
	
	public void setQuantit�(int quantit�){
		this.quantit� = quantit�;
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Ingrediente){
			Ingrediente other = (Ingrediente) o;
			return this.nome == other.nome;
		}
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode(){
		return nome.hashCode();
	}

}
