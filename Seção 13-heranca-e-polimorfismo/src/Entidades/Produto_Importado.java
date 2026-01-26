package Entidades;

public class Produto_Importado extends Produto {
     protected Double taxinha;
     
     public Produto_Importado() {}
     public Produto_Importado(String nome,Double preco, Double taxinha) 
     {
    	 super(nome,preco);
    	 this.taxinha = taxinha;
     }
     
     public Double getTaxinha() 
     {
    	 return taxinha;
     }
     public void setTaxinha(Double taxinha) 
     {
    	 this.taxinha = taxinha;
     }
     
     @Override
     public String Etiqueta() {
    	 return "Nome do Produto: " + nome + "/n"
    			 + "Preço do Produto: R$" + String.format("%.2f", preco) +
    			 "taxinha do amor: "+ String.format("%.2f", taxinha);
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