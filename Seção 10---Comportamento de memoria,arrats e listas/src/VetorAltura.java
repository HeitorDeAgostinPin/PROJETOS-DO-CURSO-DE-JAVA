import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class VetorAltura {

	public static void main(String[] args) {
		// Fazer umprogramapara ler umnúmero inteiroNeaalturadeN
		// pessoas.ArmazeneasNalturasemumvetor.Emseguida,mostrara
		// alturamédiadessaspessoas
		// TIPO VALOR || TIPO PRIMITIVO
		Scanner sc;
		sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = sc.nextInt();
		double[] vetor = new double[n];// estrutura padão para criar um vetor

		for (int i = 0; i < n; i++) {
			vetor[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma = soma + vetor[i];
		}

		double media = soma / n;

		System.out.printf("media das alturas : %.2f%n", media);

		sc.close();

	}

}
