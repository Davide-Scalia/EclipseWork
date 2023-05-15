package project;

public class Portata {

	String descrizione;
	double prezzo;
	boolean isBevanda;

	public Portata(String descrizione, double prezzo, boolean isBevanda) {
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.isBevanda = isBevanda;
	}
	
	public boolean isBevanda(){
		
	if (isBevanda == true) {
			return true;
		}	else {
			return false;
		}
	 
	}
	
	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
}

	
