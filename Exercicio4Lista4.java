
package exercicio4lista4;

import java.util.Scanner;


public class Exercicio4Lista4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Totalkills;
        int assistTotal; 
        int deathsTotal;
        int kills;
        int assists; 
        int deaths;
        char resposta;

        Totalkills = 0;
        assistTotal = 0;
        deathsTotal = 0;

        while (true){
            System.out.println("Digite o número de kills: ");
            kills = sc.nextInt();
            Totalkills += kills;

            System.out.println("Digite o número de assists: ");
            assists = sc.nextInt();
            assistTotal += assists;

            System.out.println("Digite o número de deaths: ");
            deaths = sc.nextInt();
            deathsTotal += deaths;

            if (Totalkills <= 5){
                System.out.println("Noob!");
            } else if (Totalkills >= 20){
                System.out.println(" Master!");
            }
            if (deathsTotal >= 20){
                System.out.println("Houston, we have a problem");
            }
            if (assistTotal >= 20){
                System.out.println("Team Work!");
            }
            System.out.println("Existe um vencedor (s/n)?");
            resposta = sc.next().charAt(0);
            if (resposta == 's' || resposta == 'S') {
                break;
            }
        }
        sc.close();
    }
    
}
