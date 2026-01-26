import java.util.Scanner;

public class Exercicio_7_LocalizaçãonoPlanoCartesiano {
    // Localização no Plano Cartesiano – Identificar o quadrante de um ponto ou se ele está na origem/eixos.

	
	//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
	//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
	//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
	//Se o ponto estiver na origem, escreva a mensagem “Origem”.
	//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
	//situação
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        double x = sc.nextDouble();

        System.out.println("Digite o valor de Y:");
        double y = sc.nextDouble();

        if (x == 0 && y == 0) { 
            System.out.println("Origem"); 
        } else if (x == 0) { 
            System.out.println("Eixo Y"); 
        } else if (y == 0) { 
            System.out.println("Eixo X"); 
        } else if (x > 0 && y > 0) { 
            System.out.println("Está no Quadrante Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Está no Quadrante Q2");
        } else if (x < 0 && y < 0) { 
            System.out.println("Está no Quadrante Q3");
        } else { 
            System.out.println("Está no Quadrante Q4");
        }

        sc.close();
    }
}
