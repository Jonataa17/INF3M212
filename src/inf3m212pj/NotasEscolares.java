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
public class NotasEscolares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nota1, nota2, nota3, media;
        Scanner leia = new Scanner(System.in);

        System.out.println(" -- Notas Escolares -- ");
        System.out.print("Informe a 1ª nota: ");
        nota1 = leia.nextFloat();

        System.out.print("Informe a 2ª nota: ");
        nota2 = leia.nextFloat();

        System.out.print("Informe a 3ª nota: ");
        nota3 = leia.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Sua média foi de " + media + ". E você esta APROVADO!");
        } else {
            System.out.println("Sua meédia foi de " + media + ". E você esta REPROVADO!");
        }

    }

}
