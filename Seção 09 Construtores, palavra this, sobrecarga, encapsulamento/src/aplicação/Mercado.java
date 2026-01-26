package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;


public class Mercado 
{
	

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//Produto produto = new Produto();

		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Preço: ");
		double preco = sc.nextDouble();

		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);

		//alterar nome
		produto.setNome("pc") ;
		System.out.println("pegando o nome com o get:" + produto.getNome());//acessando o nome
		produto.setPreco(3000);
		System.out.println("pegando o preco com o get:" + produto.getPreco());
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		System.out.println();

		System.out.print("Digite o número de produtos a serem adicionados ao estoque: ");
		quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);

		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		System.out.println();

		System.out.print("Digite o número de produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);

		System.out.println();
		System.out.println("Dados atualizados: " + produto);

		sc.close();
	}
}
