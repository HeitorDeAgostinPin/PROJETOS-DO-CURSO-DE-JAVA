import java.util.Scanner;
public class Exercicio_5_ValorTotaldaCompra {
//Valor Total da Compra – Calcular o valor a ser pago por duas peças com quantidades e preços diferentes.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		
		Scanner sc = new Scanner(System.in);
		
		String cod1,cod2;
		int qtd1,qtd2;
		float valor1,valor2;
		
		float valortotal;
		
		System.out.println("Informe o codigo desta primeira peça :");
		cod1 = sc.next();
		
		System.out.println("Informe a quantidade de unidades da primeira peça :");
		qtd1 = sc.nextInt();
		
		System.out.println("Informe o valor unitario da primeira peça :");
		valor1 =sc.nextFloat();
		
		
		System.out.println("Informe o codigo desta segunda peça :%n");
		cod2 = sc.next();
		
		System.out.println("Informe a quantidade de unidades da segunda peça : %n");
		qtd2 = sc.nextInt();
		
		System.out.println("Informe o valor unitario da segunda peça : %n");
		valor2 =sc.nextFloat();
		
		valortotal =(qtd1*valor1)+(qtd2*valor2);
		
		System.out.printf("O total a se pagar é de R$ %.2f Reais",valortotal);
		
		sc.close();
	}

}
