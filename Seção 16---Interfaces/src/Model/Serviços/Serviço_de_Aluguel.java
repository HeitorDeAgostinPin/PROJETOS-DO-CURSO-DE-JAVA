package Model.Serviços;

import java.time.Duration;

import Model.Entiades.Aluguel;
import Model.Entiades.Fatura;

public class Serviço_de_Aluguel {

	private Double precoPHora;
	private Double precoPDia;
	
	private TaxaServiço taxaServiço;

	//sem construtor vazio pq que o usuario éobrigado a entrar com todos os dados nesse contexto
	
	public Serviço_de_Aluguel(Double precoPHora, Double precoPDia, TaxaServiço taxaServiço) {
		this.precoPHora = precoPHora;
		this.precoPDia = precoPDia;
		this.taxaServiço = taxaServiço;
	}
	
	public  void processarfatura(Aluguel aluguel) {
		
	double minutos = Duration.between(aluguel.getInicio(), aluguel.getFim()).toMinutes();
	double horas = minutos/60;
	
	double pagamento;
	
	if(horas<=12) {
		pagamento = precoPHora *Math.ceil(horas);
	}else {
		pagamento = precoPDia * Math.ceil(horas/24);
	}
		
	double tax = taxaServiço.tax(pagamento);
		
		
		aluguel.setFatura(new Fatura());
	}

	
}
