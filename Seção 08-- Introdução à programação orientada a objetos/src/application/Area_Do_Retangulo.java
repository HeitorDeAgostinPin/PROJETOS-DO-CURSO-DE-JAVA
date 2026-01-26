package application;

import java.util.Scanner;

import entities.Retangulo;

public class Area_Do_Retangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Informe a altura do retangulo: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.println("Informe o tamanho da base: ");
		retangulo.base = sc.nextDouble();
		
		System.out.println("Area,Perimetro e Diagonal Do Reatngulo");
		System.out.println(retangulo.toString());
	}

}
