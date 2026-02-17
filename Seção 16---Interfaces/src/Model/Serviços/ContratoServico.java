package Model.Serviços;

import java.time.LocalDate;

import Model.Entiades.Contrato;
import Model.Entiades.Parcelas;

public class ContratoServico {

	private Servico_de_Pagamento_Online spo;

	public ContratoServico(Servico_de_Pagamento_Online spo) {
		this.spo = spo;

	}

	public void precessarContrato(Contrato contrato, int meses) {
		// contrato.getParcelas().add(new
		// Parcelas(LocalDate.of(2018,7,25),206.15));//ano mes dia

		double parcela_base = contrato.getValorTotal() / meses;
		for (int i = 1; i <= meses; i++) {
			LocalDate vencimento = contrato.getData_Contrato().plusMonths(i);// pega a data original e adicinoa mais im
																				// mes

			double juro = spo.juros(parcela_base, i);
			double taxa = spo.taxa_de_pagamento(parcela_base + juro);
			
			double parcelaCheia = parcela_base + juro+taxa;
			
			contrato.getParcelas().add(new Parcelas(vencimento, parcelaCheia));  
		}

	}

}
/*
 * Umaempresadesejaautomatizaroprocessamentodeseuscontratos.Oprocessamentode
 * umcontratoconsisteemgerarasparcelasaserempagasparaaquelecontrato,combaseno
 * númerodemesesdesejado.
 * Aempresautilizaumserviçodepagamentoonlinepararealizaropagamentodasparcelas.
 * Osserviçosdepagamentoonlinetipicamentecobramumjuromensal,bemcomoumataxa
 * porpagamento.Porenquanto,oserviçocontratadopelaempresaéodoPaypal,queaplica
 * jurossimplesde1%acadaparcela,maisumataxadepagamentode2%.
 * Fazerumprogramaparalerosdadosdeumcontrato(númerodocontrato,datadocontrato, e
 * valor total do contrato). Emseguida, oprogramadeve ler onúmerodemeses para
 * parcelamentodocontrato,edaígerarosregistrosdeparcelasaserempagas(dataevalor),
 * sendoaprimeiraparcelaaserpagaummêsapósadatadocontrato,asegundaparceladois
 * mesesapósocontratoeassimpordiante.Mostrarosdadosdasparcelasnatela
 */