package Aplicação;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto;
import Entidades.Produto_Importado;
import Entidades.Produto_Usado;

public class program_Produto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> prod = new ArrayList<>();	
		
		System.out.println("Informe a quantidade de produtos :");
		int e = sc.nextInt();
		
	 for(int i = 1;i<=e;i++) {
		 System.out.println("entre com os dados do produto numero "+ i);
			System.out.print("O produto é :Comum, usado, importado (c/u/i)? ");
			char t = sc.next().charAt(0);
			System.out.println("Nome do produto");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Preço do produto: ");
			double preco = sc.nextDouble();
			
			if(t == 'c') {
				prod.add(new Produto(nome,preco));
			}else if(t == 'u') {
				System.out.println("Informe a data de fabricação:(dd/MM/yyyy)");
				LocalDate data = LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				prod.add(new Produto_Usado(nome,preco,data));
			}else if(t == 'i'){
				System.out.println("Informe a taxinha do amor");
				Double taxinha = sc.nextDouble();
				prod.add(new Produto_Importado(nome,preco,taxinha));
			}
	 } 
	 
	 System.out.println();
	 System.out.println();
	 
	 System.out.println("ETIQUETAS");
	 for(Produto p : prod) {
		 System.out.println(p.Etiqueta());
	 }
	 sc.close();
}
	}
/*Fazer umprograma para ler os dados deN
produtos (Nfornecidopelousuário).Aofinal,
mostraraetiquetadepreçodecadaprodutona
mesmaordememqueforamdigitados.
Todoprodutopossui nomeepreço. Produtos
importadospossuemumataxadealfândega,e
produtosusadospossuemdatade fabricação.
Estes dados específicos devem ser
acrescentadosnaetiquetadepreçoconforme
exemplo (próxima página). Para produtos
importados, a taxa e alfândega deve ser
acrescentadaaopreçofinaldoproduto.*/