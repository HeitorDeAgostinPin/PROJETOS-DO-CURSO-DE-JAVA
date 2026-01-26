import java.util.Scanner;

public class While_Soma_De_N_Positivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int numero;

		System.out.print("Digite um número (negativo para sair): ");
		numero = sc.nextInt();

		while (numero >= 0) {
			soma += numero;
			System.out.print("Digite outro número (negativo para sair): ");
			numero = sc.nextInt();
		}
		System.out.printf("A soma dos números positivos é: %d%n", soma);
		sc.close();
	}

}
