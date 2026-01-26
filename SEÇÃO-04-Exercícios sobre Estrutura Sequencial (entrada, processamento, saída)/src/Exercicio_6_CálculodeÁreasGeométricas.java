import java.util.Locale;
import java.util.Scanner;
public class Exercicio_6_CálculodeÁreasGeométricas {
	//Cálculo de Áreas Geométricas – Determinar áreas de diferentes formas geométricas a partir de três valores.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
		//mostre: 
		//a) a área do triângulo retângulo que tem A por base e C por altura. 
		//b) a área do círculo de raio C. (pi = 3.14159) 
		//c) a área do trapézio que tem A e B por bases e C por altura. 
		//d) a área do quadrado que tem lado B. 
		//e) a área do retângulo que tem lados A e B
        Locale.setDefault(Locale.US);

		
		float A,B,C;
		float triangulo,circulo,trapezio,quadrado,retangulo;
		float pi = 3.14159f;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o valor de A :  ");
		A = sc.nextFloat();
		System.out.println("Informe o valor de B :  ");
		B = sc.nextFloat();
		System.out.println("Informe o valor de C :  ");
		C = sc.nextFloat();
		
		triangulo = (A*C)/2;
		circulo = (float)(pi* Math.pow(C, 2));
		trapezio = ((A + B)*C)/2;
		quadrado =(float) (Math.pow(B,2));
		retangulo = A *B ;
		
		System.out.printf("A area do Tringulo é:%.2f%n ",triangulo);
		System.out.printf("A area do Circulo é :%.2f%n",circulo);
		System.out.printf("A area do Trapezio é : %.2f%n",trapezio);
		System.out.printf("A area do Quadrado é : %.2f%n",quadrado);
		System.out.printf("A area do Retangulo é : %.2f%n",retangulo);
		
		sc.close();
	}

}
