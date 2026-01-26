package Aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Circulo;
import Entidades.Formato;
import Entidades.Retangulo;
import Entidades.enums.Cor;

public class AreasFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Formato>medidas = new ArrayList<>();
		
		System.out.println("informe a quntidade de formas geometricas");
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++) 
		{
			System.out.println("Dados da forma " + i);
			System.out.print("Reatngulo ou Circulo(r/c)");
			char ch = sc.next().charAt(0);
			
			System.out.print("Cor? (PRETO/AZUL/VERMELHO)");
			Cor cor = Cor.valueOf(sc.next());
			
			if(ch == 'r') 
			{
				System.out.println("Informe a Altura: ");
				double altura = sc.nextDouble();
				
				System.out.println("Informe a Largura: ");
				double largura = sc.nextDouble();
				medidas.add(new Retangulo(cor, altura, largura));
			} else {
				System.out.println("Informe o Raio: ");
				double raio = sc.nextDouble();
				
				medidas.add(new Circulo(cor, raio));
			}
		}
	
		
		System.out.println();
		
		System.out.println("Areas das formas");
		
		for (Formato formato : medidas) {
			System.out.println(String.format("%.2f",formato.area()));
		}
		
		
		
		sc.close();

	}

}
/*FazerumprogramaparalerosdadosdeNfiguras(Nfornecido
pelousuário), edepoismostrar as áreas destas figuras na
mesmaordememqueforamdigitadas.*/