import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (entrada.hasNext()) {
            BigDecimal nota1 = entrada.nextBigDecimal().setScale(1, BigDecimal.ROUND_HALF_UP);
            BigDecimal nota2 = entrada.nextBigDecimal().setScale(1, BigDecimal.ROUND_HALF_UP);

            if ((nota1.doubleValue() >= 0.0 && nota2.doubleValue() >= 0.0)
                    && (nota1.doubleValue() <= 10.0 && nota2.doubleValue() <= 10.0)) {

                BigDecimal nota1MaisPeso = nota1.multiply(new BigDecimal("3.5"));
                BigDecimal nota2maisPeso = nota2.multiply(new BigDecimal("7.5"));
                BigDecimal somaDaNotas = nota1MaisPeso.add(nota2maisPeso);

                //o numero 11 representa a soma dos pesos da nota, sendo a nota 1 peso 3.5 e a nota 2 peso 7.5
                BigDecimal media = somaDaNotas.divide(new BigDecimal("11"), 5, BigDecimal.ROUND_HALF_UP);

                System.out.println("MEDIA = " + media);
            }

        }
        entrada.close();
    }

}