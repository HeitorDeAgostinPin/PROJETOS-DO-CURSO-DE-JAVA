import java.util.Scanner;

public class Exercicio_3_NúmerosMúltiplos {
//Números Múltiplos – Verificar se dois números inteiros são múltiplos entre si.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
		//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
		//ordem crescente ou decrescente.
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("Digite um numero ");
		int numero1= sc.nextInt();
		
		System.out.println("Digite outro  numero ");
		int numero2= sc.nextInt();
		
		
	 
		System.out.println("Agora sera verificado se eles são multiplos ou não ");
		
		if (numero1 % numero2 == 0 || numero2 % numero1 == 0) 
		{
			System.out.printf("%d e %d São multiplos", numero1,numero2);
		}else 
		{
			System.out.printf("%d e %d Não São multiplos", numero1,numero2);
		}
	sc.close();
	}

}
