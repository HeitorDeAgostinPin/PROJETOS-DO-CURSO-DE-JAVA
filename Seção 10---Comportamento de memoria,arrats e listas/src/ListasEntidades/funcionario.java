package ListasEntidades;

public class funcionario 
{
       private Integer id;
       private String nome;
       private Double salario;
       
       
       public funcionario(Integer id,String nome, Double salario) 
       {
    	   this.id = id;
    	   this.nome = nome;
    	   this.salario = salario;
       }


	public Integer getId() {
		return id;
	}


	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
      public void aumentarSalario(Double porcentagem)
      {//salario = salario + salario * porcentagem/100;
    	  salario += salario * porcentagem/100;
      }
      @Override
      public String toString()
      {
    	  return "ID do funcionario : "+ id +",   NOME do funcionario : " + nome +   ",  SALARIO do funcionario: " + String.format("%.2f", salario) ;
      }
}
