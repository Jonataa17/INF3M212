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
public class VetorNotasEscolares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);

        System.out.println(" -- Notas Escolares -- ");
        System.out.print("Quantas nota deseja inserir: ");
        int nNotas = (int) leiaFloat();

        float notas[] = new float[nNotas + 1];

        for (int i = 0; i < nNotas; i++) {
            do {
                System.out.print("Informe a " + (i + 1) + "ª nota: ");
                notas[i] = leiaFloat();
                if (validaNota(notas[i])) {
                    System.out.println("Nota Invalida, tente novamente!");
                }
            } while (validaNota(notas[i]));
            // || significa ou

            notas[nNotas] += notas[i];
        }
        notas[nNotas] = notas[nNotas] / nNotas;
        System.out.printf("Sua media foi de %.2f", notas[nNotas]);

        if (notas[nNotas] >= 7) {
            System.out.println(" Voce foi aprovado");
        } else {
            System.out.println(" Voce foi reprovado");
        }

    }

    /**
     * Função validaNota serve para validar notas q estejam fora do intervalo de
     * 0 - 10
     *
     * @param nota
     * @return
     */
    public static boolean validaNota(float nota) {
        // boolean é verdadeiro ou falso
        return (nota < 0 || nota > 10);

    }

    public static float leiaFloat() {
        Scanner leia = new Scanner(System.in);
        try {
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.print("Valor não é um número. Tente novamente: ");
            return leiaFloat();
        }
    }

}
