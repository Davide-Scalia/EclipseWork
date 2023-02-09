package model;

public class dado {
	int facce;
	String colore;
	
	public dado() {
		this.facce = 6;
		this.colore = "bianco";
	}

	public dado(int facce, String colore) {
		super();
		this.facce = facce;
		this.colore = colore;
	}
	
	public int lancia() {
		int casuale = 0;
		casuale = (int)(Math.random() * facce )+1; //non costruisce istanze o esemplari di Math.
		return casuale;
		
		
		
	}
	
}
