package Model.Aplicação;

import java.util.Locale;
import java.util.Scanner;

import Model.Serviços.BrazilInterestService;
import Model.Serviços.USAnterestService;

public class Fazer_Emprestimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Amount: ");
		double amount = sc.nextDouble();
		System.out.println("Months: ");
		int months = sc.nextInt();
		
		//BrazilInterestService is =  new BrazilInterestService(2.0);
		USAnterestService is =  new USAnterestService(1.0);
		double payment = is.payment(amount, months);
		
		

		
		System.out.println("Paymente after " + months + "months");
		System.out.println(String.format("%.2f", payment));
		
		
		
		sc.close();
	}

}
/*Fazerumprogramaparalerumaquantiaeaduraçãoemmesesdeum
empréstimo. Informarovaloraserpagodepoisdedecorridooprazodo
empréstimo, conformeregrasdejurosdoBrasil.Aregradecálculode
jurosdoBrasiléjurocompostopadrãode2%aomês */