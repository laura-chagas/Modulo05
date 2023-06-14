package Ex1;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutosTest {
    BigDecimal precoMenor = new BigDecimal("1.50");

    @Test
    public void VerificarSeOPrimeiroProdutoEOMaisBarato(){

        Produtos prod1 = new Produtos("Lápis", new BigDecimal("1.50"));

        prod1.comprarProduto(prod1, precoMenor);
        assertEquals(precoMenor, prod1.getPreco());
    }

    @Test
    public void VerificarSeOSegundoProdutoEOMaisBarato(){
        Produtos prod2 = new Produtos("Borracha", new BigDecimal("2.50"));
        prod2.comprarProduto(prod2, precoMenor);
        assertEquals(precoMenor, prod2.getPreco());
    }

    @Test
    public void VerificarSeOTerceiroProdutoEOMaisBarato(){
        Produtos prod3 = new Produtos("Apontador", new BigDecimal("3.50"));
        prod3.comprarProduto(prod3, precoMenor);
        assertEquals(precoMenor, prod3.getPreco());
    }


}
