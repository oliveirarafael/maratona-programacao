import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        while (entradas.hasNext()) {
            String nomeVendedor = entradas.next();
            BigDecimal salarioFixo = entradas.nextBigDecimal();
            BigDecimal totalVendas = entradas.nextBigDecimal();

            //Comissão é 15% do total de vendas
            BigDecimal comissao = totalVendas.multiply(new BigDecimal("0.15"));

            BigDecimal total = salarioFixo.add(comissao);

            System.out.println("TOTAL = R$ "+total.setScale(2, BigDecimal.ROUND_HALF_EVEN));
        }
    }

}