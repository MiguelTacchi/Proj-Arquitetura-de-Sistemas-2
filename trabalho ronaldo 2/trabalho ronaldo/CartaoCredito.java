public class CartaoCredito extends Pagamento {

    private String numeroCartao;
    private String nomeTitular;
    private int quantidadeParcelas;
    private double taxaJuros;

    public CartaoCredito(double valor, String data, String numeroCartao,
                         String nomeTitular, int quantidadeParcelas, double taxaJuros) {
        super(valor, data);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.quantidadeParcelas = quantidadeParcelas;
        this.taxaJuros = taxaJuros;
    }

    public double calcularValorTotal() {
        return valor + (valor * taxaJuros / 100);
    }

    public double calcularValorParcela() {
        return calcularValorTotal() / quantidadeParcelas;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento com Cartão de Crédito");
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Parcelas: " + quantidadeParcelas);
        System.out.println("Juros: " + taxaJuros + "%");
        System.out.println("Total: R$ " + String.format("%.2f", calcularValorTotal()));
        System.out.println("Parcela: R$ " + String.format("%.2f", calcularValorParcela()));
    }
}