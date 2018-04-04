import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        while (entradas.hasNext()) {
            int numeroFuncionario = entradas.nextInt();
            BigDecimal horasTrabalhadas = entradas.nextBigDecimal();
            BigDecimal valorHoraTrabalhadas = entradas.nextBigDecimal();

            BigDecimal salario = valorHoraTrabalhadas.multiply(horasTrabalhadas).setScale(2, BigDecimal.ROUND_HALF_UP);

            System.out.println("NUMBER = "+numeroFuncionario);
            System.out.println("SALARY = U$ "+salario);
        }
    }
}