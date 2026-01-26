import java.util.Locale;
import java.util.Scanner;

public class VetorMediaPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fazer um programa para ler um vetor de N números inteiros. Em seguida,
		// mostrar na tela a média
		// aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum
		// número par for
		// digitado, mostrar a mensagem "NENHUM NUMERO PAR"

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int i;
		int tamanho;
		System.out.println("Quantos elementos vai ter o vetor? ");
		tamanho = sc.nextInt();

		int vetor[] = new int[tamanho];

		for (i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero :  ");
			vetor[i] = sc.nextInt();
		}

		int soma = 0, contador = 0;

		for (int numero : vetor) {
			if (numero % 2 == 0) {
				soma = soma + numero;
				contador++;
			}
		}

		// int vetorPar[] = new int[contador];

		if (contador > 0) {
			double media = (double) soma / contador;

			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}

		sc.close();
	}

}
