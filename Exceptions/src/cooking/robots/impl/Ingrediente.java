package cooking.robots.impl;

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
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Ingrediente){ //se è null ritorna automaticamente false
			Ingrediente other = (Ingrediente) o;
			return nome.equals(other.nome);
		}
		return false;
	}
	
	@Override
	public int hashCode(){ //Ogni volta che sovrascrivo equals
		return nome.hashCode();
	}
}
