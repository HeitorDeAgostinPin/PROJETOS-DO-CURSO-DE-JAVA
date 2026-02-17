package Model.Entiades;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Parcelas {
	DateTimeFormatter dmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate data_de_vencimento;
	private Double valor;

	

	public Parcelas(LocalDate data_de_vencimento, Double valor) {
		this.data_de_vencimento = data_de_vencimento;
		this.valor = valor;

	}

	public LocalDate getData_de_vencimento() {
		return data_de_vencimento;
	}

	public void setData_de_vencimento(LocalDate data_de_vencimento) {
		this.data_de_vencimento = data_de_vencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return data_de_vencimento.format(dmt) + " - " + String.format("%.2f", valor);
	}

	
	
}
/*Umaempresadesejaautomatizaroprocessamentodeseuscontratos.Oprocessamentode
umcontratoconsisteemgerarasparcelasaserempagasparaaquelecontrato,combaseno
númerodemesesdesejado.
Aempresautilizaumserviçodepagamentoonlinepararealizaropagamentodasparcelas.
Osserviçosdepagamentoonlinetipicamentecobramumjuromensal,bemcomoumataxa
porpagamento.Porenquanto,oserviçocontratadopelaempresaéodoPaypal,queaplica
jurossimplesde1%acadaparcela,maisumataxadepagamentode2%.
Fazerumprogramaparalerosdadosdeumcontrato(númerodocontrato,datadocontrato,
e valor total do contrato). Emseguida, oprogramadeve ler onúmerodemeses para
parcelamentodocontrato,edaígerarosregistrosdeparcelasaserempagas(dataevalor),
sendoaprimeiraparcelaaserpagaummêsapósadatadocontrato,asegundaparceladois
mesesapósocontratoeassimpordiante.Mostrarosdadosdasparcelasnatela*/