import java.util.Scanner;

public class Exemplo_FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Fazer um programa que lê um valor
		 //inteiro N e depois N números inteiros.
		 //Ao final, mostra a soma dos N números
		 //lidos
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de vezes que serão lidos numeros");
		 int N = sc.nextInt();
	int soma= 0;
	
	for (int i = 0; i < N; i++) 
	{
		int x = sc.nextInt();
		soma = soma + x;
	}
	System.err.println("soma");
	
	sc.close();
	}

}
