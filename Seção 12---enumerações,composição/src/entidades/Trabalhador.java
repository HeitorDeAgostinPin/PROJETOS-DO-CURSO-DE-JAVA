package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.Nivel_Do_Trabalhador;
public class Trabalhador 
{/* Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar 
	 do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo 
	 (próxima página).*/ 
      private String nome;
      private Nivel_Do_Trabalhador nivel;
      private double salarioBase;
      private Departamento departamento;
      
      private List<duracaoContrato> contratos = new ArrayList<>();
      
      public Trabalhador() {}
      
      public Trabalhador(  String nome,Nivel_Do_Trabalhador nivel,double salarioBase,Departamento departamento)  
            {
    	      this.nome = nome;
    	      this.nivel = nivel;
    	      this.salarioBase = salarioBase;
    	      this.departamento = departamento;
    	      //this.contratos = contratos;
            }
      
     

	public String getNome()
      {
    	  return nome;
      }
      
      public Nivel_Do_Trabalhador getNivel()
      {
    	  return nivel;
      }
      
      public void setNivel(Nivel_Do_Trabalhador nivel) 
      {
    	  this.nivel = nivel;
      }
      
      public Double getSalarioBase()
      {
    	  return salarioBase;
      }
      
      public void setSalarioBase(Double salarioBase) 
      {
    	  this.salarioBase = salarioBase;
      }
      
      public Departamento getDepartamento()  
      {
    	  return departamento;
      }
      
      public void setDepartamento(Departamento departamento) 
      {
    	  this.departamento = departamento;
      }

	public List<duracaoContrato> getContratos() {
		return contratos;
	}

	/*public void setContratos(List<duracaoContrato> contratos) {
		this.contratos = contratos;
	}*/
      
      public void addContratos(duracaoContrato contrato) 
      {
    	  contratos.add(contrato);
      }
      
      public void romoveContratos(duracaoContrato contrato)
      {
    	  contratos.remove(contrato);
      }
      
      public Double rendaTotal(int mes, int ano) {
    	    // Começamos a soma com o salário base do trabalhador
    	    double soma = salarioBase;

    	    // Percorre todos os contratos associados ao trabalhador
    	    for (duracaoContrato contrato : contratos) {
    	        
    	        // Calendar é usado porque a classe Date sozinha não tem métodos para pegar mês/ano
    	        Calendar cal = Calendar.getInstance();  
    	        
    	        // Aqui dizemos: "coloque dentro do calendário a data desse contrato"
    	        cal.setTime(contrato.getDate());  

    	        // Pegamos o ano do contrato
    	        int contratoAno = cal.get(Calendar.YEAR);
    	        
    	        // Pegamos o mês do contrato
    	        // OBS: no Calendar, Janeiro = 0, Fevereiro = 1, ..., Dezembro = 11
    	        // Por isso somamos +1 para ficar no padrão humano (Janeiro = 1, etc.)
    	        int contratoMes = cal.get(Calendar.MONTH) + 1;  

    	        // Agora comparamos se o contrato é do mês e ano que o usuário pediu
    	        if (contratoAno == ano && contratoMes == mes) {
    	            // Se sim, somamos o valor total do contrato (valor por hora * horas trabalhadas)
    	            soma += contrato.valorTotal();
    	        }
    	    }

    	    // No fim retornamos a soma total (salário base + contratos do mês)
    	    return soma;
    	    /*Calendar.getInstance() → cria um calendário para manipular datas.

    	    cal.setTime(contrato.getDate()) → coloca a data do contrato dentro desse calendário.

    	    get(Calendar.YEAR) → pega o ano dessa data.

    	    get(Calendar.MONTH) → pega o mês (0 a 11, por isso somamos +1).

    	    if → só soma se ano e mês coincidirem com os parâmetros do método.*/
      }


	@Override
	public String toString() {
		return "Trabalhador [nome=" + nome + ", nivel=" + nivel + ", salarioBase=" + salarioBase + ", departamento="
				+ departamento + ", contratos=" + contratos + ", getNome()=" + getNome() + ", getNivel()=" + getNivel()
				+ ", getSalarioBase()=" + getSalarioBase() + ", getDepartamento()=" + getDepartamento()
				+ ", getContratos()=" + getContratos() + "]";
	}
      
}
