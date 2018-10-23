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
			int izbor = ulaz.nextInt();
			switch (izbor) {
				case 0:
					istina = false;
					break;
				case 1:
					System.out.println("-----Izabrali ste opciju kreiranja novih predmeta-----");
					System.out.println("Unesite broj predmeta: ");
					int brojPredmeta = ulaz.nextInt();
					niz1 = new Predmet[brojPredmeta];
					for (int i = 0; i < brojPredmeta; i++) {
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
					boolean pronadjen = false;
					while (!pronadjen) {
						System.out.println("Unesite šifru predmeta kojeg želite obrisati: ");
						String sifraPredmeta = ulaz.nextLine();
						for (int i = 0; i < niz1.length; i++) {
							if (niz1[i].DajSifruPredmeta().equals(sifraPredmeta)) {
								pronadjen = true;
								niz1[i].BrisiPredmet();
								System.out.println("Predmet sa šifrom " + sifraPredmeta + " je uspješno obrisan.");
								break;
							}
						}
						if (!pronadjen) System.out.println("Predmet nije pronađen. Pokušajte ponovo.");
						else break;
					}
					break;
				case 3:
					System.out.println("-----Izabrali ste opciju kreiranja novih studenata-----");
					System.out.println("Unesite broj studenata: ");
					int brojStudenata = ulaz.nextInt();
					niz2 = new Student[brojStudenata];
					for (int i = 0; i < brojStudenata; i++) {
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
					boolean pronadjen1 = false;
					while (!pronadjen1) {
						System.out.println("Unesite ime studenta: ");
						String imeStudenta = ulaz.nextLine();
						System.out.println("Unesite prezime studenta: ");
						String prezimeStudenta = ulaz.nextLine();
						System.out.println("Unesite broj indeksa: ");
						int brojIndeksa = ulaz.nextInt();
						Student s = new Student(imeStudenta, prezimeStudenta, brojIndeksa);
						for (int i = 0; i < niz2.length; i++) {
							if (niz2[i].IstiStudent(s)) {
								pronadjen1 = true;
								niz2[i].BrisiStudenta();
								s.BrisiStudenta();
								System.out.println("Student sa brojem indeksa " + brojIndeksa + " je uspješno obrisan.");
								break;
							}
						}
						if (!pronadjen1) System.out.println("Student nije pronađen. Pokušajte ponovo.");
						else break;
					}
					break;
				case 5:
					System.out.println("-----Izabrali ste opciju ispisa spiska studenata na predmetu-----");
					boolean pronadjen2 = false;
					while (!pronadjen2) {
						System.out.println("Unesite šifru predmeta čiji spisak studenata želite: ");
						String sifraPredmeta = ulaz.nextLine();
						for (int i = 0; i < niz1.length; i++) {
							if (niz1[i].DajSifruPredmeta().equals(sifraPredmeta)) {
								pronadjen2 = true;
								niz1[i].IspisSpiskaStudenata();
								System.out.println("Studenti na predmetu sa šifrom " + sifraPredmeta + " su uspješno ispisani.");
								break;
							}
						}
						if (!pronadjen2) System.out.println("Predmet nije pronađen. Pokušajte ponovo.");
						else break;
					}
					break;
				case 6:
					System.out.println("-----Izabrali ste opciju upisa studenta na predmet------");
					boolean pronadjen3 = false;
					int indeksStudenta = 0, brojIndeksa = 0;
					while (!pronadjen3) {
						System.out.println("Unesite broj indeksa studenta kojeg želite upisati: ");
						brojIndeksa = ulaz.nextInt();
						for (int i = 0; i < niz2.length; i++) {
							if (niz2[i].DajBrojIndeksa() == brojIndeksa) {
								pronadjen3 = true;
								indeksStudenta = i;
								break;
							}
						}
						if (!pronadjen3) System.out.println("Student nije pronađen. Pokušajte ponovo.");
						else break;
					}
					while (!pronadjen3) {
						System.out.println("Unesite šifru predmeta na koji želite upisati studenta: ");
						String sifraPredmeta = ulaz.nextLine();
						for (int i = 0; i < niz1.length; i++) {
							if (niz1[i].DajSifruPredmeta().equals(sifraPredmeta)) {
								pronadjen3 = true;
								niz1[i].UpisiStudenta(niz2[indeksStudenta]);
								System.out.println("Student sa brojem indeksa " + brojIndeksa + " je uspješno upisan na predmet sa šifrom " + sifraPredmeta + ".");
								break;
							}
						}
						if (!pronadjen3) System.out.println("Predmet nije pronađen. Pokušajte ponovo.");
						else break;
					}
					break;
				case 7:
					System.out.println("-----Izabrali ste opciju ispisa studenta sa predmeta------");
					boolean pronadjen4 = false;
					int indeksStudenta1 = 0, brojIndeksa1 = 0;
					while (!pronadjen4) {
						System.out.println("Unesite broj indeksa studenta kojeg želite ispisati: ");
						brojIndeksa = ulaz.nextInt();
						for (int i = 0; i < niz2.length; i++) {
							if (niz2[i].DajBrojIndeksa() == brojIndeksa1) {
								pronadjen4 = true;
								indeksStudenta1 = i;
								break;
							}
						}
						if (!pronadjen4) System.out.println("Student nije pronađen. Pokušajte ponovo.");
						else break;
					}
					while (!pronadjen4) {
						System.out.println("Unesite šifru predmeta sa kojeg želite ispisati studenta: ");
						String sifraPredmeta = ulaz.nextLine();
						for (int i = 0; i < niz1.length; i++) {
							if (niz1[i].DajSifruPredmeta().equals(sifraPredmeta)) {
								pronadjen4 = true;
								niz1[i].IspisiStudenta(niz2[indeksStudenta1]);
								System.out.println("Student sa brojem indeksa " + brojIndeksa1 + " je uspješno ispisan sa predmeta sa šifrom " + sifraPredmeta + ".");
								break;
							}
						}
						if (!pronadjen4) System.out.println("Predmet nije pronađen. Pokušajte ponovo.");
						else break;
					}
					break;
			}
		}
	}
}