import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir um número ao usuário
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificar se é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        scanner.close();
    }
}
