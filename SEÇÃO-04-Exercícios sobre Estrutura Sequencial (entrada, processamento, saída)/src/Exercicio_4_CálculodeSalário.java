import java.util.Locale;
import java.util.Scanner;
public class Exercicio_4_CálculodeSalário {
//Cálculo de Salário – Determinar o salário de um funcionário com base nas horas trabalhadas.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fazer um programa que leia o número de um funcionário, 
		//seu número de horas trabalhadas, o valor que recebe por 
		//hora e calcula o salário desse funcionário. A seguir,
		//mostre o número e o salário do funcionário, com duas casas 
		//decimais
		 Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String numero_funcionario;
		int horas_trabalhadas  ;
		double valor_hora ;
		
		double salario;
		
		
		System.out.println("Informe numero do funcionario: ");
			numero_funcionario = sc.next();
			
		System.out.println("Informe a quantidade de horas trabalhadas por este funcionario :");
		    horas_trabalhadas = sc.nextInt();
		    
		System.out.println("Informe o Valor da hora deste funcionario");
		    valor_hora = sc.nextDouble();
		    
	    salario = horas_trabalhadas * valor_hora;
		
	    System.out.printf("O número deste funcionário é: %s%n", numero_funcionario);
        System.out.printf("Este funcionário trabalhou %d horas.%n", horas_trabalhadas);
        System.out.printf("O valor da hora deste funcionário é de R$ %.2f reais.%n", valor_hora);
        System.out.printf("O salário deste funcionário é de R$ %.2f reais.%n", salario);
		
		sc.close();
	}

}
