import java.util.Scanner;

public class Exercicio_1_NúmeroNegativoouNão {
//Número Negativo ou Não – Verificar se um número inteiro é negativo ou não.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero e te falarei se ele é psitivo,negativo ou não: %n ");
		numero = sc.nextInt();
		
		if (numero<0) {
			System.out.printf("este numero é negativo %n");
			
		}else if (numero > 0) {
			System.out.printf("Este numero é positivo  %n");
		}else { 
			System.out.println("Este numero não é negativo nem positivo, ele é o Zero");
			
		}
			
		
		
sc.close();

	}

}
