import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;

        // Ler 5 números e encontrar o maior
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        // Imprimir o maior número
        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
