import java.util.Scanner;

public class Exercicio_4_DuraçãodoJogo {
//Duração do Jogo – Calcular o tempo de duração de um jogo baseado na hora inicial e final.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Leia a hora inicial e a hora final de um jogo.
		// A seguir calcule a duração do jogo, sabendo que o mesmo pode
		// começar em um dia e terminar em outro,
		// tendo uma duração mínima de 1 hora e máxima de 24 horas.

		Scanner sc = new Scanner(System.in);
		
		int horainicial = sc.nextInt(),
		    horafinal = sc.nextInt();
		int duração;
		
		
		System.out.println("Informe a hora em que o jogo se iniciou : ");
		System.out.println("Informe a hora em que o jogo finalizou:  ");
		
		if (horafinal > horainicial) 
		{ 
		    duração = horafinal - horainicial;  
		} else if (horafinal < horainicial) 
		{ 
		    duração = (24 - horainicial) + horafinal; 
		} else 
		{ 
		    duração = 24;  
		}

		System.out.printf("O Jogo durou: %d horas%n", duração);

        sc.close();
	}

}
