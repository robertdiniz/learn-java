package atividade2;

public class PagamentoCartao implements Pagamento{

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagando via Cartão no valor de R$" + valor);
        return true;
    }
}
