package lista1;

import java.util.Scanner;

public class Ex4_idades {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int [] idade = new int [10];
		String [] nome = new String[10];
		
		int soma = 0;
		int maioridade, menoridade;
		String maiornome, menornome;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite nome: ");
			nome[i] = teclado.next();
			System.out.println("Digite idade: ");
			idade[i] = teclado.nextInt();	
			
			soma = soma + idade[i];
		}
		
		maioridade = idade[1];
		menoridade = idade [1];
		maiornome = nome[1];
		menornome = nome[1];
		
		for (int i = 0; i < 10; i++) {	
			if (maioridade < idade[i]){
				
				maioridade = idade[i];
				maiornome = nome[i];
			}
			
			if(menoridade > idade[i]){
				
				menoridade = idade[i];
				menornome = nome[i];
			}
			
		}

		int media = soma / idade.length;
		
		System.out.println("Mais velho: " + maiornome + ". Sua idade é: " + maioridade);
		System.out.println("Mais novo: " + menornome + ". Sua idade é: " + menoridade);
		System.out.println("Média de idade: " + media);
	}

}
