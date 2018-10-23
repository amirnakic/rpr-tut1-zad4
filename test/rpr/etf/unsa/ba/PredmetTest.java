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
    void upisiStudenta() {
    }
    @Test
    void ispisiStudenta() {
    }
    @Test
    void ispisSpiskaStudenata() {
    }
    @Test
    void brisiPredmet() {
    }
}