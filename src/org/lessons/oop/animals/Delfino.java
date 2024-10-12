package org.lessons.oop.animals;

public class Delfino extends Animale{

	private String tipo;
	Delfino() {
		this.tipo = "Delfino";
	}
	
	//metodi superclasse astratti
	public void verso() {
		System.out.println(".....");
	}
	public void mangia() {
		System.out.println("Ecco gli alimenti che posso mangiare");
		System.out.println("Pesci, Calamari, Crostacei");
	}
	
	public void nuota() {
		System.out.println("Sto nuotandoo!");
	}
}
