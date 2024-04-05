
package exercicio8lista4fabricio;

import java.util.Scanner;


public class Exercicio8Lista4Fabricio {


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        double resultado;

        resultado = 0;

        System.out.println("Digite o primeiro fator na multiplicação: ");
        num1 = sc.nextDouble();

        System.out.println("Digite o segundo fator na multiplicação: ");
        num2 = sc.nextDouble();

        for (int i = 0; i < num2; i++){
            resultado += num1;
        }

        System.out.println("O resultado da multiplicação é: " + resultado);

        sc.close();
    }
    
}
