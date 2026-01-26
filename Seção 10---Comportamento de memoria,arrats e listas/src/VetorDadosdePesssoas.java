import java.util.Locale;
import java.util.Scanner;

public class VetorDadosdePesssoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
		// Fazer um programa
		// que calcule e escreva a maior e a menor altura do grupo, a média de altura
		// das mulheres, e o número
		// de homens.

		Scanner sc;
		sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		System.out.println("Quantas pessoas serao digitadas? ");

		int tamanho = sc.nextInt();

		double vetorAltura[] = new double[tamanho];
		char vetorGenero[] = new char[tamanho];

		int i;
		for (i = 0; i < vetorAltura.length; i++) {
			System.out.println("modelo dos dados: altura em metros e" + " duas casa decimais e genero aprnas com um"
					+ " caracter sendo Feminino representado por F  " + "e masculino por M");

			System.out.printf("Altura da %dª pessoa: ", i + 1);
			vetorAltura[i] = sc.nextDouble();

			System.out.printf("Gênero da %dª pessoa (M/F): ", i + 1);
			vetorGenero[i] = sc.next().charAt(0);

		}

		double maiorAltura = vetorAltura[0];
		double menorAltura = vetorAltura[0];

		for (i = 0; i < vetorAltura.length; i++) {
			if (vetorAltura[i] > maiorAltura) {
				maiorAltura = vetorAltura[i];

			} else if (vetorAltura[i] < menorAltura) {
				menorAltura = vetorAltura[i];
			}

		}

		System.out.printf("Maior Altura: %.2f%n", maiorAltura);
		System.out.printf("Menor Altura: %.2f%n", menorAltura);

		int mulheres = 0;
		int homens = 0;
		double somaAlturaMulheres = 0.0;
		double somaAlturasHomens = 0.0;

		for (i = 0; i < vetorAltura.length; i++) {
			if (vetorGenero[i] == 'F' || vetorGenero[i] == 'f') {
				somaAlturaMulheres = somaAlturaMulheres + vetorAltura[i];
				mulheres++;
			} else if (vetorGenero[i] == 'M' || vetorGenero[i] == 'm') {
				somaAlturasHomens = somaAlturasHomens + vetorAltura[i];
			}
		}

		// Calcula média de altura das mulheres
		double mediaAlturaMulheres = mulheres > 0 ? somaAlturaMulheres / mulheres : 0.0;

		// Conta número de homens
		for (i = 0; i < vetorGenero.length; i++) {
			if (vetorGenero[i] == 'M' || vetorGenero[i] == 'm') {
				homens++;
			}
		}

		// Exibe os resultados finais
		System.out.printf("Media de altura das mulheres: %.2f%n", mediaAlturaMulheres);
		System.out.printf("Numero de homens: %d%n", homens);

		sc.close();

	}

}
