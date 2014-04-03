package es02;

//Si tratta di una classe immutabile che rappresenta un numero complesso per cui 
//poniamo private final tutti gli attributi

public class Complex {
	
	/* parte reale */
	private final double re;
	/* parte immaginaria*/
	private final double im;
	
	// Costruttore di default, costruisce lo zero
	public Complex(){
		//caso particolare del costruttore con due parametri
		this(0.0d, 0.0d);
	}
	
	// Costruttore con due parametri
	public Complex(double re, double im){
		this.re=re;
		this.im=im;
	}
	
	//Static Factory Method, costruisce un nuovo oggetto,
	//utile se voglio avere la possibilità da fuori di usare sia forma polare
	//sia forma complessa
	public static Complex fromPolarForm(double abs, double phase){
		/*z=abs*(cos(phase)+i*sin(phase))*/
		double realPart = abs*Math.cos(phase);
		double imaginaryPart = abs*Math.sin(phase);
		return new Complex(realPart, imaginaryPart);
	}
	
	//Ritorna il modulo
	public double getAbs(){
		return Math.sqrt(Math.pow(this.re, 2.0d)+
			Math.pow(this.im, 2.0d));
		}
	
	//ritorna la fase
	public double getPhase(){
		//TODO
		return 2.0d;
	}
	
	public Complex sum (Complex other){
		return new Complex(this.re + other.re, this.im + other.im);
	}
	
	public Complex diff (Complex other){
		return new Complex(this.re - other.re, this.im - other.im);
	}

	public boolean approximatelyEquals(Complex other, double precision){
		//controlla che la differenza in valore assoluto 
		//tra i due numeri complessi sia minore di precision
		return(this.diff(other).getAbs()<precision);
	}
	
	/*Utili da sovrascrivere  */
	@Override
	public String toString(){
		return "Complex number: (" + re + ", "+ im + ")";
	}
	
	@Override
	public boolean equals(Object other){
		if(other instanceof Complex){ //instanceof: verifica che l'oggetto other sia istanza della nostra classe
			Complex otherComplex = (Complex) other;
			return this.im == otherComplex.im && this.re == otherComplex.re;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode(){ //identifichiamo univocamente un oggetto con un numero
		int hash = 17;
		hash = hash*23+Double.valueOf(re).hashCode();
		hash = hash*23+Double.valueOf(im).hashCode();
		return hash;
	}
	
}
