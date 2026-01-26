import java.util.Scanner;

public class Soma_dos_N_Primeiros_Números__Com__FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Digite um numero: ");
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) 
        {
        	soma += i;
		}
        System.out.println("A soma dos primeiros " + N + " números é: " + soma);
        
        sc.close();
	}

}
