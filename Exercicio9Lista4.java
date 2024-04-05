
package exercicio9lista4;

import java.util.Scanner;


public class Exercicio9Lista4 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano;
        double A;
        double B;
        String Aformat;
        String Bformat;

        ano = 0;
        A = 5000000;
        B = 7000000;

        while( A <= B){
            A = A * 1.03;
            B = B * 1.02;
            ano++;
        }

        Aformat = String.format("%.3f", A / 1000000);
        Bformat = String.format("%.3f", B / 1000000);

        System.out.println("A cidade A passou a B quando chegou em: " + ano + " anos");
        System.out.println("O número de habitantes na cidade A é de: " + Aformat  + " milhões");
        System.out.println("O número de habitantes na cidade B é de: " + Bformat  + " milhões");
        sc.close();
    }
    
}
