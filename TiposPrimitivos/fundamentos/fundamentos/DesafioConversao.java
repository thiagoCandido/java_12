package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o primeiro salário:");
		String valor01 = entrada.next().replace(",", ".");
		System.out.println("Informe o segundo salário:");
		String valor02 = entrada.next().replace(",", ".");
		System.out.println("Informe o terceiro salário:");
		String valor03 = entrada.next().replace(",", ".");

		double salario01 = Double.parseDouble(valor01);
		double salario02 = Double.parseDouble(valor02);
		double salario03 = Double.parseDouble(valor03);
		
		double media = (salario01 + salario02 + salario03) / 3;
		
		System.out.println("A média dos salários é: R$ " + media);
		
		entrada.close();
	}

}
