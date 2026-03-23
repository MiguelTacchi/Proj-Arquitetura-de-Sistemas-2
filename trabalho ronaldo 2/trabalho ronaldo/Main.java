import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CAIXA DE PAGAMENTO ===");
        System.out.println("1 - Crédito");
        System.out.println("2 - PIX");
        System.out.println("3 - Dinheiro");
        System.out.println("4 - Débito");
        System.out.print("Escolha: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Valor da compra: R$ ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        String data = "09/03/2026";

        Pagamento pagamento = PagamentoFactory.criarPagamento(opcao, valor, data, scanner);

        if (pagamento == null) {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.println();
        pagamento.realizarPagamento();

        System.out.println();
        pagamento.exibirComprovante();

        scanner.close();
    }
}