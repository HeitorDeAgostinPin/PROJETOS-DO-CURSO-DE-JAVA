package entidades;

import java.util.Date;

public class duracaoContrato 
{/* Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar 
	 do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo 
	 (próxima página).*/ 
      private Date data;
      private Double valorPorHora;
      private Integer horasTrabalhadas;
      
      
      public duracaoContrato() {}
      
      
      public duracaoContrato(Date data,Double valorPorHora,Integer horasTrabalhadas)
            {
    	       this.data = data;
    	       this.horasTrabalhadas = horasTrabalhadas;
    	       this.valorPorHora = valorPorHora;
            }
      
      public Double valorTotal()
           {
    	       return valorPorHora*horasTrabalhadas;
           }
      
      public Date getDate()
           {
    	     return data;
           }
      public void setDate(Date data)
            {
    	      this.data = data;
            }
      public Integer getHorasTrabalhadas() 
           {
    	      return horasTrabalhadas;
           }
      public void setHorasTrabalhadas(Integer horasTrabalhadas)
            {
    	       this.horasTrabalhadas =horasTrabalhadas;
            }
      public Double getValorPorHora()
            {
    	       return valorPorHora;
            }
      @Override
	public String toString() {
		return "duracaoContrato [data=" + data + ", valorPorHora=" + valorPorHora + ", horasTrabalhadas="
				+ horasTrabalhadas + "]";
	}


	public void setValorPorHora(Double valorPorHora)
            {
    	       this.valorPorHora = valorPorHora;
            }
		
	
}
