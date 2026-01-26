package basico;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		metodo2();
		System.out.println("FIM");
	}

	public static void metodo1() {
		System.out.println("metodo 1 INICIO");
		metodo2();
		System.out.println("metodo 1 FIM");

	}

	public static void metodo2() {
		System.out.println("metodo 2 inicio");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vetor = sc.nextLine().split("");// split separa pelo espaço vazio usando o ""
			int posicao = sc.nextInt();
			System.out.println(vetor[posicao]);
		} catch (ArrayIndexOutOfBoundsException e) {// pra posições que não existem no array
			System.out.println("posição invalida");
			e.printStackTrace();// mostra onde deu exceção
			sc.next();
		} catch (InputMismatchException e) {// dado de entrada diferente do requerido
			System.out.println("dado de entrado errado");

			System.out.println("metodo 2 fim");

			sc.close();
		} finally {
			System.out.println("Aqui ó u finally");
		}
	}
}
