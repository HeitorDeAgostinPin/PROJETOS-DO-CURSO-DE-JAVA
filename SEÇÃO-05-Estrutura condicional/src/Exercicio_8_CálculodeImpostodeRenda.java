import java.util.Scanner;

public class Exercicio_8_CálculodeImpostodeRenda {
//Cálculo de Imposto de Renda – Determinar o imposto a ser pago com base no salário.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em
		 * pagar seus impostos, pois sabem que nele não existem políticos corruptos e os
		 * recursos arrecadados são utilizados em benefício da população, sem qualquer
		 * desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		 * 
		 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa
		 * de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de
		 * Imposto de Renda, segundo a tabela abaixo.
		 * 
		 * Tabela de Imposto de Renda:
		 * 
		 * | Renda | Imposto de Renda | |----------------------------
		 * |------------------| | de R$ 0.00 a R$ 2000.00 | Isento | | de R$ 2000.01 até
		 * R$ 3000.00 | 8% | | de R$ 3000.01 até R$ 4500.00 | 18% | | acima de R$
		 * 4500.00 | 28% |
		 * 
		 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas
		 * sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00
		 * é isenta de Imposto de Renda. No exemplo fornecido, a taxa é de 8% sobre R$
		 * 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve
		 * ser impresso com duas casas decimais.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o seu salario para a receita federal para ser taxado : ");
		double salario = sc.nextDouble();
		double taxa;

		if (salario > 0.00 && salario < 2000.00) {
			System.out.println("Sorte a sua , voce esta insento de impostos");
		} else if (salario > 2000.01 && salario < 3000.00) {
			taxa = salario * 0.08;
			System.out.printf("Os impostos sobre seu salario sera deR$ %.2f%n reais", taxa);
		} else if (salario > 3000.01 && salario < 4500.00) {
			taxa = salario * 0.18;
			System.out.printf("Os impostos sobre seu salario sera deR$ %.2f%n reais", taxa);
		} else {
			taxa = salario * 0.28;
			System.out.printf("Os impostos sobre seu salario sera deR$ %.2f%n reais", taxa);
		}
		sc.close();
	}

}
