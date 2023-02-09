package MediaAltezza;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MediaAltezza {
	public static void main (String[] args) {
		
		int maxCap;
		int i;
		int misura;
		
		
		Scanner altezza = new Scanner (System.in);
		System.out.println("inserisci una capienza della classe");
		maxCap = altezza.nextInt();
		
		int [] studenti = new int [maxCap];
		
		for (i=0 ; i < studenti.length ; i++) {
			System.out.println("inserisca l'altezza del prossimo studente");
			studenti [i] = altezza.nextInt();
		}
		
		int somma = Arrays.stream(studenti).sum();
		System.out.println("la media delle altezze è: " + somma / studenti.length);
			
		
	}
}
