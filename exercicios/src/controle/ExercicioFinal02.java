package controle;

import java.util.Scanner;

public class ExercicioFinal02 {
	
	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o ano atual");
		int ano = entrada.nextInt();
		
		if (ano > 0) {
			if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
				System.out.println("O ano " + ano + " � bissexto");
			}
			else 
				System.out.println("O ano " + ano + " n�o � bissexto");
		}
		else
			System.out.println("N�o � um ano v�lido");
	}

}
