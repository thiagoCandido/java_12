package controle;

import java.util.Scanner;

public class ExercicioFinal01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número.");
		int numero = entrada.nextInt();
		
		if ((numero % 2 == 0) && (numero >= 0) && (numero <= 10))  {
			System.out.println("Número ok");
			}
		else
			System.out.println("Número NOK");
		
	}

}
