import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class ArrayPessoas {

	public static void main(String[] args) {
		// Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		// exemplo. Depois, mostrar na
		// tela a altura média das pessoas, e mostrar também a porcentagem de pessoas
		// com menos de 16 anos,
		// bem como os nomes dessas pessoas caso houver.

		Locale.setDefault(Locale.US);

		Scanner sc;
		sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();

		String nome[] = new String[n];
		int idade[] = new int[n];
		double altura[] = new double[n];

		for (int i = 0; i < altura.length; i++) {
			System.out.println("dados da " + i + 1 + "a pessoa");

			System.out.print("nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();

			System.out.print("idade: ");
			idade[i] = sc.nextInt();

			System.out.print("altura: ");
			altura[i] = sc.nextDouble();
		}

		double soma = 0;

		for (int i = 0; i < n; i++) {
			soma = soma + altura[i];
		}

		double media = soma / n;

		System.out.printf("Altura média = %.2f%n", media);

		int menores = 0;

		for (int i = 0; i < idade.length; i++) {
			if (idade[i] < 16) {
				menores++;
			}
		}

		double porcentgem = (menores * 100.0) / n;

		System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.1f%%%n", porcentgem);

		for (int i = 0; i < idade.length; i++) {
			if (idade[i] < 16) {
				System.out.println("Pessoas com menos de 16 anos: " + idade[i]);
			}
		}
		System.out.println(nome);
		sc.close();
	}

}
