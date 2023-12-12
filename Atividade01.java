package modulo11;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}, numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		for(int indice = 0; indice < 10; indice++) {
			if (vetorInteiros[indice] == numero) { 
				System.out.println("O número " + numero + " está na posição " + indice);
			}else;
				System.out.println("O número " + numero + " não foi encontrado"); 
				

	}
	}
}
