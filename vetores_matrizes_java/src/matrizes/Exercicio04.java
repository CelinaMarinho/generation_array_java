package matrizes;

import java.util.Scanner;

public class Exercicio04 {
          /*Elaborar um algoritmo em Java que leia as notas de uma classe com 10 participantes durante 4 bim. de um ano. 
            As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de num reais;
            Todos os elementos da Diagonal Secundária;
            Em um vetor de números reais, armazenar as médias de cada participante;
            Exibir as médias de cada um na tela*/

	public static void main(String[] args) {
		   double[][] notas = new double[10][4];                 // é a matriz
	        double[] medias = new double[10];                    // é o vetor
	        int i, j;
	        Scanner entrada = new Scanner(System.in);
	        
	        for ( i = 0; i < 10; i++) {
	            System.out.println("Por favor, digite as notas da pessoa participante " + (i + 1) + ":");    // i- linha, j-coluna
	            for (j = 0; j < 4; j++) {
	                System.out.print("Nota " + (j + 1) + ": ");
	                notas[i][j] = entrada.nextDouble();
	            }
	            
	            medias[i] = (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3]) / 4;
	        }
	     
	        System.out.println("Médias das pessoas participantes:");
	        for ( i = 0; i < 10; i++) {
	            System.out.println("Participante " + (i + 1) + ": " + medias[i]);
	        }
	    }
	}