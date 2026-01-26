import java.util.Scanner;

public class While_Contagem_Regressiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int contador = 10;
		
		while (contador>0) 
		{ contador--;
			System.out.printf("faltam %d segundos %n",contador);
		}
	sc.close();
	}

}
