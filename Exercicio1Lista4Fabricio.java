
package exercicio1lista4fabricio;

import java.util.Scanner;


public class Exercicio1Lista4Fabricio {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, imparProduto, parSoma;

        parSoma = 0;
        imparProduto = 1; 

        System.out.println("Digite os números a serem somados e multiplicados(digitar 0 ira efetuar as operações): ");
        
        while (true) {
            numero = sc.nextInt();
            
            if (numero == 0) {
                break;
            } else if (numero % 2 == 0) {
                parSoma += numero;
            } else {
                imparProduto *= numero;
            }
        }

        System.out.println("A soma dos números pares é: " + parSoma);
        System.out.println("A soma dos números ímpares é: " + imparProduto);

        sc.close();
    }
    
}
