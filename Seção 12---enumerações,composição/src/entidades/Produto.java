package entidades;

public class Produto 
{
   private static String nomeProduto;
   private Double precoProduto;
   
   public Produto(){}
   
   public Produto(String nomeProduto,Double precoProduto)
   {
	   this.nomeProduto = nomeProduto;
	   this.precoProduto = precoProduto;
   }

   public static String getNomeProduto() {return nomeProduto;}
   public void setNomeProduto(String nomeProduto) {this.nomeProduto = nomeProduto;}
   
   public Double getPrecoProduto() {return precoProduto;}
   public void setPrecoProduto(Double precoProduto) {this.precoProduto = precoProduto;}
 
}
/* Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um 
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser 
o instante do sistema: new Date()
*/