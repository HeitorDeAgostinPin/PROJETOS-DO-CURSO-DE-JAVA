package Entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Produto_Usado extends Produto {
     protected LocalDate dataFabricacao;
     
     public Produto_Usado() {}
     public Produto_Usado(String nome,Double preco,LocalDate dataFabricacao) 
          {
    	 super(nome,preco);
    	 this.dataFabricacao = dataFabricacao;
          }
     
     public LocalDate getData() {
    	 return dataFabricacao;
     }
     public void setData(LocalDate dataFabricacao) {
    	 this.dataFabricacao = dataFabricacao;
     }
     @Override
     public String Etiqueta() {
    	 return "Nome do Produto: " + nome + "/n"
    			 + "Preço do Produto: R$" + String.format("%.2f", preco)
    			 + "/n" + "Data de Fabricação: " + dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
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