import java.util.Scanner;

public class es1 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome");
		String hi="Ciao ";
		String name = sc.nextLine();
		String welcomeMessage=", benvenuto al corso di Ingegneria del Software!";
		System.out.println(hi+name+welcomeMessage);
		sc.close();
	}

}
