package rpr.etf.unsa.ba;

public class Predmet {
    private String nazivPredmeta, sifraPredmeta;
    private final int MAX_BROJ_STUDENATA;
    private int trenutniBrojacStudenata = 0;
    private Student[] niz;

    Predmet(String nazivPredmeta, String sifraPredmeta, int brojStudenata) {
        this.nazivPredmeta = nazivPredmeta;
        this.sifraPredmeta = sifraPredmeta;
        this.MAX_BROJ_STUDENATA = brojStudenata;
        this.niz = new Student[brojStudenata];
    }

    public String DajNazivPredmeta() {
        return this.nazivPredmeta;
    }

    public String DajSifruPredmeta() {
        return this.sifraPredmeta;
    }

    public int DajMaxBrojStudenata() {
        return this.MAX_BROJ_STUDENATA;
    }

    public int DajTrenutniBrojStudenata() {
        return this.trenutniBrojacStudenata;
    }

    public void UpisiStudenta(Student s) {
        niz[trenutniBrojacStudenata] = new Student(s.DajIme(), s.DajPrezime(), s.DajBrojIndeksa());
        trenutniBrojacStudenata++;
    }

    public void IspisiStudenta(Student s) {
        for (int i = 0; i < this.trenutniBrojacStudenata; i++)
            if (s.IstiStudent(niz[i])) {
                niz[i] = null;
                trenutniBrojacStudenata--;
            }
    }

    public String IspisSpiskaStudenata() {
        String s = "";
        for (int i = 0; i < this.trenutniBrojacStudenata; i++) {
            if (niz[i] != null) {
                s += i + 1 + ". " + niz[i].IspisiStudenta() + "\n";
                System.out.println(i + 1 + ". " + niz[i].IspisiStudenta());
            }
        }
        return s;
    }

    public void BrisiPredmet() {
        nazivPredmeta = null;
        sifraPredmeta = null;
        for (int i = 0; i < trenutniBrojacStudenata; i++) niz[i].BrisiStudenta();
        this.trenutniBrojacStudenata = 0;
    }
}
