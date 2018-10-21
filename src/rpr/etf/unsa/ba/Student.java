package rpr.etf.unsa.ba;

public class Student {
    private String ime, prezime;
    private class IntWrapper {
        private int value;
        IntWrapper(int value) { this.value = value; }
        int PrebaciUInteger() { return (int)value; }
    }
    private IntWrapper brojIndeksa;
    Student (String ime, String prezime, int br_indeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = new IntWrapper(br_indeksa);
    }
    public String DajIme() { return ime; }
    public String DajPrezime() { return prezime; }
    public int DajBrojIndeksa() { return brojIndeksa.PrebaciUInteger(); }
    public void PromijeniIme(String ime) { this.ime = ime; }
    public void PromijeniPrezime(String prezime) { this.prezime=prezime; }
    public void PromijeniBrojIndeksa(int broj) { this.brojIndeksa = new IntWrapper(broj); }
}
