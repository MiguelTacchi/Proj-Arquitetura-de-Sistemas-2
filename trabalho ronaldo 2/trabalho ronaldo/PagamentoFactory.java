import java.util.Scanner;

public class PagamentoFactory {

    public static Pagamento criarPagamento(int opcao, double valor, String data, Scanner scanner) {

        switch (opcao) {

            case 1:
                System.out.print("Nome do titular: ");
                String nomeCredito = scanner.nextLine();

                System.out.print("Número do cartão: ");
                String numeroCredito = scanner.nextLine();

                System.out.print("Parcelas: ");
                int parcelas = scanner.nextInt();
                scanner.nextLine();

                double juros = (parcelas > 4) ? parcelas * 1.5 : 0;

                return new CartaoCredito(valor, data, numeroCredito, nomeCredito, parcelas, juros);

            case 2:
                return new Pix(valor, data);

            case 3:
                System.out.print("Valor recebido: ");
                double recebido = scanner.nextDouble();
                scanner.nextLine();

                return new Dinheiro(valor, data, recebido);

            case 4:
                System.out.print("Nome do titular: ");
                String nomeDebito = scanner.nextLine();

                System.out.print("Número do cartão: ");
                String numeroDebito = scanner.nextLine();

                return new CartaoDebito(valor, data, numeroDebito, nomeDebito);

            default:
                return null;
        }
    }
}