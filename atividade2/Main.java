package atividade2;

public class Main {
    public static void main(String[] args){
        Eletronico produto1 = new Eletronico(1, "SSD", 18.5);
        Vestuario produto2 = new Vestuario(1, "Short", 25.95);
        PagamentoCartao maquininha1 = new PagamentoCartao();
        PagamentoPix qrcode = new PagamentoPix();

        System.out.println("Pagando Eletronico: " + produto1.nome);
        double precoComDesconto = produto1.preco - produto1.calcularDesconto();

        maquininha1.processarPagamento(precoComDesconto);

        System.out.println("Pagando Vestuario: " + produto2.nome);
        precoComDesconto = produto2.preco - produto2.calcularDesconto();

        qrcode.processarPagamento(precoComDesconto);
    }
}
