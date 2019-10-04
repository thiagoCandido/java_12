package controle;

import java.util.Scanner;

public class ExercicioFinal03 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a 1a nota:");
		double nota01 = entrada.nextDouble();
		System.out.println("Digite a 2a nota:");
		double nota02 = entrada.nextDouble();
		
		double media = (nota01 + nota02) / 2;
		
		if (media >= 7) {
			System.out.println("Aprovado!");
		}else if (media >= 4 && media < 7) {
			System.out.println("Recuperação");
		} else
			System.out.println("Reprovado");
	}

}
