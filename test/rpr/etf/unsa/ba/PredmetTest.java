package rpr.etf.unsa.ba;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {
    @Test
    void ispravnostPostavljanjaNazivaPredmeta() {
        Predmet p = new Predmet("Razvoj programskih rješenja", "RPRAiE2018", 100);
        assertEquals("Razvoj programskih rješenja", p.DajNazivPredmeta());
    }
    @Test
    void ispravnostPostavljanjaSifrePredmeta() {
        Predmet p = new Predmet("Razvoj programskih rješenja", "RPRAiE2018", 100);
        assertEquals("RPRAiE2018", p.DajSifruPredmeta());
    }
    @Test
    void ispravnostPostavljanjaMaxBrojaStudenata() {
        Predmet p = new Predmet("Razvoj programskih rješenja", "RPRAiE2018", 100);
        assertEquals(100, p.DajMaxBrojStudenata());
    }
    @Test
    void ispravnostupisaStudenta() {
        Predmet p = new Predmet("Razvoj programskih rješenja", "RPRAiE2018", 100);
        Student s = new Student ("Amila", "Šoše", 17783);
        p.UpisiStudenta(s);
        assertEquals(1, p.DajTrenutniBrojStudenata());
    }
    @Test
    void ispisiStudenta() {
        Predmet p = new Predmet("Razvoj programskih rješenja", "RPRAiE2018", 100);
        Student s1 = new Student ("Amir", "Nakić", 17787);
        Student s2 = new Student ("Amila", "Šoše", 17783);
        p.UpisiStudenta(s1);
        p.UpisiStudenta(s2);
        p.IspisiStudenta(s1);
        assertEquals(1, p.DajTrenutniBrojStudenata());
    }
    @Test
    void ispisSpiskaStudenata() {
        Predmet p = new Predmet("Razvoj programskih rješenja", "RPRAiE2018", 100);
        Student s1 = new Student ("Amir", "Nakić", 17787);
        Student s2 = new Student ("Amila", "Šoše", 17783);
        p.UpisiStudenta(s1);
        p.UpisiStudenta(s2);
        assertEquals("1. Nakić Amir (17787)\n2. Šoše Amila (17783)\n", p.IspisSpiskaStudenata());
    }
    @Test
    void brisiPredmet() {
        Predmet p = new Predmet("Razvoj programskih rješenja", "RPRAiE2018", 100);
        p.BrisiPredmet();
        assertAll("provjera funkcionalnosti brisanja predmeta",
                () -> assertNull(p.DajNazivPredmeta()),
                () -> assertNull(p.DajSifruPredmeta()),
                () -> assertEquals(0, p.DajTrenutniBrojStudenata()));
    }
}