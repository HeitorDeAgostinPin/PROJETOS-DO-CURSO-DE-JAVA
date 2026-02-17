package Model.Entiades;

public class Funcionarios implements Comparable<Funcionarios> {

	private String name;
	private Double salary;
	
	public Funcionarios(String name, Double salary) {

		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Funcionarios other) {//compara um obj com outro, nesse caso os nomes dos funcionarios, other é referente a outro funcionario
		// TODO Auto-generated method stub
		return name.compareTo(other.getName());
	}
	
}

/*Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por 
linha), armazenando-os em uma lista. Depois, ordenar os dados dessa lista e mostra-los 
ordenadamente na tela. Nota: o caminho do arquivo pode ser informado "hardcode".

*Façaumprogramapara lerumarquivocontendo funcionários (nomeesalário) no
formato.csv,armazenando-osemumalista.Depois,ordenaralistapornomeemostrar
oresultadonatela.Nota:ocaminhodoarquivopodeserinformado"hardcode".
*/