package vetores;

import java.util.Scanner;

public class Exercicio02 {
	
	/*Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor.Mostrar na tela:
	 Todos os elementos dos índices ímpares do vetor;
	 Todos os elementos do vetor que são números pares;
	 A Soma de todos os elementos do vetor;
	 A Média de todos os elementos do vetor, armazenada em uma variável do tipo real*/

	public static void main(String[] args) {
	    int[] vetor = new int[10]; int soma = 0, i;       
        double media;
        
        for ( i = 0; i < 10; i++) {
            System.out.print("Por favor, digite o " + (i+1) + "º número inteiro: ");  // a cada iteração, pega a posição do índice.
            vetor[i] = new Scanner(System.in).nextInt();
            soma += vetor[i];
        }
        
        System.out.print("\nOs elementos dos índices ímpares do vetor são: ");
        for (i = 1; i < 10; i += 2) {                                               //ímpar, ou seja, i=1 e soma 2
            System.out.print(vetor[i] +" ");
        }
        
        System.out.print("\nOs elementos pares do vetor são: ");
        for ( i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        
        media = soma / 10;
        System.out.println("\nA soma dos elementos do vetor é: " + soma);
        System.out.println("A média dos elementos do vetor é: " + media);
    }
}