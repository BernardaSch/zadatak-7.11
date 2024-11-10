import java.math.BigDecimal;

public class TekuciRacun extends Racun {
    private static final BigDecimal KAMATNA_STOPA = new BigDecimal("0.001");

    public TekuciRacun(String brojRacuna, BigDecimal stanje, String vlasnik) {
        super(brojRacuna, stanje, vlasnik);
    }

    public void obracunKamate() {
        BigDecimal kamata = getStanje().multiply(KAMATNA_STOPA);
        BigDecimal novoStanje = getStanje().add(kamata);
        System.out.println("Tekući račun: " + getBrojRacuna() + ", obračunata kamata: " + kamata);
        System.out.println("Novo stanje tekućeg računa: " + novoStanje);
    }
}




