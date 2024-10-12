package org.lessons.oop.animals;

public class Aquila extends Animale{
	
	private String tipo;

	Aquila() {
		this.tipo = "Aquila";
	}
	
	//metodi superclasse astratti
	public void verso() {
		System.out.println("Aaa Aaa");
	}
	public void mangia() {
		System.out.println("Ecco gli alimenti che posso mangiare");
		System.out.println("Piccoli Mammiferi (roditori, lepri, ecc.., Pesci, Piccoli Rettili");
	}
	public void vola() {
		System.out.println("Sto volandoo!");
	}

}
