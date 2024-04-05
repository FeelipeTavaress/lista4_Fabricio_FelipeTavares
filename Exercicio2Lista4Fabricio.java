
package exercicio2lista4fabricio;

import java.util.Scanner;

public class Exercicio2Lista4Fabricio {

   
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        double numero, numeroQuadrado, numeroCubo, numeroRaiz;

        System.out.println("Digite os números a seguir: ");

        while (true) {
            numero = sc.nextInt();

            if(numero == 0 || numero < 0 ){
                break;
            } else{
                System.out.println("O número é: " + numero);
                numeroQuadrado = numero * numero;
                System.out.println("O quadrado do número é: " + numeroQuadrado);
                numeroCubo = numero * numero * numero;
                System.out.println("O cubo do número é: " + numeroCubo);
                numeroRaiz = Math.sqrt(numero);
                System.out.println("A raiz do número é: " + numeroRaiz);
            }
        }
        sc.close();
    }
    
}
