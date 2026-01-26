package ListasAplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ListasEntidades.funcionario;

public class trabalho {

	public static void main(String[] args) 
	{Locale.setDefault(Locale.US);
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		List<funcionario> Lista = new ArrayList<funcionario>();
		
		System.out.println("Informe quantos funcionarios serão regidtrados : ");
		int c = sc.nextInt();

		
		for(int i = 0;i<c;i++)
		{
			System.out.println("Funcionario #" + (i+1) + ":");
			System.out.println("Informe o ID do Funcionario :");
			int id = sc.nextInt();
			    while(temId(Lista,id))
			    {
			    	System.out.println("Id Já existente, tente outro :  ");
			    	id = sc.nextInt();
			    }
		sc.nextLine();
		
            System.out.println("Informe o nome do Funcionrio: ");
            String nome = sc.nextLine();
            
            System.out.println("Informe oSalario : ");
            Double salario = sc.nextDouble();
            //funcionario func = new funcionario(id, nome, salario); Lista.add(func);
            Lista.add(new funcionario(id, nome, salario));
		}
		System.out.println("----------------------");
		
		System.out.println("Informe o funcionario que recebera Aumento");
		int idBusca = sc.nextInt();
		
		funcionario func = Lista.stream().filter(x ->x.getId() == idBusca).findFirst().orElse(null);
		
		
		if(func == null)
		  {
			System.out.println("Usurio não encontrado.");
		  } else 
		    {
			  System.out.println("Informe a porcentagem do aumento");
			  Double porcentagem = sc.nextDouble();
			  
			  func.aumentarSalario(porcentagem);
			}
		
		System.out.println("Lista atualizada com sucesso");
		for(funcionario f : Lista)
		   {
			System.out.println(f);
		   }
		sc.close();
	}

	public static boolean temId(List<funcionario> Lista,int id) 
	{
		return Lista.stream().anyMatch(x ->x.getId() == id);
	}
}/* 
        public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salário) de N funcionários.  
Não deve haver repetição de id.

Em seguida, efetuar o aumento de X porcento no salário de um determinado funcionário.  
Para isso, o programa deve ler um id e o valor X.  
Se o id informado não existir, mostrar uma mensagem e abortar a operação.

Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.

Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente.  
Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.

*
Predicate<Integer> ehPar = new Predicate<Integer>() {@Override public boolean test(Integer n) {return n % 2 == 0;}};
*/
