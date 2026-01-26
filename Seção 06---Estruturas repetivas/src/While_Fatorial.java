import java.util.Scanner;

public class While_Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número para calcular o fatorial: ");
		int n = sc.nextInt();
		int fatorial = 1;
		int contador = 1;

		while (contador <= n) {
			fatorial *= contador;
			contador++;
		}
		System.out.printf("O fatorial de %d é: %d%n", n, fatorial);
		sc.close();

	}

}
