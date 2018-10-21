package rpr.etf.unsa.ba;

public class Program {

    public static void main(String[] args) {
	    Student s1 = new Student("Amir", "Nakić", 17787 );
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
        p.BrisiPredmet();
    }
}
