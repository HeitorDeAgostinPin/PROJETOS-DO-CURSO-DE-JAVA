import java.util.Locale;
import java.util.Scanner;

public class VetorAbaixoDaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fazer um programa para ler um número inteiro N e depois um vetor de N números
		// reais. Em seguida,
		// mostrar na tela a média aritmética de todos elementos com três casas
		// decimais. Depois mostrar todos
		// os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int i;

		System.out.println("Quantos elementos vai ter o vetor? ");
		int tamanho = sc.nextInt();

		double vetor[] = new double[tamanho];

		for (i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}

		double soma = 0.0;

		for (i = 0; i < vetor.length; i++) {
			soma += vetor[i];

		}
		double media = soma / 2;
		System.out.printf("a media dos valores é de:%.3f%n", media);

		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.printf("numeros abaixo estão abaixo da media %n");
				System.out.println(vetor[i]);
			}
		}

		sc.close();
	}

}
