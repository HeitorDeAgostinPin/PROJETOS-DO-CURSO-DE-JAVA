import java.util.Scanner;

public class Tabuada_de_um_Número__Com__FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int tabuada ;
		
		System.out.println("Digite o numero que voçe deseja ver a tabuada");
		numero = sc.nextInt();
		
		for (int i = 0; i < 100; i++) 
		{   tabuada = numero*i;
			System.out.printf("%d X %d = %d %n", numero,i,tabuada);
		}

	}

}
