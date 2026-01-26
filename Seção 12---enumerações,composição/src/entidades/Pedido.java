package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.Status_do_Pedido;

public class Pedido 
{
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
  private Date momentoPedido;
  private Status_do_Pedido statusPedido;
  
  private Cliente cliente;
  private List<ItemPedido> itens = new ArrayList<>();
  
  public Pedido() {}
  public Pedido(Date momentoPedido,Status_do_Pedido statusPedido,Cliente cliente) 
   {
	  this.momentoPedido = momentoPedido;
	  this.statusPedido = statusPedido;
	  this.cliente = cliente;
   }
public Date getMomentoPedido() {return momentoPedido;}
public void setMomentoPedido(Date momentoPedido) {this.momentoPedido = momentoPedido;}

public Status_do_Pedido getStatusPedido() {return statusPedido;}
public void setStatusPedido(Status_do_Pedido statusPedido) {this.statusPedido = statusPedido;}
  
//public List<ItemPedido> getItemPedido(){return itens;} para proteger a lista, só alterar ela usando o ADD e REMOVE
public void addItens(ItemPedido item) {itens.add(item);}
public void removeItens(ItemPedido item) {itens.remove(item);}

public Double total() 
 {
	Double soma = 0.0;
	
	for(ItemPedido item : itens)
	{
		soma = soma + item.subTotal();
	}
	return soma;
 }

@Override
public String toString() 
  {
	StringBuilder sb = new StringBuilder();
	sb.append("Momento do Pedido: ");
	sb.append(sdf.format(momentoPedido));
	sb.append("Status do Pedido: ");
	sb.append(statusPedido + "\n");
	sb.append("Nome Do Cliente: ");
	sb.append(cliente + "\n");
	sb.append("Iten Pedidos: \n");
	for(ItemPedido item : itens) 
	{
		sb.append(itens + "\n");
	}
	sb.append("Preço Total: \n");
	sb.append(String.format("%.2f", total()));
	
	return sb.toString();
  }
}
/* Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um 
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser 
o instante do sistema: new Date()
*/