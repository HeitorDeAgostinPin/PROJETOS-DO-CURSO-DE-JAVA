package Entidades;

public class Produto {
     protected String nome;
     protected Double preco;
     
     public Produto() {}
     public Produto(String nome,Double preco) 
          {
    	 this.nome = nome;
    	 this.preco = preco;
          }
     public String getNome() 
     {
    	 return nome;
     }
     public void setNome(String nome) 
     {
    	 this.nome = nome;
     }
     
     public Double getPreco() 
     {
    	 return preco;
     }
     
     public void setPreco(Double preco) 
     {
    	 this.preco = preco;
     }
     
     public String Etiqueta() {
    	 return "Nome do Produto: " + nome + "/n"
    			 + "Preço do Produto: R$" + String.format("%.2f", preco);
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