package org.lessons.oop.animals;

public class Cane extends Animale{
	
	private String tipo;
	
	Cane (){
		
		this.tipo = "Cane";

	}

		//metodi superclasse astratti
		public void verso() {
			System.out.println("Bau Bau");
		}
		public void mangia() {
			System.out.println("Ecco gli alimenti che posso mangiare");
			System.out.println("Crocchette, Carne, Pesce, Uova, Riso, Frutta");
		}
		

}
