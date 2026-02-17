package Model.Entiades;

import Model.Serviços.Cor;
import Model.Serviços.Forma;

public abstract class Forma_Abstrct implements Forma{

	private Cor cor;

	public Forma_Abstrct(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	
}
