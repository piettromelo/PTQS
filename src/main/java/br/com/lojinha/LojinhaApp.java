package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) { //psvm
        Produto meuProduto = new Produto("Nestle", Tamanho.MEDIO);
        //System.out.println(meuProduto.getMarca());

        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(30);
        meuProduto.setMarca("PMELO"); //n precisa mais pq o construtor foi criado passando o parametro obrigatório fixo na classe Produto
        //meuProduto.setMarca("Sony"); -> não precisa mais usar pq foi definido no construtor
        //se quiser usar um valor direrente, ai sim precisa definir um outro "SET". Exemplo ABAIXO:
        //meuProduto.setMarca("JL"); <- Se usar esse SET, o getMarca vai usar esse como principal

        //package "enums" criada para estabelecer os valores
        //meuProduto.setTamanho(Tamanho.GRANDE); // ñ precisa mais desse trecho pois criamos um construtor na Classe Produto, e informamos o valor fixo do tamanho

        //Criar uma variável do tipo list de string
        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle",2);
        //primeiroItemIncluso.setNome("Controle");-> Forma antiga antes do construtor "ItemIncluso" dentro da classe "ItemIncluso"
        //primeiroItemIncluso.setQuantidade(2); -> Formca antiga antes do construtor "ItemIncluso" dentro da classe "ItemIncluso"
        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogo",3);
        //segundoItemIncluso.setNome("Jogo"); Forma antiga sem construtor criado na classe ItemIncluso
        //segundoItemIncluso.setQuantidade(3); Forma antiga sem construtor criado na classe ItemIncluso
        itensInclusos.add(segundoItemIncluso);

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabo de energia", 2);
        //terceiroItemIncluso.setNome("Cabo de energia"); Forma antiga sem construtor criado na classe ItemIncluso
        //terceiroItemIncluso.setQuantidade(2); Forma antiga sem construtor criado na classe ItemIncluso
        itensInclusos.add(terceiroItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);




        //size=> retorna qtd itens lista/get=>retorna o item de acordo com a posição passada no índice
//        System.out.println(meuProduto.getItensInclusos().get(0));
//        System.out.println(meuProduto.getTamanho());
//        System.out.println(meuProduto.getMarca()); //o valor da marca foi definido no construtor
//        System.out.println(meuProduto.getValor());

        //retorne o nome que está na lista de itens inclusos do meu produto
/*      System.out.println(meuProduto.getItensInclusos().get(0).getNome());
        System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());
        System.out.println(meuProduto.getItensInclusos().get(1).getNome());
        System.out.println(meuProduto.getItensInclusos().get(1).getQuantidade());
        System.out.println(meuProduto.getItensInclusos().get(2).getNome());
        System.out.println(meuProduto.getItensInclusos().get(2).getQuantidade());

        Este bloco de impressão, foi substituido pelo "FOR" abaixo:
        */

        //Estrutura FOR(LAÇO) para imprimir todos os produtos de uma lista
        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        System.out.println("Itens finalizados");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.55789);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        //importando das classes e instanciando
        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Jogo", Tamanho.GRANDE);
        meuProdutoInternacional.setTaxaDeImportacao(0.73020);
        System.out.println(meuProdutoInternacional.getTaxaDeImportacao());

    }

}
