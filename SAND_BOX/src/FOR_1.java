import java.util.Scanner;

public class FOR_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero : ");
		int N = sc.nextInt();
		
		for (int i = 0; i <N; i++)
		{
			if (i%2==0) 
			{
				System.out.println(i);
			}
		}
	}

}
