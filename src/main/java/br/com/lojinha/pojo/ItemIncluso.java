package br.com.lojinha.pojo;

public class ItemIncluso {
    private String nome;
    private int quantidade;

    //Construtor -> ajudou a diminuir a qtd de linhas de códigos para definir nome e qtd
        //no ArreyList ItemIncluso da classe LojinhaApp
    public ItemIncluso(String nomeInicial, int quantidadeInicial){
        this.nome = nomeInicial;
        this.quantidade = quantidadeInicial;

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
