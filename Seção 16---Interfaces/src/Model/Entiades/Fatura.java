package Model.Entiades;

public class Fatura {

	private Double pagamento;
	private Double taxa;
	
	public Fatura() {}

	public Fatura(Double pagamento, Double taxa) {
		this.pagamento = pagamento;
		this.taxa = taxa;
	}

	public Double getPagamento() {
		return pagamento;
	}

	public void setPagamento(Double pagamento) {
		this.pagamento = pagamento;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double getPagamentoTotal() {
		return getPagamento() + getTaxa();
	}
	
}
/*Problema exemplo
Umalocadorabrasileiradecarroscobraumvalorporhoraparalocaçõesdeaté
12horas.Porém, seaduraçãodalocaçãoultrapassar12horas,a locaçãoserá
cobradacombaseemumvalordiário.Alémdovalordalocação,éacrescidono
preçoovalordoimpostoconformeregrasdopaísque,nocasodoBrasil,é20%
para valores até 100.00, ou 15%para valores acima de 100.00. Fazer um
programaquelêosdadosdalocação(modelodocarro, instanteinicialefinalda
locação),bemcomoovalorporhoraeovalordiáriode locação.Oprograma
deveentãogerar anotadepagamento (contendovalorda locação, valordo
impostoe valor total dopagamento) e informar os dados na tela. Vejaos
exemplos.*/