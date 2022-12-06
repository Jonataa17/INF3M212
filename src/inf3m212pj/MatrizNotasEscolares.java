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
public class MatrizNotasEscolares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        System.out.println("-- Notas Escolares - Matriz --");
        System.out.print("Informe a quantidade de alunos: ");
        int nAlunos = (int) leiaFloat();
        System.out.print("Informe a quantidade de notas: ");
        int nNotas = (int) leiaFloat();

        String alunos[] = new String[nAlunos];
        float notas[][] = new float[nAlunos][nNotas + 1];

        for (int i = 0; i < nAlunos; i++) {
            System.out.print("Nome do aluno: ");
            alunos[i] = leia.next();
            for (int j = 0; j < nNotas; j++) {
                do {
                    System.out.print("\tDigite a " + (j + 1) + "ª nota: ");
                    notas[i][j] = leiaFloat();
                    if (validaNota(notas[i][j])) {
                        System.out.println("Nota invalida, tente novamente!");
                    }

                } while (validaNota(notas[i][j]));
                notas[i][nNotas] += notas[i][j];

            }//fim do for notas
            notas[i][nNotas] = notas[i][nNotas] / nNotas;
        }//fim do for alunos
        System.out.println("\n -- Resultado -- \n");
        for (int i = 0; i < nAlunos; i++) {
            System.out.printf(alunos[i] + " sua média foi de %.2f ", notas[i][nNotas]);
            if (notas[i][nNotas] >= 7) {
                System.out.println(". E você foi aprovado!");
            } else {
                System.out.println(". E infelizemente você foi reprovado!");
            }

        }

    }//fim do main

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

    }// fim do validaNota

    public static float leiaFloat() {
        Scanner leia = new Scanner(System.in);
        try {
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.print("Valor não é um número. Tente novamente: ");
            return leiaFloat();
        }
    }//fim do leiaFloat

}
