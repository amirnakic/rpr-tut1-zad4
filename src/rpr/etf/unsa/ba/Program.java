package rpr.etf.unsa.ba;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
    	boolean istina = true;
    	while (istina) {
			System.out.println("------DOBRODOŠLI-----");
			System.out.println("Unosom broja sa tastature izaberite željenu opciju: ");
			System.out.println("0 - prekid programa");
			System.out.println("1 - kreiranje novih predmeta");
			System.out.println("2 - brisanje predmeta");
			System.out.println("3 - kreiranje novih studenata");
			System.out.println("4 - brisanje studenta");
			System.out.println("5 - ispis spiska studenata na predmetu");
			System.out.println("6 - upis studenta na predmet");
			System.out.println("7 - ispis studenta sa predmeta");
			Scanner ulaz = new Scanner(System.in);
			int izbor =  ulaz.nextInt();
			switch(izbor) {
				case 0:
					istina = false;
					break;
				case 1:
					System.out.println("-----Izabrali ste opciju unosa novih predmeta-----");
					System.out.println("Unesite broj predmeta: ");
					int brojPredmeta =  ulaz.nextInt();
					Predmet[] niz = new Predmet[brojPredmeta];
					for(int i = 0; i < brojPredmeta; i++) {
						System.out.println("Unesite naziv predmeta: ");
						String nazivPredmeta = ulaz.nextLine();
						System.out.println("Unesite šifru predmeta: ");
						String sifraPredmeta = ulaz.nextLine();
						System.out.println("Unesite maksimalni broj studenata na predmetu: ");
						int maxBrojStudenataNaPredmetu = ulaz.nextInt();
						niz[i] = new Predmet(nazivPredmeta, sifraPredmeta, maxBrojStudenataNaPredmetu);
					}
			}
		}

	    /*Student s1 = new Student("Amir", "Nakić", 17787 );
	    Student s2 = new Student (" Amila", "Šoše", 17783);
	    Student s3 = new Student ("Ibrahim", "Alispahić", 17779);
	    Predmet p = new Predmet("Razvoj programskih rješenja", "RPRAiE2018", 10);
	    p.IspisiPredmet();
	    p.UpisiStudenta(s1);
	    p.UpisiStudenta(s2);
	    p.UpisiStudenta(s3);
	    p.IspisSpiskaStudenata();
        p.IspisiStudenta(s3);
        p.IspisSpiskaStudenata();
        p.BrisiPredmet();*/
    }
}
