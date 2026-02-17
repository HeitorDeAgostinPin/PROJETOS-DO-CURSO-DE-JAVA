package Model.Aplicação;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Model.Entiades.Aluguel;
import Model.Entiades.Veiculo;
import Model.Serviços.Serviço_de_Aluguel;
import Model.Serviços.Taxa_do_Brasil;

public class Locadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		
		System.out.print("Retirada (dd/MM/yyyyhh:mm):");
		LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(),fmt);
		
		System.out.print("Retorno (dd/MM/yyyyhh:mm):");
		LocalDateTime fim = LocalDateTime.parse(sc.nextLine(),fmt);
		
		Aluguel aluguel = new Aluguel(inicio, fim,  new Veiculo(modelo));// tem que dar um new veiculo() pq o atributo  modelo é da classe veiculo
		
 		
		System.out.println("Informe o preço por hora: ");
		double precoPHora = sc.nextDouble();
		System.out.println("Informe o preço por dia: ");
		double precoPDia = sc.nextDouble();
	
		
		Serviço_de_Aluguel servicoAluguel = new Serviço_de_Aluguel(precoPDia, precoPDia, new Taxa_do_Brasil());
		
		servicoAluguel.processarfatura(aluguel);
		
		System.out.println("fatura: ");
		System.out.println("Pagamento basico: " + String.format("%.2f",aluguel.getFatura().getPagamento()));
		System.out.println("Imposto: " + String.format("%.2f",aluguel.getFatura().getTaxa()));
		System.out.println("pagamento total: " +String.format("%.2f", aluguel.getFatura().getPagamentoTotal()));
		
		
		
		
		sc.close();
	}

}
/*Problema exemplo
Umalocadorabrasileiradecarroscobraumvalorporhoraparalocaçõesdeaté
12horas.Porém, seaduraçãodalocaçãoultrapassar12horas,a locaçãoserá
cobradacombaseemumvalordiário.Alémdovalordalocação,éacrescidono
preçoovalordoimpostoconformeregrasdopaísque,nocasodoBrasil,é20%
para valores até 100.00, ou 15%para valores acima de 100.00. Fazer um
programaquelêosdadosdalocação(modelodocarro, instanteinicialefinalda
locação),bemcomoovalorporhoraeovalordiáriode locação.Oprograma
deveentãogerar anotadepagamento (contendovalorda locação, valordo
impostoe valor total dopagamento) e informar os dados na tela. Vejaos
exemplos.*/