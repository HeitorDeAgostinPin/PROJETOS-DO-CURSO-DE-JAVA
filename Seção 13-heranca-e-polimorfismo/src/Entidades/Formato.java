package Entidades;

import Entidades.enums.Cor;

public abstract class Formato {
      private Cor cor;

    public Formato(){}  
    
	public Formato(Cor cor) {
		
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
      
   public abstract double area() ;   
}
/*FazerumprogramaparalerosdadosdeNfiguras(Nfornecido
pelousuário), edepoismostrar as áreas destas figuras na
mesmaordememqueforamdigitadas.*/