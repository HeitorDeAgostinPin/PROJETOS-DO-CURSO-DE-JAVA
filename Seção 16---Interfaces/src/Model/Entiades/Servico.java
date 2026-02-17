package Model.Entiades;

import Model.Serviços.valorTotal;

public class Servico implements valorTotal {

	private String nomeDoServico;
	private Double valorUnitario;
	private Integer quantidade;
	
	
	public Servico() {}

	public Servico(String nomeDoServico, Double valorUnitario, Integer quantidade) {
		this.nomeDoServico = nomeDoServico;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
	}

	public String getNomeDoServico() {
		return nomeDoServico;
	}

	public void setNomeDoServico(String nomeDoServico) {
		this.nomeDoServico = nomeDoServico;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double valorTotal() {
		 return valorUnitario*quantidade;
		 
	}
}
 