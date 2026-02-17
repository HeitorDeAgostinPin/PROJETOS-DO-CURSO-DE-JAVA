package Model.Entiades;

public class Veiculo {
	
	private String modelo;
	
	public Veiculo() {}

	public Veiculo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
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