import java.util.Locale;
import java.util.Scanner;

public class Dolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a atual cotação do Dolar? ");
		Conversor.cotacaoDolar = sc.nextDouble();
		
		System.out.println("Qunatos Dolares você pretente comprar?");
		Conversor.qtdDolar = sc.nextDouble();
		
		System.out.printf("A quantidade em Reais que devera sem paga é de %.2f%n",Conversor.DolarParaReal());

	sc.close();
	}

}
