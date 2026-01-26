import java.util.Locale;
import java.util.Scanner;

public class VetorNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois
		// N números inteiros
		// e armazene-os em um vetor. Em seguida, mostrar na tela todos os números
		// negativos lidos.

		Scanner sc;
		sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = sc.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();

		}
		for (int i = 0; i < n; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}

		sc.close();
	}
}
