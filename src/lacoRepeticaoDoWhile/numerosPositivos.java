package lacoRepeticaoDoWhile;

import java.util.Scanner;

public class numerosPositivos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		
		do {			
		     System.out.println("Digite somente números inteiros (para PARAR digite 0)");
		     numero = leia.nextInt();
		     
		     if (numero > 0) {
		    	 soma += numero;
		     }
		
		} while (numero != 0);
		
		System.out.println("A soma dos números digitados é:  " + soma);
		
		leia.close();
		
	}
}

		
		