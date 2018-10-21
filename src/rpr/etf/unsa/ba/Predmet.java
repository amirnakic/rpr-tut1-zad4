package rpr.etf.unsa.ba;

public class Predmet {
    private String nazivPredmeta, sifraPredmeta;
    private final int MAX_BROJ_STUDENATA;
    private Student[] niz;
    Predmet (String nazivPredmeta, String sifraPredmeta, int brojStudenata) {
        this.nazivPredmeta = nazivPredmeta; this.sifraPredmeta = sifraPredmeta;
        this.MAX_BROJ_STUDENATA = brojStudenata;
        this.niz = new Student[brojStudenata];
    }
}
