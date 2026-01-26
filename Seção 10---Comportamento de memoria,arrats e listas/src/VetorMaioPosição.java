import java.util.Locale;
import java.util.Scanner;

public class VetorMaioPosição {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faça um programa que leia N números reais e armazene-os em um vetor. Em
		// seguida, mostrar na tela
		// o maior número do vetor (supor não haver empates). Mostrar também a posição
		// do maior elemento,
		// considerando a primeira posição como 0 (zero).

		Locale.setDefault(Locale.US);

		Scanner sc;
		sc = new Scanner(System.in);

		System.out.println("qauntos numeros serão digitados ?");
		int n = sc.nextInt();

		double vetor[] = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Didite um numero: %n");
			vetor[i] = sc.nextDouble();
		}

		double maior = vetor[0];// assume que o primeiro é o maior
		int posicao = 0; // posição inicial

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i]; // atualiza o maior
				posicao = i; // atualiza a posição

			}
		}

		System.out.printf("O Maior valor é :%.2f%n", maior);
		System.out.println("Posição: " + posicao);

		sc.close();

	}

}
