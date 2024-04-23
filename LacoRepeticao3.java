package atividade3java;

import java.util.Scanner;

public class LacoRepeticao3 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo em Java, que leia a idade de várias pessoas
		 * (números inteiros), via teclado e mostre na tela o total de pessoas 
		 * cuja idade seja menor que 21 anos e o total de pessoas cuja idade 
		 * seja maior que 50 anos. A leitura dos dados deve ser finalizada ao 
		 * digitar uma idade negativa.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int idadeMenor = 0, idadeMaior = 0, idade = 0;
		
		while (idade >= 0) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade > 0) {
				idadeMenor++;
			} else if (idade > 50) {
				idadeMaior++;
			}
	
		}
		
		System.out.println("Total de Idades maiores que 50 \n"+idadeMaior);
		System.out.println("Total de Idades menores que 21 \n"+idadeMenor);

	}

}
