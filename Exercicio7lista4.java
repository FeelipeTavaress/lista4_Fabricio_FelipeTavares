
package exercicio7lista4;

import java.util.Scanner;


public class Exercicio7lista4 {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        int coluna;
        int escolha;

        System.out.println("Digite o número de colunas que você quer na sua forma geométrica: ");
        coluna = sc.nextInt();  

        System.out.println("Escolha a sua forma geométrica: ");
        System.out.println("retângulo: 1 ,diagonal superior esquerda: 2, diagonal superior direita; 3, diagonal inferior esquerda: 4, diagonal inferior direita: 5");
        escolha = sc.nextInt();
        
        switch (escolha) {
            case 1:
                for(int i = 0; i < coluna; i++){
                    for(int j = 0; j < coluna; j++){
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                for(int i = 0; i < coluna; i++){
                    for(int j = 0; j < coluna; j++){
                        if (j >= i) {
                            System.out.print("* ");
                        }else{
                            System.out.print("");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                for(int i = 0; i < coluna; i++){
                    for(int j = 0; j < coluna; j++){
                        if (j >= i) {
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 4:
                for(int i = 0; i < coluna; i++){
                    for(int j = 0; j < coluna; j++){
                        if (j <= i) {
                            System.out.print("* ");
                        }else{
                            System.out.print("");
                        }
                    }
                    System.out.println();
                }
                break;
            case 5:
                for(int i = 0; i < coluna; i++){
                    for(int j = 0; j < coluna; j++){
                        if (j >= coluna - i - 1) {
                            System.out.print("* ");
                        }else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        sc.close();
    }
    
}
