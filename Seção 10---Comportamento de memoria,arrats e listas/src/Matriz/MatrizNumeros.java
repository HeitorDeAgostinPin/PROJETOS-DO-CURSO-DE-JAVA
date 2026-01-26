package Matriz;

import java.util.Scanner;

public class MatrizNumeros {

	public static void main(String[] args)
	{/*Enunciado do Exercício

Fazer um programa para ler dois números inteiros M e N, 
e depois ler uma matriz de M linhas por N colunas contendo números inteiros, podendo haver repetições.
Em seguida, ler um número inteiro X que pertence à matriz.
Para cada ocorrência de X, mostrar os valores à esquerda, 
acima, à direita e abaixo de X, quando houver, conforme o exemplo.*/
		// TODO Auto-generated method stub
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Infome A quantidade de linhas da MATRIZ:  ");
        int linhas = sc.nextInt();
        
        System.out.println("informe a quantidade de colunas da MATRIZ: ");
        int colunas = sc.nextInt();
        
        int matriz[][] = new int[linhas][colunas];
        
        
        for(int i = 0;i<matriz.length;i++)
           {
        	for(int x = 0;x<matriz[i].length;x++ )
        	    {
        		   System.out.println("informe os numeros: ");
        		   matriz[i][x] = sc.nextInt();
        	    }
           }
        
        System.out.println();

        System.out.println("Agora informe o numero a ser encontrado: ");
        int busca = sc.nextInt();
        
        for(int i = 0;i<matriz.length;i++)
           {
        	for(int j = 0;j<matriz[i].length;j++)
        	   {
        		if(matriz[i][j] == busca)
        		  {
        			if(j>0)
        			  {
        				System.out.println("Esquerda: " + matriz[i][j-1]);
        			  }
        			if(j<colunas - 1)
        			  {
        				System.out.println("Direita: " + matriz[i][j+1]);
        			  }
        			if(i>0)
    			      {
        			 System.out.println("Cima: " + matriz[i-1][j]);
    			      }
        			if(i<linhas-1)
    			      {
        				System.out.println("Baixo:  " + matriz[i+1][j]);
    			      }
        		  }
        	   }
           }
        
        
      sc.close();  
	}

}
