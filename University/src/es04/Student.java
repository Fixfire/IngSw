package es04;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends Persona{
//	private final ArrayList<Grade> grades; //Collection generic (vincolo l'implementazione della lista in Array)
	private final List<Grade> grades; //non vincolo a priori il tipo di lista.
	
	public Student(String nome, Date birthday){
		super(nome, birthday);
		this.grades = new ArrayList<Grade>(); //lista vuota
	}
	
	@Override
	public String toString(){
		return super.toString() + " e sono anche uno studente"; //amplio riutilizzando un metodo della superclasse
	}
	
	public void addGrade(Grade g){
		grades.add(g);
	}
	
	public boolean isCreditSufficient(){
		int credits = 0;
		for (Grade g : grades){
			credits += g.getCredits();
		}
		return credits >= 180;
	}
}
