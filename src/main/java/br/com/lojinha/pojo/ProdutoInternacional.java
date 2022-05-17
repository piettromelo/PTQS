package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

public class ProdutoInternacional extends Produto {
    private double taxaDeImportacao;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getTaxaDeImportacao() {
        return this.taxaDeImportacao;
    }

    public void setTaxaDeImportacao(double taxaDeImportacao) {
        this.taxaDeImportacao = taxaDeImportacao;
    }

}
