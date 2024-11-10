
import java.math.BigDecimal;

    public class Main {
        public static void main(String[] args) {
            TekuciRacun tekuciRacun = new TekuciRacun("111", new BigDecimal("100.00"), "Marko Markovic");
            StedniRacun stedniRacun = new StedniRacun("222", new BigDecimal("100.00"), "Ivana Ivic");

            System.out.println("Početno stanje tekućeg računa: " + tekuciRacun.getStanje());
            System.out.println("Početno stanje štednog računa: " + stedniRacun.getStanje());
            tekuciRacun.uplata(new BigDecimal("1000.00"));
            tekuciRacun.isplata(new BigDecimal("200.00"));
            tekuciRacun.isplata(new BigDecimal("100.00"));
            tekuciRacun.isplata(new BigDecimal("50.00"));

            stedniRacun.uplata(new BigDecimal("500.00"));
            stedniRacun.isplata(new BigDecimal("200.00"));
            stedniRacun.isplata(new BigDecimal("100.00"));

            tekuciRacun.obracunKamate();
            stedniRacun.obracunKamate();
        }
    }





