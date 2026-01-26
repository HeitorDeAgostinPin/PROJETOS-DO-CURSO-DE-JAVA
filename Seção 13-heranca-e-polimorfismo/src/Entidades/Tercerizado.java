package Entidades;

public class Tercerizado extends Empregado{
	
	private Double despesaAdicional;
	
	public Tercerizado() {}

	public Tercerizado(String nome, Integer hotasTr, Double valorHora, Double despesaAdicional) {
		super(nome, hotasTr, valorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
		
    @Override
	public double pagamento() 
	{
		return super.pagamento() + (1.1*despesaAdicional);
	}

	
	

}
/*Umaempresapossui funcionáriospróprioseterceirizados.
Para cada funcionário, deseja-se registrar nome, horas
trabalhadas e valor por hora. Funcionários terceirizado
possuemaindaumadespesaadicional.
Opagamentodosfuncionárioscorrespondeaovalordahora
multiplicado pelas horas trabalhadas, sendo que os
funcionários terceirizados ainda recebem um bônus
correspondentea110%desuadespesaadicional.
FazerumprogramaparalerosdadosdeNfuncionários(N
fornecidopelousuário)earmazená-losemumalista.Depois
delertodososdados,mostrarnomeepagamentodecada
funcionárionamesmaordememqueforamdigitados.
Construa o programa conforme projeto ao lado. Veja
exemplonapróximapágina.
*/