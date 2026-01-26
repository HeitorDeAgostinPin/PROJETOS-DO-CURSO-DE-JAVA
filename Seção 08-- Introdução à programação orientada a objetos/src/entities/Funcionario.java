package entities;

public class Funcionario {

    public String Name;
    public double salarioBruto;
    public double taxinhaDoAmor;

    // Método para calcular salário líquido
    public double SalarioLiquido() {
        return salarioBruto - taxinhaDoAmor;
    }

    // Método para aumentar o salário com base em uma porcentagem
    public void AumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * (porcentagem / 100);
    }

    // Método toString para exibir os dados do funcionário
    public String toString() {
        return "Funcionário: " + Name 
            + "\nSalário Bruto: " + String.format("%.2f", salarioBruto) 
            + "\nTaxinha do Amor: " + String.format("%.2f", taxinhaDoAmor) 
            + "\nSalário Líquido: " + String.format("%.2f", SalarioLiquido());
    }
}

/*Atributos:
Name: string → Nome: string

GrossSalary: double → SalárioBruto: double

Tax: double → Imposto: double

Métodos:
NetSalary(): double → SalárioLíquido(): double

IncreaseSalary(percentage: double): void → AumentarSalário(porcentagem: double): void*/