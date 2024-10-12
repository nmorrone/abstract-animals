package org.lessons.oop.animals;

public class Passerotto extends Animale{
	
	private String tipo;
	
	Passerotto() {
		this.tipo = "Passerotto";
	}
	
	//metodi superclasse astratti
	public void  verso() {
		System.out.println("Cip Cip");
	}
	public void mangia() {
		System.out.println("Ecco gli alimenti che posso mangiare");
		System.out.println("Cerali, Semi, Vermi");
	}
	
	public void vola() {
		System.out.println("Sto volandoo!");
	}

}
