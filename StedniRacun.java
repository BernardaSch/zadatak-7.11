import java.math.BigDecimal;
import java.math.RoundingMode;

public class StedniRacun extends Racun {
    private static final BigDecimal KAMATNA_STOPA = new BigDecimal("0.015");

    public StedniRacun(String brojRacuna, BigDecimal stanje, String vlasnik) {
        super(brojRacuna, stanje, vlasnik);
    }

    public void obracunKamate() {
        BigDecimal kamata = getStanje().multiply(KAMATNA_STOPA);
        BigDecimal novoStanje = getStanje().add(kamata);
        System.out.println("Štedni račun: " + getBrojRacuna() + ", obračunata kamata: " + kamata);
        System.out.println("Novo stanje štednog računa: " + novoStanje);
    }
}