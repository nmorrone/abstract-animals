package org.lessons.oop.animals;

public class Cane extends Animale{
	
	private String tipo;
	
	Cane (){
		
		this.tipo = "Cane";

	}

		//metodi superclasse astratti
		@Override
		public void verso() {
			System.out.println("Ecco il mio verso: ");
			System.out.println("Bau Bau");
		}
		@Override
		public void mangia() {
			System.out.println("Ecco gli alimenti che posso mangiare:");
			System.out.println("Crocchette, Carne, Pesce, Uova, Riso, Frutta");
		}
		public void tipo() {
			System.out.println("Sono un Cane");
		}
		
		
		public void infoAnimale() {
			tipo();
			verso();
			mangia();
			
		}

}
