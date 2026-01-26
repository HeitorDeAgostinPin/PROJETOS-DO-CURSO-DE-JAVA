package application;

import java.util.Scanner;

import entities.Triangle;

public class Areas_Dos_Trinagulos_Sem_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //doublexA, xB, xC, yA, yB, yC;
		Scanner sc = new Scanner(System.in);
        Triangle x,y;
        
        x = new Triangle();
        y = new Triangle(); 
        
		System.out.println("Digite as medidas do trianguo X :");
		System.out.println("Lado A: ");
		x.a = sc.nextDouble();
		System.out.println("Lado B: ");
		x.b= sc.nextDouble();
		System.out.println("Lado B: ");
        x.c = sc.nextDouble();

		System.out.println("Agora digite as medidas do trianguo Y :");
		System.out.println("Lado A: ");
	    y.a = sc.nextDouble();
		System.out.println("Lado B: ");
		y.b = sc.nextDouble();
		System.out.println("Lado C: ");
        y.c = sc.nextDouble();

		//double p = (x.a + x.b + x.c) / 2;
		//double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.b));
        double areaX = x.area();
        double areaY = y.area();
	    //p = (y.a + y.b + y.c) / 2;
		//double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		if (areaX > areaY) {
			System.out.printf("Trinagulo X tem a Aréa maior.Com area de %.2f", areaX);
		} else if (areaX < areaY) 
		{
			System.out.printf("Trinagulo Y tem a Aréa maior.Com area de %.2f", areaY);

		} else 
		{
			System.out.println("Abos triangulos tem aréa igual.");

		}
		sc.close();
	}

}
/*
 * Digite as medidas do trianguo X : Lado A: 45,3 Lado B: 12 Lado B: 11,11 Agora
 * digite as medidas do trianguo Y : Lado A: 5 Lado B: 9 Lado C: 23,25 Abos
 * triangulos tem aréa igual.
 */