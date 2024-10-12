package org.lessons.oop.animals;

public class Passerotto extends Animale implements AnimaliVolanti{
	
	private String tipo;
	
	Passerotto() {
		this.tipo = "Passerotto";
	}
	
	//metodi superclasse astratti
	@Override
	public void  verso() {
		System.out.println("Ecco il mio verso:");
		System.out.println("Cip Cip");
	}
	@Override
	public void mangia() {
		System.out.println("Ecco gli alimenti che posso mangiare");
		System.out.println("Cerali, Semi, Vermi");
	}
	
	public void vola() {
		System.out.println("Sto volandoo!");
	}

	public void tipo() {
		System.out.println("Sono un Passerotto");
		
	}
	
	public void infoAnimale() {
		tipo();
		verso();
		mangia();
	}
}
