package Ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {

    @Test
    public void depositarDinheiroNaConta(){
        ContaCorrente cc = new ContaCorrente(123,"Laura", 200);
        cc.depositoConta(400);
        Assertions.assertEquals(600, cc.getSaldo());
    }
    @Test
    public void tentarSacarDinheiroNaConta(){
        ContaCorrente cc = new ContaCorrente(456, "Joe", 0);
        cc.saqueConta(660);
        Assertions.assertEquals(0, cc.getSaldo());
    }
}
