import java.util.Scanner;
import java.util.UUID;

public class Pix extends Pagamento {

    private String chavePix;

    public Pix(double valor, String data) {
        super(valor, data);
        this.chavePix = UUID.randomUUID().toString();
    }

    @Override
    public void realizarPagamento() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PAGAMENTO VIA PIX ===");
        System.out.println("Valor: R$ " + String.format("%.2f", valor));

        System.out.println("\nChave PIX gerada:");
        System.out.println(chavePix);

        System.out.println("\nCopie e cole a chave abaixo para confirmar:");
        System.out.print("Cole aqui: ");

        String chaveDigitada = scanner.nextLine();

        if (chaveDigitada.equals(chavePix)) {
            System.out.println("Pagamento confirmado!");
        } else {
            System.out.println("Chave incorreta. Pagamento não confirmado.");
        }
    }
}