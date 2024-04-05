
package exercicio10lista4;

import java.util.Scanner;


public class Exercicio10Lista4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fichas;
        int matricula1; 
        int matricula2;
        int matricula;
        double nota1;
        double nota2;
        double nota;

        nota1 = -1;
        nota2 = -1;
        nota = 0;
        matricula1 = 0;
        matricula2 = 0;
        matricula = 0;
        fichas = 5;

        for(int i = 1; i <= fichas; i++){
            System.out.print("Digite a matrícula do Aluno " + i + ":");
            matricula = sc.nextInt();

            System.out.print("Digite a nota do Aluno " + i + ":");
            nota = sc.nextDouble();

            if(nota > nota1){
                nota2 = nota1;
                matricula2 = matricula1;
                nota1 = nota;
                matricula1 = matricula; 
            } else if ( nota > nota2){
                nota2 = nota;
                matricula2 = matricula;
            }
        }
        System.out.println("A maior nota é " + nota1 + ", obtida pelo aluno de matrícula " + matricula1);
        System.out.println("A segunda maior nota é " + nota2 + ", obtida pelo aluno de matrícula " + matricula2);
        sc.close();
    }
    
}
