package Aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Empregado;
import Entidades.Tercerizado;

public class Program_empregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> empregados = new ArrayList<Empregado>();
		
		System.out.println("Informe a quantidade de empregados :");
		int e = sc.nextInt();
		
	 for(int i = 1;i<=e;i++) 
	   {
		 System.out.println("Informe os dados do empregado "+ (i + 1));
		 System.out.println("informe o nome do empregado: ");
			sc.nextLine();
          String nome = sc.nextLine();
          
		 System.out.println("informe a quantidade de horas trabalhadas por" + nome);
		 Integer horasTr = sc.nextInt();
		 
		 System.out.println("Agora, informe o valor p/hora de " + nome);
		 Double valorHora = sc.nextDouble();
		 
		 System.out.println("|este empregado é tercerizado?(s/n)");
		 char c = sc.next().charAt(0);
		 
		 if(c == 's') 
		   {
			 System.out.println("Informe a carga adicional: ");
			 Double despesaAdicional = sc.nextDouble();
			 empregados.add(new Tercerizado(nome,horasTr,valorHora,despesaAdicional));
		   }else 
		   {
			   empregados.add(new Empregado(nome,horasTr,valorHora));
		   }
	   }
	
	 System.out.println();
	 System.out.println("PAGAMENTOS: ");
	 for(Empregado emp : empregados)  
	 {
		 System.out.println("Nome:" + emp.getNome() + " - R$"+ String.format("%.2f", emp.pagamento()));
	 }
	 sc.close();

	}

}
