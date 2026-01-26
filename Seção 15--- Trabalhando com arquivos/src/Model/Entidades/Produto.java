package Model.Entidades;

public class Produto {

	private String nome;
	private Double preco;
	private Integer qtd;
	
	public Produto() {}

	public Produto(String nome, Double preco, Integer qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	public double total() {
		return preco * qtd;
	}
	
}/*Fazer umprograma para ler o caminhode umarquivo .csv
contendoos dados de itens vendidos. Cada itempossui um
nome,preçounitárioequantidade,separadosporvírgula.Você
devegerarumnovoarquivochamado"summary.csv", localizado
emumasubpastachamada"out"apartirdapastaoriginal do
arquivodeorigem,contendoapenasonomeeovalortotalpara
aquele item (preço unitário multiplicado pela quantidade),
conformeexemplo.*/
