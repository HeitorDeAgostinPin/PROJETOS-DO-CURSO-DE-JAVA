package Model.Aplicação;

import Model.Entiades.Circulo;
import Model.Entiades.Forma_Abstrct;
import Model.Serviços.Cor;

public class formatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Forma_Abstrct f1 = new Circulo(Cor.BRANCO,2.0);
		System.out.println("Circle color: " + f1.getCor());
		System.out.println("Circle area: " + String.format("%.3f", f1.area()));
	}

}
