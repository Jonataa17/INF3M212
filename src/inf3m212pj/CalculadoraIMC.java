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
public class CalculadoraIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leia = new Scanner(System.in);
        double altura, peso, imc;

        System.out.println(" -- Calculadora de IMC -- ");
        System.out.print("Informe o seu peso: ");
        peso = leia.nextDouble();

        System.out.print("Informe a sua altura: ");
        altura = leia.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é de: %.2f", imc);

        if (imc <= 18.5) {
            System.out.println("\nClassificação: Magreza");
        } else if (imc <= 24.9) {
            System.out.println("\nClassificação: Normal");
        } else if (imc <= 29.9) {
            System.out.println("\nClassificação: Sobrepeso");
        } else if (imc <= 39.9) {
            System.out.println("\nClassificação: Obesidade");
        } else {
            System.out.println("\nClassificação: Obesidade Grave");
        }

    }

}
