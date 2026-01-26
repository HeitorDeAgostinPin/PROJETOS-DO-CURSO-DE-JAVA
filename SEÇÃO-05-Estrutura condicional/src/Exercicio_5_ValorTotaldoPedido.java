import java.util.Scanner;

public class Exercicio_5_ValorTotaldoPedido {
//Valor Total do Pedido – Calcular o valor a ser pago com base em um código de item e sua quantidade.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Com base na tabela abaixo, escreva um programa que 
		//leia o código de um item e a quantidade deste item. 
		//A seguir, calcule e mostre o valor da conta a pagar
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Codigo do produto desejado"
				+ " 1-> Cachorro Quente, 2-> X-Salada, 3->X-Bacon ,"
				+ "4->Torrada Simples, 5->Refrigerante  :");
		int codigo = sc.nextInt();
		
		System.out.println("Agora informe a quantidade desejada :");
        int quantidade = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}

}
