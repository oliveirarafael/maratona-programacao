
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private final static BigDecimal N = new BigDecimal("3.14159");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            BigDecimal raio = new BigDecimal(scanner.next()).setScale(2, BigDecimal.ROUND_HALF_UP);
            raio = raio.pow(2);

            BigDecimal area = raio.multiply(N);

            System.out.println("A="+area.setScale(4, BigDecimal.ROUND_HALF_UP));
        }
        scanner.close();
    }

}