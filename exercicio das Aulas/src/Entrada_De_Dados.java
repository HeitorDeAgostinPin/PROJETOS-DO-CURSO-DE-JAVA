import java.util.Scanner;
import java.util.Locale;

public class Entrada_De_Dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Locale.setDefault(Locale.US);
       
		Scanner sc = new Scanner(System.in);
        
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados :");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		
		
		
		
		
		// String x;
		// x = sc.next();
		// System.out.println("Voce digitou: " + x);
		// sc.close();

		//int x;
		//x = sc.nextInt();
	    //System.out.println("Voce digitou: " + x);
		//sc.close();
		
		
		 //double x;
		 //x = sc.nextDouble();
		 //System.out.println("Voce digitou: " + x);
		 //sc.close();
		
		 //char x;
		 //x = sc.next().charAt(0);
		 //System.out.println("Voce digitou: " + x);
		 //sc.close();
		
		
		
	}
	


}
