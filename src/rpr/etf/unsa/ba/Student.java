package rpr.etf.unsa.ba;

public class Student {
    private String ime, prezime;
    private int brojIndeksa;
    Student (String ime, String prezime, int br_indeksa) {
        this.ime=ime;
        this.prezime=prezime;
        this.brojIndeksa=br_indeksa;
    }
    public String DajIme() { return ime; }
    public String DajPrezime() { return prezime; }
    public int DajBrojIndeksa() { return brojIndeksa; }
    public void PromijeniIme(String ime) { this.ime=ime; }
    public void PromijeniPrezime(String prezime) { this.prezime=prezime; }
}
