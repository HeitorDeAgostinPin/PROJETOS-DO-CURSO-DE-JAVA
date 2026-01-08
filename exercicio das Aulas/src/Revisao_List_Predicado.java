import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate; // 🔧 COMPLETADO

public class Revisao_List_Predicado {

	public static void main(String[] args) 
	{
		/*Exercício proposto
		📌 Enunciado:
		Faça um programa que:
		Leia nomes de pessoas e armazene em uma lista.
		Use Predicate para remover todos os nomes menores que 5 caracteres ou por letra.
		Imprima a lista final.*/

		Scanner sc = new Scanner(System.in);

		List<String> nomes = new ArrayList<String>();

		System.out.println("Fale quantas pessoas serão digitadas: ");
		int a = sc.nextInt();
		sc.nextLine(); // consumir quebra de linha

		for (int i = 0; i < a; i++) {
			System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
			String nome = sc.nextLine();
			nomes.add(new String(nome));
		}

		System.out.println("\nLista de Nomes:");
		for (String nome : nomes) {
			System.out.println(nome);
		}

		System.out.println("\nInforme a letra que servirá de parâmetro para remoção dos nomes:");
		char letra = sc.next().charAt(0);

		// 🔧 COMPLETADO: Remoção usando Predicate
		nomes.removeIf(filtroRemovedor(letra));

		System.out.println("\nLista final após remoção:");
		for (String nome : nomes) {
			System.out.println(nome);
		}

		sc.close();
	}

	// 🔧 COMPLETADO: Método que verifica se o nome contém a letra
	public static boolean temLetra(String nome, char letra) {
		return nome.toLowerCase().contains(String.valueOf(letra).toLowerCase());
	}

	// 🔧 COMPLETADO: Predicate que define a lógica de remoção
	public static Predicate<String> filtroRemovedor(char letra) {
		return nome -> nome.length() < 5 || temLetra(nome, letra);
	}
}