package rpr.etf.unsa.ba;

public class Program {

    public static void main(String[] args) {
	    Student s = new Student("Amir", "Nakić", 17787 );
	    s.IspisiStudenta();
	    s.PromijeniIme("Amila");
	    s.PromijeniPrezime("Šoše");
	    s.PromijeniBrojIndeksa(17783);
	    s.IspisiStudenta();
    }
}
