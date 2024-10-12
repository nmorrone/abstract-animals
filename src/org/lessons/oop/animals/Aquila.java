package org.lessons.oop.animals;

public class Aquila extends Animale implements AnimaliVolanti{
	
	private String tipo;

	Aquila() {
		this.tipo = "Aquila";
	}
	
	//metodi superclasse astratti
	@Override
	public void verso() {
		System.out.println("Ecco il mio verso:");
		System.out.println("Aaa Aaa");
	}
	@Override
	public void mangia() {
		System.out.println("Ecco gli alimenti che posso mangiare");
		System.out.println("Piccoli Mammiferi (roditori, lepri, ecc.., Pesci, Piccoli Rettili");
	}

	public void vola() {
		System.out.println("Sto volandoo!");
	}
	
	public void tipo() {
		System.out.println("Sono un'Aquila");
	}
	public void infoAnimale() {
		tipo();
		verso();
		mangia();
	}

}
