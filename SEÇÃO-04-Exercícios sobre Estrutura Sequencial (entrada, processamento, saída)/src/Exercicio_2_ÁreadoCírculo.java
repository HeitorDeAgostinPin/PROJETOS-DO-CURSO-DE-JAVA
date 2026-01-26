import java.util.Scanner;
import java.util.Locale;
public class Exercicio_2_ÁreadoCírculo {
//Área do Círculo – Calcular e exibir a área de um círculo a partir do raio.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um programa para ler o valor do raio de um círculo,
		//e depois mostrar o valor da área deste círculo com quatro 
		//casas decimais conforme exemplos.
		//Fórmula da área: area = π . raio2
		//Considere o valor de π = 3.14159
		
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float pi = 3.14159f;
		
		float raio;
		 System.out.println("Digite o Raio do circulo");
		 raio = sc.nextFloat();
		 
		 float raioelevado;
		 
		float areadocirculo;
		
		raioelevado =(float) (Math.pow(raio, 2));
		
		areadocirculo = (float) (pi*raioelevado);
		
		System.out.printf("A Área do Circulo é %f", areadocirculo);
		sc.close();
		
	}

}
