package cooking.robots.impl;

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
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Ingrediente){ //se � null ritorna automaticamente false
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
