package controle;

import java.util.Scanner;

public class ExercicioFinal01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um n�mero.");
		int numero = entrada.nextInt();
		
		if ((numero % 2 == 0) && (numero >= 0) && (numero <= 10))  {
			System.out.println("N�mero ok");
			}
		else
			System.out.println("N�mero NOK");
		
	}

}
