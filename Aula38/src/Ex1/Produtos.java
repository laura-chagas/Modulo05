package Ex1;

import java.math.BigDecimal;

public class Produtos {
    String nomeProduto;
    BigDecimal preco;

    public Produtos(String nomeProduto, BigDecimal preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void comprarProduto(Produtos produto, BigDecimal precoMenor){
        if (produto.getPreco().equals(precoMenor)){
            System.out.println("Compra Efetuada");
        }else {
            System.out.println("Não foi possível efetuar a compra");
        }

    }
}
