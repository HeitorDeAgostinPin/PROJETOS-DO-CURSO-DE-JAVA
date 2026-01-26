import java.util.Locale;
import java.util.Scanner;

public class ArraysSomados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em
		// seguida, gere um
		// terceiro vetor C onde cada elemento de C é a soma dos elementos
		// correspondentes de A e B. Imprima
		// o vetor C gerado.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("informe o tamho dos arrays: ");
		int tamanho = sc.nextInt();

		int vetorA[] = new int[tamanho];
		int vetorB[] = new int[tamanho];

		int vetorC[] = new int[tamanho];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um numero: ");
			vetorA[i] = sc.nextInt();
		}

		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Digite um numero: ");
			vetorB[i] = sc.nextInt();
		}

		for (int i = 0; i < tamanho; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}

		System.out.println("vetor C:%n");
		for (int i = 0; i < tamanho; i++) {
			System.out.println(vetorC[i]);
		}

	}

}
