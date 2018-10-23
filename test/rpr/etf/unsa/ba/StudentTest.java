package rpr.etf.unsa.ba;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void testKonstruktora() {
        Student s = new Student ("Amila", "Šoše", 17783);
        assertAll("grupni test za funkcionalnost konstruktora",
            () ->  assertEquals("Amila", s.DajIme()),
            () -> assertEquals("Šoše", s.DajPrezime()),
            () -> assertEquals(17783, s.DajBrojIndeksa()));
    }
    @Test
    void dajIme() {
        Student s = new Student ("Amir", "Nakić", 17787);
        assertEquals("Amir", s.DajIme());
    }
    @Test
    void dajPrezime() {
        Student s = new Student ("Amir", "Nakić", 17787);
        assertEquals("Nakić", s.DajPrezime());
    }
    @Test
    void dajBrojIndeksa() {
        Student s = new Student("Amir", "Nakić", 17787);
        assertEquals(17787, s.DajBrojIndeksa());
    }
    @Test
    void promijeniIme() {
        Student s = new Student ("Amir", "Nakić", 17787);
        s.PromijeniIme("Abdurahman");
        assertEquals("Abdurahman", s.DajIme());
    }
    @Test
    void promijeniPrezime() {
        Student s = new Student ("Amir", "Nakić", 17787);
        s.PromijeniPrezime("Beckham");
        assertEquals("Beckham", s.DajPrezime());
    }
    @Test
    void promijeniBrojIndeksa() {
        Student s = new Student ("Amir", "Nakić", 17787);
        s.PromijeniBrojIndeksa(431998);
        assertEquals(431998, s.DajBrojIndeksa());
    }
    @Test
    void ispisiStudenta() {

    }
    @Test
    void istiStudent() {
    }

    @Test
    void brisiStudenta() {
    }
}