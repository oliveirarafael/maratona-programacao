import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner entradas = new Scanner(System.in);

         while(entradas.hasNext()){
             int a = entradas.nextInt();
             int b = entradas.nextInt();
             int c = entradas.nextInt();
             int d = entradas.nextInt();

             int diferenca = (a * b - c * d);

             System.out.println("DIFERENCA = "+diferenca);
         }      
    }
    
}