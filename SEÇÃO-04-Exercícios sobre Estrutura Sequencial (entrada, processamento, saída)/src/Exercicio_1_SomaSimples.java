import java.util.Scanner;
public class Exercicio_1_SomaSimples  {
//Soma Simples – Ler dois números inteiros e exibir a soma.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um programa para ler dois valores inteiros,
		//e depois mostrar na tela a soma desses números com uma mensagem explicativa,
		//conforme exemplos
        
		Scanner sc = new Scanner(System.in);
		
		
		int x, y;
		
		double operacamatematica ;
		
		System.out.println("Digite dois numeros");
		x = sc.nextInt();
		y = sc.nextInt();
		
		operacamatematica = x + y;
		
;
		System.out.printf("Resultado da soma desses dois numeros é: %.2f",operacamatematica);
		sc.close();
		
		
	}

}
