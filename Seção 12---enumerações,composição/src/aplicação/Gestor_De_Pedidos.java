package aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItemPedido;
import entidades.Pedido;
import entidades.Produto;
import entidades.enums.Status_do_Pedido;

public class Gestor_De_Pedidos {  

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
        Locale.setDefault(Locale.US);
		Scanner sc;
		sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		System.out.println("Informe o Nome: ");
		String nomeCliente = sc.nextLine();
		
		System.out.println("Inform o Email: ");
		String email = sc.next();
		
		System.out.println("Iforme a data de aniversario(dd/MM/yyyy");
		Date dataDeAniversario = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente( nomeCliente, email, dataDeAniversario);
		
		System.out.println("Dados Do Pedido \n");
		System.out.print("Status:");
		Status_do_Pedido status = Status_do_Pedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(),status,cliente);
		
		System.out.println("Quantos itens serão pedidos?");
		int n = sc.nextInt();
		
		for(int i = 0;i<n;i++) 
		{
			System.out.println("Informe os dados do prduto #" + (i+1));
			System.out.println("Nome do Produto: ");
		    sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.println("Preço do produto: ");
			Double precoProduto = sc.nextDouble();
			
			Produto produto = new Produto(nomeProduto,precoProduto);
			
			System.out.println("Quantidade: ");
			int quantidade = sc.nextInt();
			
			ItemPedido itempedido = new ItemPedido(quantidade,precoProduto,produto);

			pedido.addItens(itempedido);
			
		}
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(pedido);
		sc.close();
	}

}
/* Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um 
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser 
o instante do sistema: new Date()
*/