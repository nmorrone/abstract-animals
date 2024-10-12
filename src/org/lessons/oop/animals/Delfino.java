package org.lessons.oop.animals;

public class Delfino extends Animale implements AnimaliNuotanti{

	private String tipo;
	Delfino() {
		this.tipo = "Delfino";
	}
	
	//metodi superclasse astratti
	@Override
	public void verso() {
		System.out.println("Non ho un verso");
	}
	@Override
	public void mangia() {
		System.out.println("Ecco gli alimenti che posso mangiare");
		System.out.println("Pesci, Calamari, Crostacei");
	}
	
	public void nuota() {
		System.out.println("Sto nuotandoo!");
	}
	public void tipo() {
		System.out.println("Sono un Delfino");
	}
	public void infoAnimale() {
		tipo();
		verso();
		mangia();
	}
}
