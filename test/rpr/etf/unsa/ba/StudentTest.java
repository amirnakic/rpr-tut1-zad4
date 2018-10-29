package rpr.etf.unsa.ba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void testKonstruktora() {
        Student s = new Student("Amila", "Šoše", 17783);
        assertAll("grupni test za funkcionalnost konstruktora",
                () -> assertEquals("Amila", s.DajIme()),
                () -> assertEquals("Šoše", s.DajPrezime()),
                () -> assertEquals(17783, s.DajBrojIndeksa()));
    }

    @Test
    void ispravnostPostavljanjaImena() {
        Student s = new Student("Amir", "Nakić", 17787);
        assertEquals("Amir", s.DajIme());
    }

    @Test
    void ispravnostPostavljanjaPrezimena() {
        Student s = new Student("Amir", "Nakić", 17787);
        assertEquals("Nakić", s.DajPrezime());
    }

    @Test
    void ispravnostPostavljanjaBrojaIndeksa() {
        Student s = new Student("Amir", "Nakić", 17787);
        assertEquals(17787, s.DajBrojIndeksa());
    }

    @Test
    void promjenaImena() {
        Student s = new Student("Amir", "Nakić", 17787);
        s.PromijeniIme("Abdurahman");
        assertEquals("Abdurahman", s.DajIme());
    }

    @Test
    void promjenaPrezimena() {
        Student s = new Student("Amir", "Nakić", 17787);
        s.PromijeniPrezime("Beckham");
        assertEquals("Beckham", s.DajPrezime());
    }

    @Test
    void promjenaBrojaIndeksa() {
        Student s = new Student("Amir", "Nakić", 17787);
        s.PromijeniBrojIndeksa(431998);
        assertEquals(431998, s.DajBrojIndeksa());
    }

    @Test
    void ispisStudenta() {
        Student s = new Student("Amir", "Nakić", 17787);
        assertEquals("Nakić Amir (17787)", s.IspisiStudenta());
    }

    @Test
    void jednakostDvaStudenta() {
        Student s1 = new Student("Amir", "Nakić", 17787);
        Student s2 = new Student("Amir", "Nakić", 17787);
        assertTrue(s1.IstiStudent(s2));
    }

    @Test
    void nejednakostDvaStudenta() {
        Student s1 = new Student("Amir", "Nakić", 17787);
        Student s2 = new Student("Amila", "Šoše", 17783);
        assertFalse(s1.IstiStudent(s2));
    }

    @Test
    void brisiStudenta() {
        Student s1 = new Student("Amir", "Nakić", 17787);
        Student s2 = new Student("Amila", "Šoše", 17783);
        Student s3 = new Student("Ilma", "Okanović", 17773);
        s1.BrisiStudenta();
        s2.BrisiStudenta();
        assertAll("testiranje brisanja studenata",
                () -> assertNull(s1.DajIme()),
                () -> assertNull(s2.DajPrezime()),
                () -> assertNotNull(s3.DajBrojIndeksa()));
    }
}