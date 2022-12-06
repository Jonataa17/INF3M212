/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.Scanner;

/**
 *
 * @author 182120038
 */
public class DiasdeVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        String nome;
        int idade, diasVida;

        System.out.println(" -- Calc. Dias de Vida -- ");
        System.out.print("Informe o seu nome: ");
        nome = leia.next();

        System.out.print("Informe sua idade: ");
        idade = leia.nextInt();

        //diasVida = idade * 365;
        diasVida = calcDias(idade);
        
        System.out.println(nome+ " você ja viveu "+diasVida+ " dias de vida.");
        
    }
    public static int calcDias(int old){
        return old * 365;
    }

}
