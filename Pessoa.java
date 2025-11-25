import java.util.Scanner;

public class Pessoa {
    // Atributos
    String nome;
    int idade;

    // Método para apresentar a pessoa
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e eu tenho " + idade + " anos.");
    }

    // Método para aniversariar (incrementar a idade)
    public void aniversariar() {
        idade++;
        System.out.println("Feliz aniversário! Agora você tem " + idade + " anos.");
    }

    // Método principal para rodar a classe Pessoa
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa();

        // Pedindo para o usuário digitar o nome
        System.out.print("Digite seu nome: ");
        pessoa.nome = scanner.nextLine();

        // Pedindo para o usuário digitar a idade
        System.out.print("Digite sua idade: ");
        pessoa.idade = scanner.nextInt();

        // Chamando o método para apresentar a pessoa
        pessoa.apresentar();

        // Chamando o método para aniversariar a pessoa
        pessoa.aniversariar();

        scanner.close();
    }
}

