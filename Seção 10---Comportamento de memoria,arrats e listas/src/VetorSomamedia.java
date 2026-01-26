import java.util.Locale;
import java.util.Scanner;

public class VetorSomamedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faça um programa que leia N números reais e armazene-os em um vetor.
		// Em seguida: - Imprimir todos os elementos do vetor
		// - Mostrar na tela a soma e a média dos elementos do vetor

		Scanner sc;
		sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = sc.nextInt();
		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
		}

		System.out.println("valores: " + vetor);

		double soma = 0.0;
		double media = soma / n;

		for (int i = 0; i < n; i++) {
			soma = soma + vetor[i];
		}

		System.out.println("numeros" + vetor + ",soma" + soma + ",media" + media);

		sc.close();
	}

}
