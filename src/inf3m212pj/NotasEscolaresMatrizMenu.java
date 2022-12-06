/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.Scanner;

/**
 *
 * @author jbferraz
 */
public class NotasEscolaresMatrizMenu {
    //declaraçao global
    static String alunos[];
    static float notas[][];
    static int nAlunos, nNotas, contAlunos;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opM;
        System.out.println("Notas Escolares Matriz");
        System.out.print("Quantos alunos? ");
        nAlunos = (int) leiaFloat();
        System.out.print("Quantas notas? ");
        nNotas = (int) leiaFloat();

        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas + 1];
        //nNotas + 1 pra ter uma posição pra guardar a média

        do{
            menu();
            opM = (int) leiaFloat();
            switch(opM){// escolha do portugol
                case 1:
                    inserirAlunoNotas();
                    break;
                case 2:
                    imprimirAlunosNotas();
                    break;
                case 0:
                    System.out.println("Aplicação encerrada pelo usuário!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }//fim do switch
        }while(opM!=0);
        
    }//fim da main

    /**
     * Função validaNota serve para validar notas que estejam fora do intervalo
     * de 0 - 10.
     *
     * @param nota
     * @return
     */
    public static boolean validaNota(float nota) {
        return nota < 0 || nota > 10;// || significa ou
    }//fim validaNota

    public static float leiaFloat() {
        Scanner leia = new Scanner(System.in);
        try {
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.print("Valor não é núm., tente novamente: ");
            return leiaFloat();
        }
    }//fim leiaFloat()

    public static void menu() {
        System.out.println("1 - Inserir notas do Aluno");
        System.out.println("2 - Imprimir notas");
        System.out.println("0 - Sair");
        System.out.print("Digite aqui: ");
    }//fim menu
    
    public static void inserirAlunoNotas(){
        Scanner leia = new Scanner(System.in);
        if(contAlunos < nAlunos){
            System.out.print("Nome do aluno: ");
            alunos[contAlunos] = leia.next();
            for (int j = 0; j < nNotas; j++) {//percorre as notas
                do {
                    System.out.print("\tDigite a " + (j + 1) + "ª nota: ");
                    notas[contAlunos][j] = leiaFloat();
                    if (validaNota(notas[contAlunos][j])) {
                        System.out.println("Nota inválida, tente novamente!");
                    }
                } while (validaNota(notas[contAlunos][j]));
                notas[contAlunos][nNotas] += notas[contAlunos][j]; //acumula as notas
            }//fim for notas
            notas[contAlunos][nNotas] = notas[contAlunos][nNotas] / nNotas; //calc. média
            contAlunos++;
        }else{//fim if alunos
            System.out.println("Não é mais possível lançar notas."
                    + "\nTodas posições ocupadas.");
        }
    }//fim inserirAlunoNotas
    
    public static void imprimirAlunosNotas(){
        System.out.println("\n--- Resultado ---\n");
        for (int i = 0; i < contAlunos; i++) {//impressão no console
            System.out.printf(alunos[i] + " sua média foi de %.2f", notas[i][nNotas]);
            if (notas[i][nNotas] >= 7) {
                System.out.println(" e você aprovou!");
            } else {
                System.out.println(" e infelizmente você reprovou!");
            }
        }//fim for de saída no console
    }

}
