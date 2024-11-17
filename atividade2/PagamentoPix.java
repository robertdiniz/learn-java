package atividade2;

public class PagamentoPix implements Pagamento {

    @Override
    public boolean processarPagamento(double valor){
        System.out.println("Pagando via Pix no valor de R$" + valor);
        return true;
    }

}
