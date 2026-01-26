package aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Departamento;
import entidades.Trabalhador;
import entidades.duracaoContrato;
import entidades.enums.Nivel_Do_Trabalhador;

public class gestor_De_Contratos {

	public static void main(String[] args) throws ParseException
	{
		// TODO Auto-generated method stub
		/* Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar 
		 do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo 
		 (próxima página).*/ 
		
		Locale.setDefault(Locale.US);
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		
		
		System.out.println("Informe o departamento do funcionario");
		String departamento = sc.nextLine();
		
		System.out.println("Agora entre com os dados do funcionario: ");
		System.out.println("Nome do funcioanario :");
		String nome = sc.nextLine();
		System.out.println("Nivel do funcionario: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.println("Salario base: ");
		Double salarioBase = sc.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nome,Nivel_Do_Trabalhador.valueOf(nivelTrabalhador),
				salarioBase, new Departamento(departamento));
sc.nextLine();
		
		System.out.println("Quantos contratos tera este funcionario? ");
		int n = sc.nextInt();
		
		for(int i = 0;i<n;i++)
		   {
			System.out.println("Entre com os dados do contrato numero #"+(i+1));

			System.out.println("Data: (DD/MM/YYYY)");
			Date data = sdf.parse(sc.next());
			System.out.println("Valor Pela hora: ");
			Double valorPorHora = sc.nextDouble();
			System.out.println("Quantidade de horas trabalhadas : " );
			int horasTrabalhadas = sc.nextInt();
			
			duracaoContrato duracao = new duracaoContrato(data,valorPorHora,horasTrabalhadas);
			trabalhador.addContratos(duracao);		   }
		
		System.out.println();
		
		System.out.println("Entre com o mes e o anos para ser calculada a renda total");
        String mes_ano = sc.next();
        
        int mes = Integer.parseInt(mes_ano.substring(0,2));
        int ano = Integer.parseInt(mes_ano.substring(3));
        
		double renda = trabalhador.rendaTotal(mes, ano);
		
		System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento :" + trabalhador.getDepartamento().getNomeDepartamento());		
        System.out.println("Renda na Data " + mes_ano + String.format("   : %.2f", renda));
		
		sc.close();
	}

}
