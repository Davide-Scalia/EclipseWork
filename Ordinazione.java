package project;
import java.util.ArrayList;

public class Ordinazione {
	public String nomeCliente;
	public ArrayList<Portata> elencoOrdinazione;

	public Ordinazione(String nomeCliente) {

		this.nomeCliente = nomeCliente;
		this.elencoOrdinazione = new ArrayList<>();

	}

	public void aggiungiPortata(Portata p, int q) {

		for (int i = 0; i < q; i++) {

			elencoOrdinazione.add(p);

		}

	}

	public double conto() {
		double somma = 0;

		for (Portata portate : elencoOrdinazione) {
			somma = somma + portate.getPrezzo();
		}
		return somma;
	}

	public double contoBevande() {
		double sommaBevande = 0;
		for (Portata portate : elencoOrdinazione) {
			if (portate.isBevanda()) {
				sommaBevande += portate.getPrezzo();

			}

		}
		return sommaBevande;
	}

	public int numeroTotalePortate() {
		return elencoOrdinazione.size();
	}

	public String portateOrdinate() {
		int sommaBevandeOrdinate = 0;
		int sommaCibiOrdinati = 0;
		for (Portata portate : elencoOrdinazione) {
			if (portate.isBevanda()) {
				sommaBevandeOrdinate++;					
			}  else {
				sommaCibiOrdinati++;
			}

		}
		return "bevande = " + sommaBevandeOrdinate + "// cibi = " + sommaCibiOrdinati;
		
	}
}	
