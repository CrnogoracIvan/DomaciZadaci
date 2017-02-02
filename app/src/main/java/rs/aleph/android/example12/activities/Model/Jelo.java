package rs.aleph.android.example12.activities.Model;

/**
 * Created by Ivan Crnogorac on 2/2/2017.
 */

public class Jelo {

    private int id;
    private String image;
    private String naziv;
    private String opis;
    private String kategorija;
    private String sastojci;
    private String kalorijskaVrednost;
    private int cena;
    private float ocena;

    public Jelo() {
    }

    public Jelo(String image, String naziv, String opis, String kategorija, String sastojci, String kalorijskaVrednost, int cena) {
        this.image = image;
        this.naziv = naziv;
        this.opis = opis;
        this.kategorija = kategorija;
        this.sastojci = sastojci;
        this.kalorijskaVrednost = kalorijskaVrednost;
        this.cena = cena;
    }

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getOpis() {
        return opis;
    }

    public String getKategorija() {
        return kategorija;
    }

    public String getSastojci() {
        return sastojci;
    }

    public String getKalorijskaVrednost() {
        return kalorijskaVrednost;
    }

    public int getCena() {
        return cena;
    }

    public float getOcena() {
        return ocena;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public void setSastojci(String sastojci) {
        this.sastojci = sastojci;
    }

    public void setKalorijskaVrednost(String kalorijskaVrednost) {
        this.kalorijskaVrednost = kalorijskaVrednost;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setOcena(float ocena) {
        this.ocena = ocena;
    }

    @Override
    public String toString() {
        return "Jelo{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", naziv='" + naziv + '\'' +
                ", opis='" + opis + '\'' +
                ", kategorija='" + kategorija + '\'' +
                ", sastojci='" + sastojci + '\'' +
                ", kalorijskaVrednost='" + kalorijskaVrednost + '\'' +
                ", cena=" + cena +
                '}';
    }
}
