package org.lessons.oop.animals;

import java.util.Scanner;


public class Main2{
	

	public static void faiNuotare(AnimaliNuotanti s) {
		s.nuota();
	}
	
	public static void faiVolare(AnimaliVolanti s) {
		s.vola();
	}
	
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1) per istanziare animale che nuota \n2) per istanziare animale che vola");
		int scelta = input.nextInt();
		switch (scelta) {
		case 1:{
			AnimaliNuotanti delfino = new Delfino();
			System.out.println("Sono un Delfino!");
			faiNuotare(delfino);
			break;
		}
		case 2:{
			System.out.println("1) per Passerotto\n2) per Aquila");
			int scelta2 = input.nextInt();
			if (scelta2 == 1) {
				AnimaliVolanti passerotto = new Passerotto();
				System.out.println("Sono un Passerotto!");
				faiVolare(passerotto);
			}
			else if (scelta == 2){
				AnimaliVolanti aquila = new Aquila();
				System.out.println("Sono un Aquila!");
				faiVolare(aquila);
			}
			break;
		}
		default : {
			System.out.println("Valore non riconoscuto \n1) per istanziare animale che nuota \n2) per istanziare animale che vola");
		}
		}

	}

}
