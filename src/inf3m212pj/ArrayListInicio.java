/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 182120038
 */
public class ArrayListInicio {

    /**
     * @param args the command line arguments
     */
    static ArrayList<String> nomes = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic herestatic ArrayList<String> nomes = new ArrayList<>();
        Scanner leia = new Scanner(System.in);

        System.out.println("Tamanho do array: " + nomes.size());

        System.out.println("ArrayList vazio: ");
        System.out.println(nomes.isEmpty());

        nomes.add("jonata");

        System.out.println("Tamanho do array: " + nomes.size());

        System.out.print("Digite um nome: ");
        nomes.add(leia.next());

        nomes.add(0, "jubileu");
        nomes.add(3, "kiara");
        nomes.remove("jubileu");

        System.out.println("Tamanho do array: " + nomes.size());

        System.out.println(nomes.toString());

        System.out.println("Impressão do Array -- ");
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);

        }
        System.out.print("ArrayList vazio: ");
        System.out.print(nomes.isEmpty());
        System.out.println("Indice da kiara é: "+ nomes.indexOf("kiara"));
        
        System.out.println("Ordenação de Array -- ");
        nomes.add("doug");
        nomes.add("tania");
        nomes.add("elvis");
        nomes.add("stark");
        nomes.add("cap");
        
        System.out.println("Sem ordenação: "+nomes.toString());
        
        Collections.sort(nomes);
        System.out.println("Ordenado: "+nomes.toString());
        
        Collections.reverse(nomes);
        System.out.println("Ordem Inversa: "+nomes.toString());

    }

}
