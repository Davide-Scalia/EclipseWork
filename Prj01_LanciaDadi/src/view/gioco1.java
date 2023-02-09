package view;

import model.dado;

public class gioco1 {

	public static void main(String[] args) {
		dado d1 = new dado();
		dado d2 = new dado();
		
		final int NUM_LANCI = 1000000;
		int vittorie = 0;
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < NUM_LANCI; i++) {
			int r1 = d1.lancia();
			System.out.println("dado 1 " + r1);
			
			int r2 = d2.lancia();
			System.out.println("dado 2 " + r2);
			
			if (r1 == r2) {
				System.out.println("hai vinto");
				vittorie++;
			}
			
		}
		long stop = System.currentTimeMillis();
		System.out.println("numero di vittorie " + vittorie);
		System.out.println("la percentuale " + ((double)vittorie/NUM_LANCI));
		System.out.println("l'elaborazione è durata " + (stop-start) + "ms");
	}

}
