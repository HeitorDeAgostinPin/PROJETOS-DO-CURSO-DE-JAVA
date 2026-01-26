package entidades;

public class ItemPedido 
{
   private Integer quantidade;
   private Double precoPedido;
   
   private Produto produto;
   
   public ItemPedido() {}
   public ItemPedido( Integer quantidade, Double precoPedido,Produto produto) 
   {
	   this.precoPedido = precoPedido;
	   this.quantidade = quantidade;
	   this.produto = produto; 
   }
   
   public Integer getQuantidade() {return quantidade;}
   public void setQuantidade(Integer quantidade) {this.quantidade = quantidade;}
   
   public Double getPrecoPedido() {return precoPedido;}
   public void setPrecoPedido(Double precoPedido) {this.precoPedido = precoPedido;}
   
   public Double subTotal() 
   {
	   return precoPedido*quantidade;
   }
@Override
public String toString() {
	return Produto.getNomeProduto() + "ItemPedido [quantidade=" + quantidade + ", precoPedido=" + precoPedido + ", subTotal()=" + subTotal() + "]";
}
   
   
}
/* Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um 
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser 
o instante do sistema: new Date()
*/