package collezioni;

import java.util.ArrayList;

public final class ListeDemo {

	public static void main(String[] args) {
		
		//una list dentro la quale c'è un array, ma ridimensionabile e con dei suoi metodi
		ArrayList<String> parole = new ArrayList<>();
		
		parole.add("pippo");
		parole.add("pippo");
		parole.add("pippo");
		parole.add("pippo");
		parole.add("pippo");
		parole.add("pippo");
		
		//Dio nazifascista
		
		System.out.println(parole.size());
		
		for (String string : parole) {
			System.out.println(string.toUpperCase());
		}

	}

}
