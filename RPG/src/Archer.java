

import java.util.Scanner;

public class Archer extends Ranged {
    double physicalBoost;
    Scanner scanner = new Scanner(System.in);


    public Archer(double baseDamage, double health, double physicalBoost) {
        super(baseDamage, health);
        this.physicalBoost = physicalBoost;

    }



    double shot (){
        double totalDamage;
        totalDamage =  baseDamage + baseDamage * physicalBoost + 20 ;
        System.out.println(totalDamage);
        return totalDamage;
    }

    double multiShot() {
        double totalDamage = 0; // inizializza il totale dei danni a zero
        int numArrows = 6; // numero di frecce a disposizione
        int hitProbability = 60; // probabilità del 40% di centrare il bersaglio
        int arrowsHit = 0; // inizializza il numero di frecce a segno a zero

        for (int i = 0; i < numArrows; i++) {
            if (Math.random() * 100 < hitProbability) { // calcola un valore casuale tra 0 e 100 e verifica se è inferiore alla probabilità di centrare il bersaglio
                double arrowDamage = baseDamage + baseDamage * physicalBoost + 20 ; // calcola il danno inflitto dalla freccia a segno
                totalDamage += arrowDamage; // aggiungi il danno al totale dei danni
                arrowsHit++; // incrementa il numero di frecce a segno
                System.out.println("Freccia " + (i+1) + " a segno! Danno: " + arrowDamage);
            } else {
                System.out.println("Freccia " + (i+1) + " mancata");
            }
        }

        System.out.println("Totale frecce a segno: " + arrowsHit);
        System.out.println(totalDamage);
        return totalDamage;

    }

    double ultimateMove() {
        return 0;
    }
}






