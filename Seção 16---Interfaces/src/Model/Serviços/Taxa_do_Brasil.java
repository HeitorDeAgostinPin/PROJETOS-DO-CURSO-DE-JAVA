package Model.Serviços;

public class Taxa_do_Brasil implements TaxaServiço{
	public double tax(double valor)  {
		
		if(valor <= 100.0) {
			return valor * 0.2;
		}
		else {
			return valor * 0.15;
		}
	}
	
	

}
//SEM O USO DE INTERFAÇE
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