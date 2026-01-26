package entidades;

public class Departamento 
{/* Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar 
	 do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo 
	 (próxima página).*/ 
      private String departamento;

	public Departamento(String departamento) 
	{
		
		this.departamento = departamento;
	}
	public Departamento(){}
	
	public String getNomeDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
      
      
}
