import java.util.Scanner;

public class WHILE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.println("Digite um número (negativo para sair): ");
        numero = sc.nextInt(); 
        
        while (numero >= 0) { // Permite somar o número 0 também
            soma = soma + numero; // Soma o número positivo

            System.out.println("Digite outro número (negativo para sair): ");
            numero = sc.nextInt(); // Lê um novo número
        }
        
        System.out.printf("A soma é: %d%n", soma);
        sc.close();
    }
}
//Exercício com while - Soma de Números Positivos
//Crie um programa que peça números ao usuário repetidamente e some-os. 
//O programa deve parar quando o usuário digitar um número negativo. 
//No final, exiba a soma dos números positivos digitados.