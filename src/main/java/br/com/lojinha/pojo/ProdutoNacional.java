package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

//extends: Inf q vai herdar de alguma classe, no caso "Produto"
public class ProdutoNacional extends Produto {

    private double impostoNacional; //criando atributo do tipo double e criar encapsulamento(private)

    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);

    }

    public double getImpostoNacional() {
        return this.impostoNacional;
    }

    public void setImpostoNacional(double impostoNacional) {
        this.impostoNacional = impostoNacional;
    }
}
