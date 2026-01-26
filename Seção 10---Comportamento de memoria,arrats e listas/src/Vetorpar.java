import java.util.Locale;
import java.util.Scanner;

public class Vetorpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
		// seguida, mostre na
		// tela todos os números pares, e também a quantidade de números pares.

		Locale.setDefault(Locale.US);

		Scanner sc;
		sc = new Scanner(System.in);

		System.out.println("quantos numeros serão digitados? ");
		int n = sc.nextInt();

		int vetor[] = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("digite um numero: ");
			vetor[i] = sc.nextInt();

		}
		int qtdPares = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				qtdPares++;
				System.out.printf("o numero é %d par%n", vetor[i]);
			}
		}

		System.out.println("quantidade de numeros pares: " + qtdPares);

		sc.close();

	}

}
