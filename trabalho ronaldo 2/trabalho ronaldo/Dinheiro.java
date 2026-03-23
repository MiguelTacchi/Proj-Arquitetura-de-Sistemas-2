public class Dinheiro extends Pagamento {

    private double valorRecebido;

    public Dinheiro(double valor, String data, double valorRecebido) {
        super(valor, data);
        this.valorRecebido = valorRecebido;
    }

    public double calcularTroco() {
        return valorRecebido - valor;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento em Dinheiro");
        System.out.println("Recebido: R$ " + String.format("%.2f", valorRecebido));
        System.out.println("Troco: R$ " + String.format("%.2f", calcularTroco()));
    }
}