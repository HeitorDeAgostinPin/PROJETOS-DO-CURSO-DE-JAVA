
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age  = 30;
		int code  = 5290;
		char gender = 'F';
		
		double price1 =2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		
		System.out.println("Products");
		System.out.printf("%s,wich price is $ %.2f ", product1,price1);
		System.out.printf("%s,wich price is $ %.2f ", product2,price2);
		
		
		System.out.println("Record :");
		System.out.printf("Meause with eitht decimal places : %.2f", measure);
		System.out.printf("Rounded (three decimal places): %.3f",measure);


	}

}
