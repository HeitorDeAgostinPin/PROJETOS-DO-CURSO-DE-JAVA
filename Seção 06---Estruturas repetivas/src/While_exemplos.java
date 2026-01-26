import java.util.Scanner;
//Fazer um programa que lê números
//inteiros atéqueumzero seja lido. Ao
//finalmostraasomadosnúmeroslidos.
public class While_exemplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("A soma dos números lidos é: " + soma);
        scanner.close();
    }
}
