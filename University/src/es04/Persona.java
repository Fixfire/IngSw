package es04;

import java.util.Date;

public class Persona {
	private final String nome;
	private final Date birthday;
	
	public Persona(String nome,Date birthday){
		this.nome = nome; //String è immutabile
		this.birthday = new Date(birthday.getTime()); 
								//siccome Date non è immutabile devo creare un nuovo oggetto in modo da disaccoppiare
								//l'oggetto come parametro dall'attributo interno
	}
	
	public String getNome(){
		return nome;
	}
	
	public Date getBirthday(){
		return new Date(birthday.getTime()); //Come prima per non renderlo mutabile
	}
	
	@Override
	public String toString(){
		return "nome: " + nome + " data di nascita: " + birthday;
	}
}
