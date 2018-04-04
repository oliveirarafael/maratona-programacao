import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        while(entrada.hasNext()){
            int valor1 = entrada.nextInt();
            int valor2 = entrada.nextInt();

            int prod = valor1*valor2;

            System.out.println("PROD = "+prod);
        }
    }

}