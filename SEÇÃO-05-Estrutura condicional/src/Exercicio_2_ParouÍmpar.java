import java.util.Scanner;

public class Exercicio_2_ParouÍmpar {
//Par ou Ímpar? – Identificar se um número inteiro é par ou ímpar.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		
		Scanner sc = new Scanner(System.in);
		int numero;
		float resto;
		
		
		System.out.println("Digite um numero e irei dizer se este número é par ou ímpar");

		 numero = sc.nextInt();
		
		 resto = numero % 2;
		 
		 if (resto == 0) 
		 {
			 System.out.println("Este numero é Par");
		 }else 
		 {
			System.out.println("este numero é Impar");
		 }
	sc.close();
	}

}
