package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    //criando atributo
    private String nome;
    private String marca;
    private double valor;
    private Tamanho tamanho;
    //private String itensInclusos;
    private List<ItemIncluso> itensInclusos;

    //Construtor
    //Este construtor setou valor fixo em dois atributos: marca e tamanho(valores ficam na classe LojinhaApp)
    public Produto(String marcaInicial, Tamanho tamanhoInicial) { //constutor: definir comandos que serao iniciados durante a instanciacao
        this.marca = marcaInicial; //definindo que a marca será o valor fixo = Sony
        this.tamanho = tamanhoInicial;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double novoValor) {
        if (novoValor >= 0) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0"); //informa que valor é inválido
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho novoTamanho) {
        //if (novoTamanho.equalsIgnoreCase("Pequeno") || novoTamanho.equalsIgnoreCase("Medio") || novoTamanho.equalsIgnoreCase("Grande")) {
        this.tamanho = novoTamanho;
        //} else {
            //throw new IllegalArgumentException("Este campo aceita apenas os valores Pequeno,Medio ou Grande");
        //}
    }


    public List<ItemIncluso> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> novostensInclusos) {
        this.itensInclusos = novostensInclusos;
    }
}
