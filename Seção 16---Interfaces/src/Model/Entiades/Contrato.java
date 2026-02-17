package Model.Entiades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer N_Contrato;
	private LocalDate data_Contrato;
	private Double valorTotal;
	
	public List<Parcelas> parcelas = new ArrayList<Parcelas>(); //PORQUE UM CONTRATO TEM VARIAS PARCELAS( A RELAÇÃO ENTRE ESSAS DUAS CLASSES)
	
	
	public Contrato() {}

	public Contrato(Integer N_Contrato, LocalDate data_Contrato, Double valorTotal) {
		super();
		N_Contrato = N_Contrato;
		this.data_Contrato = data_Contrato;
		this.valorTotal = valorTotal;
	}

	public Integer getN_Contrato() {
		return N_Contrato;
	}

	public void setN_Contrato(Integer n_Contrato) {
		N_Contrato = n_Contrato;
	}

	public LocalDate getData_Contrato() {
		return data_Contrato;
	}

	public void setData_Contrato(LocalDate data_Contrato) {
		this.data_Contrato = data_Contrato;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Parcelas> getParcelas() {
		return parcelas;
	}
	
	
}/*Umaempresadesejaautomatizaroprocessamentodeseuscontratos.Oprocessamentode
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
