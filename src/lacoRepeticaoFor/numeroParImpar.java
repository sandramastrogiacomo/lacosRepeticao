package lacoRepeticaoFor;

import java.util.Scanner;

public class numeroParImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numerosPares = 0; 
		int numerosImpares = 0;
		
		System.out.println("Digite 10 números inteiros: ");
		
		for (int i = 0; i < 10; i++) {
		
			System.out.println("Número " + (i + 1) + " : ");
		    int numero = leia.nextInt();
		    
		    if (numero % 2 == 0) {
		    	numerosPares++;
		    }else {
		    	numerosImpares++;
		    }
		}

		    leia.close();
		    
		    System.out.println("Quantidade de números pares: " + numerosPares);
		    System.out.println("Quantidade de números impares: " + numerosImpares);
	}

}
