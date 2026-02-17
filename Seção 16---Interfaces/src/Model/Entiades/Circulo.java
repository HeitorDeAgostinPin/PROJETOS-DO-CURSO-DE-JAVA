package Model.Entiades;

import Model.Serviços.Cor;

public class Circulo extends Forma_Abstrct {

	private Double raio;

	public Circulo(Cor cor,Double raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	public Double area() {
		
		return Math.PI*raio*raio;
	}

}
