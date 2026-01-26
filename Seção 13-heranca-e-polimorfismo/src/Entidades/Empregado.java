package Entidades;

public class Empregado {

	private String nome;
	protected Integer horasTr;
	protected Double valorHora;
	
	public Empregado() {super();}
	public Empregado(String nome,Integer horasTr, Double valorHora) 
	     {
		  this.nome = nome;
		  this.horasTr = horasTr;
		  this.valorHora = valorHora;
	     }
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	
	public Integer getHorasTr() {return horasTr;}
	public void setHorasTr(Integer horasTr) {this.horasTr = horasTr;}
	
	public Double getValorHora() {return valorHora;}
	public void setValorHora(Double valorHora) {this.valorHora = valorHora;}
	
	public double pagamento() 
	{
		return horasTr * valorHora;
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