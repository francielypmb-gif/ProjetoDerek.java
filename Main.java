import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um objeto da classe ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria();

        // Criar Scanner para receber entradas do usuário
        Scanner scanner = new Scanner(System.in);

        int opcao;
        
        // Menu de opções
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Ver Saldo");
            System.out.println("4 - Sair");

            // Lê a opção do usuário
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // Depósito
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = scanner.nextDouble();
                    minhaConta.depositar(deposito);
                    break;
                
                case 2: // Saque
                    System.out.print("Digite o valor para saque: ");
                    double saque = scanner.nextDouble();
                    minhaConta.sacar(saque);
                    break;
                
                case 3: // Ver Saldo
                    minhaConta.verSaldo(); // Exibe o saldo atual
                    break;

                case 4: // Sair
                    System.out.println("Saindo do sistema...");
                    break;

                default: // Opção inválida
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 4); // O loop continua até o usuário escolher a opção 4 (sair)

        scanner.close();
    }
}
