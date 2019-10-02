package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o primeiro sal�rio:");
		String valor01 = entrada.next().replace(",", ".");
		System.out.println("Informe o segundo sal�rio:");
		String valor02 = entrada.next().replace(",", ".");
		System.out.println("Informe o terceiro sal�rio:");
		String valor03 = entrada.next().replace(",", ".");

		double salario01 = Double.parseDouble(valor01);
		double salario02 = Double.parseDouble(valor02);
		double salario03 = Double.parseDouble(valor03);
		
		double media = (salario01 + salario02 + salario03) / 3;
		
		System.out.println("A m�dia dos sal�rios �: R$ " + media);
		
		entrada.close();
	}

}
