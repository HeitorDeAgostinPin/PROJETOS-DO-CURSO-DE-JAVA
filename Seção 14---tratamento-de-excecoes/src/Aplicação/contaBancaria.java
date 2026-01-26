package Aplicação;

import java.util.Locale;
import java.util.Scanner;

import Model.Entidades.Conta;
import Model.Execeções.ContaExceção;

public class contaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados da conta abaixo: ");
		System.out.println("Numero da conta: ");
		int numero = sc.nextInt();
		
		sc.nextLine();//pegar o enter/quebra de linha pendente pra não dar problema com o STRING DEPOIS
		
		System.out.println("Titular da Conta: ");
		String titular = sc.nextLine();
		
		System.out.println("Saldo Incial: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Limite de saque: ");
		double limiteSaque = sc.nextDouble();
		
		Conta conta = new Conta(numero, titular,saldo, limiteSaque);
		
		System.out.println();
		
		System.out.println("Informe a quantidade a sacar: ");
		double quantidade = sc.nextDouble();
		try {
			conta.saque(quantidade);
			System.out.printf("Novo Saldo: %.2f%n",conta.getSaldo());
		}
		catch(ContaExceção e) {
			System.out.println(e.getMessage());
		}

	sc.close();}

}
