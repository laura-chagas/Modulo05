package Ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcularNumerosTest {

    @Test
    public void verificaSeONumeroEPar(){

        CalcularNumeros calc = new CalcularNumeros();

         boolean num = calc.verificarNumero(4);

        assertEquals(true, num);
    }
}
