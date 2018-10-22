package rpr.etf.unsa.ba;

public class SviPredmeti {
    private Predmet[] niz;
    private final int MAX_BROJ_PREDMETA;
    private int trenutniBrojPredmeta = 0;
    SviPredmeti(int brojPredmeta) {
        this.MAX_BROJ_PREDMETA = brojPredmeta;
        this.niz = new Predmet[brojPredmeta];
    }
    public void DodajPredmet(Predmet p) {
        niz[trenutniBrojPredmeta] = new Predmet(p.DajNazivPredmeta(), p.DajSifruPredmeta(), p.DajMaxBrojStudenata());
        trenutniBrojPredmeta++;
    }
    public void BrisiPredmet(Predmet p) {
        for (int i = 0; i < MAX_BROJ_PREDMETA; i++) {
            if (p.DajNazivPredmeta().equals(niz[i].DajNazivPredmeta()) && p.DajSifruPredmeta().equals(niz[i].DajSifruPredmeta()) && p.DajMaxBrojStudenata() == niz[i].DajMaxBrojStudenata()) {
                niz[i] = null;
                trenutniBrojPredmeta--;
            }
        }
    }
}
