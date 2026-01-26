import java.util.Scanner;

public class FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercício com for - Tabuada
		//Peça ao usuário para digitar um número 
		//e exiba a tabuada dele de 1 a 10 usando um loop for.
		
		Scanner sc = new Scanner(System.in);
		// Solicita um número ao usuário
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = sc.nextInt();

        // Loop for para exibir a tabuada de 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }

        sc.close();
	
	
	
	}

}
