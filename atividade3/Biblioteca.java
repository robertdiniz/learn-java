package atividade3;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Publicacao> {

    private List<T> publicacoes;

    public Biblioteca() {
        this.publicacoes = new ArrayList<>();
    }

    public void adicionarPublicacao(T publicacao){
        publicacoes.add(publicacao);
    }

    public void removerPublicacao(T publicacao){
        if(publicacoes.remove(publicacao)){
            System.out.println("Publicação removida!");
        } else {
            System.out.println("Publicação já foi removida!");
        }
    }

    public void listarPublicacoes(){
        for(T publicacao : publicacoes){
            System.out.println(publicacao.obterResumo());
        }
    }

}
