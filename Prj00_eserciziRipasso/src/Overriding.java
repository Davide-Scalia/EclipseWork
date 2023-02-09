
public class Overriding { 
	
	//override = due metodi uguali di nome ma con diverse variabili
	
	public static double sum(int a , double b) {
	return a + b;
	}
	public static double sum(double a , int b) {
	return a + b;
	}
	
	//sono due metodi diversi, la loro signature sono le variabili tra parentesi e il tipo di valore prima del nome del metodo
	//quando li chiamo, devi mettere la loro signature precisa (e ovviamente mettere i valori nel format giusto)
	
	//array normali = struttura dati pura = solo dati di un tipo
	//classe = struttura di dati con anche dei metodi
	
	public static void main(String[] args) {
		User eric = new User();
		System.out.println("Fullname" + eric.getFullName());
		
		
		// vedi classe user
		
		User kyle = new User();
		kyle.firstname = "Kyle";
		kyle.lastname= "Broflow";
		//eccezione
		try {
			eric.firstname = "Eric";
			eric.lastname= "Cartman";
			
			eric.setAge(-3);
			
			System.out.printf("%s %s ha %d anni\n", eric.getFirstname(), eric.getLastname(), eric.getAge());
		}catch(Exception e){
			System.out.println(e.getMessage());
			
			//se stampo l'eta in negativo normalmente, mi da errore, quindi devo mettere un'eccezione
	    }
		//solo i metodi possono modificare lo stato dell' oggetto
	}
	
	
	
}
	
	
	
	
	
	
	
}