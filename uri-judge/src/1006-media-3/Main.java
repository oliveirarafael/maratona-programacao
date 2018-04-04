import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (entrada.hasNext()) {
            BigDecimal a = entrada.nextBigDecimal().setScale(1, BigDecimal.ROUND_HALF_UP);
            BigDecimal b = entrada.nextBigDecimal().setScale(1, BigDecimal.ROUND_HALF_UP);
            BigDecimal c = entrada.nextBigDecimal().setScale(1, BigDecimal.ROUND_HALF_UP);

            if ((a.doubleValue() >= 0.0 && b.doubleValue() >= 0.0 && c.doubleValue() >= 0.0)
                    && (a.doubleValue() <= 10.0 && b.doubleValue() <= 10.0 && c.doubleValue() <= 10.0)) {

                BigDecimal pesoA = new BigDecimal("2");
                BigDecimal pesoB = new BigDecimal("3");
                BigDecimal pesoC = new BigDecimal("5");

                BigDecimal aMaisPeso = a.multiply(pesoA);
                BigDecimal bmaisPeso = b.multiply(pesoB);
                BigDecimal cmaisPeso = c.multiply(pesoC);

                BigDecimal somaDasNotas = aMaisPeso.add(bmaisPeso).add(cmaisPeso);
                BigDecimal somaDosPesos = pesoA.add(pesoB).add(pesoC);

                BigDecimal media = somaDasNotas.divide(somaDosPesos, 1, BigDecimal.ROUND_HALF_UP);

                System.out.println("MEDIA = " + media);
            }

        }
        entrada.close();
    }

}