import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
      Scanner entradas = new Scanner(System.in);
      int contador = 0;
      BigDecimal[] valores = new BigDecimal[2];

      while(entradas.hasNext()){
              
         if(contador == 2){
             System.out.println("VALOR A PAGAR: R$ "+valores[0].add(valores[1])); 
             contador = 0;
             valores = new BigDecimal[2];
         }

        int codigoPeca = entradas.nextInt();
        String quantidadePecas = entradas.next();
        BigDecimal valorUnitario = entradas.nextBigDecimal();

        BigDecimal valor = valorUnitario.multiply(new BigDecimal(quantidadePecas));
        
        valores[contador] = valor;

         contador++;
      }

      System.out.println("VALOR A PAGAR: R$ "+valores[0].add(valores[1])); 

  }
    
}