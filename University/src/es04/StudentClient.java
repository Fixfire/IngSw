package es04;

import java.util.Calendar;
import java.util.Date;

public class StudentClient {
	
	public static void main(String[] args){
		Date d1 = new Date(85,10,01); 
		Persona pers1 = new Persona("pluto", d1); //Deprecato -> vedere come si usa Calendar
		System.out.println(pers1); //automaticamente cerca il metodo toString
		
//		d1.setDate(Calendar.DECEMBER); //ho modificato un attributo costante senza volerlo -> Correggo in Persona
//		
//		System.out.println(pers1);
//		Date d2 = pers1.getBirthday();
//		d2.setDate(Calendar.DECEMBER);
//		System.out.println(pers1); //ho modificato ancora un oggetto final -> Correggo in Persona
	
		Student s1 = new Student("pippo", new Date(57,4,13));
		System.out.println(s1);
		
		Persona s2 = new Student("topolino", new Date(30,1,12)); //Non cambia nulla, tipo dinamico è Student tipo statico Persona
		//Cercare il più possibile di mettere come tipi quello più astratto (super) possibile
		System.out.println(s2);
		
//		s2.isCreditSufficient(); //non la posso fare perchè è un tipo più astratto staticamente, non so se diventerà Student
		if(s2 instanceof Student){
			Student s3 = (Student) s2; //casting di s2 (Persona) in Student
			s3.isCreditSufficient();
		}
	}
}
