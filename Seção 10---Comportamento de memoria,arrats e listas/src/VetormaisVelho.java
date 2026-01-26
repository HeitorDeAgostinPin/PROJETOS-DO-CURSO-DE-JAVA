import java.util.Locale;
import java.util.Scanner;

public class VetormaisVelho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Quantas pessoas voce vai digitar?");
		int tamanho = sc.nextInt();

		int i;
		String[] vetorNome = new String[tamanho];
		int vetorIdade[] = new int[tamanho];

		for (i = 0; i < vetorIdade.length; i++) {

			System.out.printf("dados da %da pessoa %n", i + 1);

			System.out.println("nome");
			vetorNome[i] = sc.next();

			System.out.println("idade");
			vetorIdade[i] = sc.nextInt();

		}

		double maior = vetorIdade[0];// assume que o primeiro é o maior
		int posicao = 0; // posição inicial

		for (i = 0; i < vetorIdade.length; i++) {
			if (vetorIdade[i] > maior) {
				maior = vetorIdade[i]; // atualiza o maior
				posicao = i; // atualiza a posição

			}
		}

		System.out.println();
		System.out.println("Pessoa mais velha: " + vetorNome[posicao] + " com " + vetorIdade[posicao] + " anos.");

		/*
		 * for(i = 0;i<vetorIdade.length;i++) { int pessoa= 1;
		 * 
		 * System.out.printf("dados da %da pessoa",pessoa); }
		 */

		sc.close();

	}

}
