import java.util.Scanner;
public class Exercicio_3_DiferençadeProdutos {
//Diferença de Produtos – Calcular a diferença entre o produto de dois pares de números.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		//A seguir, calcule e mostre a diferença do produto 
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		Scanner sc = new Scanner(System.in);
		
		double A,B,C,D;
		double diferença;
		
		System.out.println("Digite respctivamente os valores de A,B,C e D");
		A = sc.nextInt();
		B = sc.nextInt();		
		C = sc.nextInt();
		D = sc.nextInt();
		
		
		
		diferença =(A*B-C*D);
		
		System.out.printf ("A diferença da entre a multiplicação de A com B entre C com D é: %.2f",diferença);
        sc.close();
	}

}
