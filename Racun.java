import java.math.BigDecimal;

public class Racun {
    private String brojRacuna;
    private BigDecimal stanje;
    private String vlasnik;

    public Racun(String brojRacuna, BigDecimal stanje, String vlasnik) {
        this.brojRacuna = brojRacuna;
        this.stanje = stanje;
        this.vlasnik = vlasnik;
    }

    public String getBrojRacuna() {
        return this.brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public BigDecimal getStanje() {
        return this.stanje;
    }

    public void setStanje(BigDecimal stanje) {
        this.stanje = stanje;
    }

    public String getVlasnik() {
        return this.vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }


    public void uplata(BigDecimal iznos) {
            stanje = stanje.add(iznos);
            System.out.println("Uplata: " + iznos + ". Trenutno stanje: " + stanje);
    }

    public void isplata(BigDecimal iznos) {
            stanje = stanje.subtract(iznos);
            System.out.println("Isplata: " + iznos + ". Trenutno stanje: " + stanje);
    }
}
