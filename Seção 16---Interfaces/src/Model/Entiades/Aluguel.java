package Model.Entiades;

import java.time.LocalDateTime;

public class Aluguel {

	private LocalDateTime inicio;
	private LocalDateTime fim;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	public Aluguel() {}

	public Aluguel(LocalDateTime inicio, LocalDateTime fim, Veiculo veiculo/* Fatura fatura*/) {
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
		//this.fatura = fatura; pq a fatura não existe ainda quando se retira o carro
	}

	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFim() {
		return fim;
	}

	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
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