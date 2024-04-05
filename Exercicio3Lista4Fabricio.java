
package exercicio3lista4fabricio;

import java.util.Scanner;

public class Exercicio3Lista4Fabricio {

  
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        double idade; 
        double altura;
        double peso;
        double pessoas;
        double idade50;
        double mediaALtura10e20; 
        double mediaAltura;
        double pessoas40; 
        double porcentagemPeso40;
        
        int quantidade10entre20;

        mediaALtura10e20 = 0;

        pessoas40 = 0;

        quantidade10entre20 = 0;

        idade50 = 0;

        pessoas = 0;

        while (pessoas < 11){

            System.out.println("Informe sua idade: ");
            idade = sc.nextDouble();

            System.out.println("Informe sua altura: ");
            altura = sc.nextDouble();

            System.out.println("Informe seu peso: ");
            peso = sc.nextDouble();

            pessoas ++;

            if (idade > 50){
                idade50 = idade50 + 1;
            }
            if (idade >= 10 && idade <= 20){
                mediaALtura10e20 += altura;
                quantidade10entre20++;
            }
            if (peso < 40){
                pessoas40 ++;
            }
        }
        mediaAltura = mediaALtura10e20 / quantidade10entre20;

        porcentagemPeso40 = pessoas40 * 10;

        System.out.println("O número de pessoas com idade superior á 50 é: " + idade50);
        System.out.println("A média das alturas das pessoas com idade entre 10 e 20 anos é: " + mediaAltura);
        System.out.println("a porcentagem de pessoas com peso inferior a 40 quilos é: " + porcentagemPeso40 + "%");

        sc.close();   
    }
    
}
