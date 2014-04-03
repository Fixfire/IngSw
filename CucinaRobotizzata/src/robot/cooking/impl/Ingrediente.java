package robot.cooking.impl;

public class Ingrediente {
	private String nome;
	private int quantità;
	
	public Ingrediente(String nome, int quantità){
		this.nome = nome;
		this.quantità = quantità;
	}
	
	public String getNome(){
		return nome;
	}
	
	public int getQuantità(){
		return quantità;
	}
	
	public void setQuantità(int quantità){
		this.quantità = quantità;
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
