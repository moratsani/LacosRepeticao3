package atividade3java;

import java.util.Scanner;

public class LacoRepeticao1 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o
		 * primeiro número deve ser menor do que o segundo número. Caso contrário, deve
		 * ser exibida uma mensagem na tela informando que o intervalo é inválido e sair
		 * do programa. No intervalo informado, mostre na tela todes os números que são
		 * múltiplos de 3 e 5.
		 */
		Scanner leia = new Scanner(System.in);

		int n1, n2, i;

		System.out.println("Escreva o primeiro número: ");
		n1 = leia.nextInt();

		System.out.println("Escreva o segundo número: ");
		n2 = leia.nextInt();

		if (n1 > n2) {
			System.out.println("O intervalo é inválido!\nFim do programa!");
		} else {
			System.out.printf("No intervalo entre %d e %d: \n", n1, n2);

			for (i = n1; i <= n2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i);
				}
			}
		}
	}

}
