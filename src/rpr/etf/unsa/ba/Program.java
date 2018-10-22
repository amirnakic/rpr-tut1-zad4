package rpr.etf.unsa.ba;

import java.util.Scanner;

public class Program {
	public static Predmet[] niz1;
	public static Student[] niz2;
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
					System.out.println("-----Izabrali ste opciju kreiranja novih predmeta-----");
					System.out.println("Unesite broj predmeta: ");
					int brojPredmeta =  ulaz.nextInt();
					niz1 = new Predmet[brojPredmeta];
					for(int i = 0; i < brojPredmeta; i++) {
						System.out.println("Unesite naziv predmeta: ");
						String nazivPredmeta = ulaz.nextLine();
						System.out.println("Unesite šifru predmeta: ");
						String sifraPredmeta = ulaz.nextLine();
						System.out.println("Unesite maksimalni broj studenata na predmetu: ");
						int maxBrojStudenataNaPredmetu = ulaz.nextInt();
						niz1[i] = new Predmet(nazivPredmeta, sifraPredmeta, maxBrojStudenataNaPredmetu);
					}
				case 2:
					System.out.println("-----Izabrali ste opciju brisanja predmeta-----");
					boolean pronadjen1 = false;
					while (!pronadjen1) {
						System.out.println("Unesite šifru predmeta kojeg želite obrisati: ");
						String sifraPredmeta = ulaz.nextLine();
						for (int i = 0; i < niz1.length; i++) {
							if (niz1[i].DajSifruPredmeta().equals(sifraPredmeta)) {
								pronadjen1=true;
								niz1[i].BrisiPredmet();
								System.out.println("Predmet sa šifrom " + sifraPredmeta + " je uspješno obrisan.");
								break;
							}
						}
						if (!pronadjen1) System.out.println("Predmet nije pronađen. Pokušajte ponovo.");
						else break;
					}
					break;
				case 3:
					System.out.println("-----Izabrali ste opciju kreiranja novih studenata-----");
					System.out.println("Unesite broj studenata: ");
					int brojStudenata =  ulaz.nextInt();
					niz2 = new Student[brojStudenata];
					for(int i = 0; i < brojStudenata; i++) {
						System.out.println("Unesite ime studenta: ");
						String imeStudenta = ulaz.nextLine();
						System.out.println("Unesite prezime studenta: ");
						String prezimeStudenta = ulaz.nextLine();
						System.out.println("Unesite broj indeksa: ");
						int brojIndeksa = ulaz.nextInt();
						niz2[i] = new Student(imeStudenta, prezimeStudenta, brojIndeksa);
					}
					break;
                case 4:
                    System.out.println("-----Izabrali ste opciju brisanja studenta-----");
                    boolean pronadjen2 = false;
                    while (!pronadjen2) {
                        System.out.println("Unesite broj indeksa studenta kojeg želite obrisati: ");
                        int brojIndeksa = ulaz.nextInt();
                        for (int i = 0; i < niz2.length; i++) {
                            if (niz2[i].DajBrojIndeksa() == brojIndeksa) {
                                pronadjen2=true;
                                niz2[i].BrisiStudenta();
                                System.out.println("Student sa brojem indeksa " + brojIndeksa + " je uspješno obrisan.");
                                break;
                            }
                        }
                        if (!pronadjen2) System.out.println("Student nije pronađen. Pokušajte ponovo.");
                        else break;
                    }
                    break;
                
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
