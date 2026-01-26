import java.util.Scanner; // Importa a classe Scanner para entrada de dados

// Definição da classe Pessoa
class Pessoa {
    // Atributos (características da classe)
    String nome;
    int idade;

    // Construtor que recebe os valores do usuário
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir informações da pessoa
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }

    // Método para verificar se a pessoa é maior de idade
    public boolean ehMaiorDeIdade() {
        return idade >= 18; // Retorna true se a idade for 18 ou mais
    }
}

// Classe principal
public class Metodos_Classes_Atributos_Contrutures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        // Pedindo os dados do usuário
        System.out.print("Digite o nome da pessoa: ");
        String nome = sc.nextLine(); // Lê o nome completo
        
        System.out.print("Digite a idade da pessoa: ");
        int idade = sc.nextInt(); // Lê a idade

        // Criando um objeto da classe Pessoa com os valores fornecidos pelo usuário
        Pessoa pessoa = new Pessoa(nome, idade);

        // Chamando os métodos da classe
        pessoa.exibirInfo();
        System.out.println("É maior de idade? " + pessoa.ehMaiorDeIdade());

        sc.close(); // Fechando o Scanner para evitar vazamento de recursos
    }
}
