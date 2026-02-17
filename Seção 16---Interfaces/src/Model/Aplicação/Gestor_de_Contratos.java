package Model.Aplicação;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Model.Entiades.Contrato;
import Model.Entiades.Parcelas;
import Model.Serviços.ContratoServico;
import Model.Serviços.PayPal_Servico;

public class Gestor_de_Contratos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato: ");
		System.out.println("Numero: ");
		int N_Contrato = sc.nextInt();
		System.out.println("DATA (dd/MM/yyyy): ");
		LocalDate data_Contrato = LocalDate.parse(sc.next(),dmt);
		System.out.println("valor do contrato: ");
		double valorTotal = sc.nextDouble();
		
		Contrato contrato = new Contrato( N_Contrato, data_Contrato,  valorTotal);
		
		System.out.println("entre com o numero da parcelas: ");
		int n = sc.nextInt();
		
		
		ContratoServico  contratoservico = new ContratoServico(new PayPal_Servico());
		contratoservico.precessarContrato(contrato, n);
		
		System.out.println("PARCELAS: ");
		for(Parcelas p : contrato.getParcelas()) {//o get é ptra pegar as parcelas da LISTA  
			
			System.out.println(p);
		}
		
		sc.close();
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