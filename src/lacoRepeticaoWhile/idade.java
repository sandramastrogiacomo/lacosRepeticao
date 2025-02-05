package lacoRepeticaoWhile;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int totalMenor21 = 0;
		int totalMaior50 = 0;
		int idade;
		
		while (true) {
			System.out.println("Digite a idade (para sair, digite um número negativo): ");
			idade = leia.nextInt();
			
			if (idade < 0) {
				break;
				
			}
			
			if (idade < 21) {
				totalMenor21++;
			} else if (idade > 50) {
				totalMaior50++;
			}
		}
             System.out.println("Total de pessoas com menos de 21 anos: " + totalMenor21);
             System.out.println("Total de pessoas com mais de 50 anos: " + totalMaior50);
             
             leia.close();
             
	}

}
