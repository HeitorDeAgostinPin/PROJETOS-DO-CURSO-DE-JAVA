package Entidades;

import Entidades.enums.Cor;

public class Circulo extends Formato {

	private Double raio;
	
	public Circulo() {super();}
	
	
	
	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}



	public Double getRaio() {
		return raio;
	}



	public void setRaio(Double raio) {
		this.raio = raio;
	}



	@Override
	public double area() {
		return Math.PI*(raio*raio);
	}

}
/*FazerumprogramaparalerosdadosdeNfiguras(Nfornecido
pelousuário), edepoismostrar as áreas destas figuras na
mesmaordememqueforamdigitadas.*/