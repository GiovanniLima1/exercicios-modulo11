package modulo11;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		
		int vetorInteiros[] = new int[10], soma = 0, media = 0;
	
		//ATIVIDADE02
		
		Scanner leia = new Scanner(System.in);
		
		for(int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1)  + "° número: ");
			vetorInteiros[indice] = leia.nextInt();
			soma = soma + vetorInteiros[indice];
			}
		
		
		System.out.print("Elementos nos índices impares: ");
		for(int indice = 0; indice < 10; indice++) {
			if (indice % 2 == 1){
				System.out.print(vetorInteiros[indice]+" ");
			}	
		}
		System.out.println(" ");
		System.out.print("Elementos pares: ");
		for(int indice = 0; indice < 10; indice++) {
			if (vetorInteiros[indice] % 2 == 0){
				System.out.print(vetorInteiros[indice]+" ");
			}	
		}
		System.out.println(" ");
		System.out.print("Soma: " + soma);
		System.out.println(" ");
		System.out.print("Media: " + soma / 10);

	}

}
