package application;

import java.util.Scanner;
import entities.Funcionario;

public class Olerite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Informe o Seu Nome: ");
        funcionario.Name = sc.next();

        System.out.println("Informe Seu Salário Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.println("Qual a Taxinha do Amor? ");
        funcionario.taxinhaDoAmor = sc.nextDouble();

        // Exibe os dados do funcionário
        System.out.println(funcionario.toString());

        System.out.println("Qual a porcentagem de aumento no salário? ");
        double porcentagem = sc.nextDouble();

        // Aplica o aumento no salário
        funcionario.AumentarSalario(porcentagem);

        // Exibe o salário atualizado
        System.out.printf("O salário com o bônus é de: %.2f Reais%n", funcionario.SalarioLiquido());

        sc.close();
    }
}
