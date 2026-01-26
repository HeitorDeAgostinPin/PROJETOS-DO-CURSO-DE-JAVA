import java.util.Locale;
import java.util.Scanner;

public class VetorAprovados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
		// notas que eles tiraram
		// no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um
		// vetor. Depois, imprimir
		// os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das
		// notas seja maior ou
		// igual a 6.0 (seis).

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Quantos alunos serao digitados? ");
		int tamanho = sc.nextInt();
		int i;

		String[] vetorAluno = new String[tamanho];
		double vetorNota1[] = new double[tamanho];
		double vetorNota2[] = new double[tamanho];

		for (i = 0; i < vetorAluno.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", i + 1);
			System.out.println("nome: ");
			vetorAluno[i] = sc.next();
			System.out.println("nota 1: ");
			vetorNota1[i] = sc.nextDouble();
			System.out.println("nota 2: ");
			vetorNota2[i] = sc.nextDouble();

		}

		System.out.println("Alunos Aprovados:  ");

		for (i = 0; i < vetorAluno.length; i++) {
			double media = (vetorNota1[i] + vetorNota2[i]) / 2;
			if (media >= 6.0) {
				System.out.println(vetorAluno[i]);
				System.out.printf("com media de :%f", media);
			} else if (media < 6) {
				System.out.println("Alunos reprovados: ");
				System.out.println(vetorAluno[i]);
				System.out.printf("com media de :%f", media);
			}
		}

		sc.close();
	}

}
