
package exercicio11lista4;

import java.util.Scanner;


public class Exercicio11Lista4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double massa;
        double massaFinal;
        double tempoEmSegundos;
        double  tempo;

        massaFinal = 0.10;

        System.out.println("Digite a massa do objeto (em gramas): ");
        massa = sc.nextDouble();

        for (tempo = 0; massa >= massaFinal; tempo++){
            massa *= 0.75;
        }
        tempoEmSegundos = tempo * 30;
        System.out.println("O tempo necessário para a massa ser reduzida até ser menor que 0.10 gramas foi: " + tempoEmSegundos);

        sc.close();
    }
    
}
