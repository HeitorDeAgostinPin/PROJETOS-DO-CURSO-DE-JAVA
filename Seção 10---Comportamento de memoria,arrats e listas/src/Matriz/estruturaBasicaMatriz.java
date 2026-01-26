package Matriz;

import java.util.Iterator;
import java.util.Scanner;

public class estruturaBasicaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		
		/*for(int i = 0;i<n;i++)
		   {
			for(int j=0;j<n;j++)
			 {
				mat[i][j] = sc.nextInt(); 
			 }
		   }*/
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("diagonal principal:");
		
		for(int i = 0;i<n;i++)
		   {
			System.out.println(mat[i][i] + "");
		   }
		
		int cont = 0 ;
		
		for(int a = 0;a<n;a++)
		   {
			for(int b = 0;b<a;b++)
			   {
				if(mat[a][b]<0)
				  {
					cont++;
				  }
			   }
		   }
		System.out.println("numeros negativos = " + cont);
		
		sc.close();

	}
	/* Fazer umprogramapara ler umnúmero inteiroNeumamatrizde
	 ordemNcontendonúmeros inteiros. Emseguida,mostraradiagonal
	 principaleaquantidadedevaloresnegativosdamatriz.*/

}
